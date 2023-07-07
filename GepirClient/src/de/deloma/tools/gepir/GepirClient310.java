package de.deloma.tools.gepir;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;

import org.gepir.ArrayOfLanguage;
import org.gepir.CommunicationChannelType;
import org.gepir.GepirParty;
import org.gepir.GetPartyByGLN;
import org.gepir.GetPartyByGTIN;
import org.gepir.PartyContactType;
import org.gepir.PartyDataLineType;
import org.gepir.Router;
import org.gepir.RouterSoap;

import ch.ean.gepir.GepirSoapHandler;

/**
 * Gs1 Gepir Client connection class
 *
 * @author Florian Keller (c) 2014, Marco Janc (c) 2014 - 2016
 */
public class GepirClient310 extends AGepirClient
{
	private final static BigDecimal VERSION = new BigDecimal("310");

	/**
	 * Cached gepir service
	 */
	private final Router router;
	private ArrayOfLanguage languages = new ArrayOfLanguage();

	/**
	 * Creates a new GepirClient using the given requester GLN and cascade
	 * level.<br>
	 * Creates a new {@link Router} instance so this constructor so any
	 * exceptions resulting from down services shall be catched.
	 *
	 * @param requesterGln
	 * @param languages Optional ISO 639-1 language codes to use for request
	 * @param cascade
	 * @param ignoreGLNs List of GLN's of Company's that shall be ignored and
	 *            null returned on retrieval methods.
	 *
	 * @see GepirSoapHandler#GepirSoapHandler(String, Integer)
	 */
	public GepirClient310(	final String requesterGln, final String language, final int cascade,
							final String... ignoreGLNs)
	{
		super(requesterGln, language, cascade, ignoreGLNs);

		this.router = new Router();

		// or use @HandlerChain(file = "handlers.xml")
		this.router.setHandlerResolver(portInfo -> {
			final List<Handler> handlers = new ArrayList<Handler>();
			final GepirSoapHandler soapHandler = new GepirSoapHandler(requesterGln, cascade);
			handlers.add(soapHandler);
			return handlers;
		});
	}

	@Override
	public void init(final String language)
	{
		if (language != null)
		{
			if (this.languages == null)
				this.languages = new ArrayOfLanguage();
			this.languages.getLanguage().add(language); // "DE"
		}
	}

	@Override
	public GepirCompany getCompanyByGtin(final String gtin) throws GepirResponseException
	{
		final GetPartyByGTIN getPartyByGTIN = new GetPartyByGTIN();
		getPartyByGTIN.setRequestedLanguages(this.languages);
		getPartyByGTIN.setVersion(GepirClient310.VERSION);
		getPartyByGTIN.getRequestedGtin().add(gtin);

		return this.createCompanyByPartyDataLine(
			this.router.getRouterSoap().getPartyByGTIN(getPartyByGTIN).getPartyDataLine());
	}

	@Override
	public GepirCompany getCompanyByGln(final String gln) throws GepirResponseException
	{
		final GetPartyByGLN getPartyByGLN = new GetPartyByGLN();
		getPartyByGLN.setRequestedLanguages(this.languages);
		getPartyByGLN.setVersion(GepirClient310.VERSION);
		getPartyByGLN.getRequestedGln().add(gln);

		return this
			.createCompanyByPartyDataLine(this.router.getRouterSoap().getPartyByGLN(getPartyByGLN).getPartyDataLine());
	}

	/**
	 * Retrieves a valid Company from the given data. <br>
	 * <br>
	 * In case company has an invalid GCP, it is set to null.
	 *
	 * @see GepirCompany#isValidGcp()
	 *
	 * @param list
	 * @return
	 * @throws GepirResponseException Only purpose is to detect if maximum
	 *             request per day exceeded. Remove if premium account
	 *             available.
	 */
	private GepirCompany createCompanyByPartyDataLine(final List<PartyDataLineType> list) throws GepirResponseException
	{
		int returnCode = 0;
		PartyDataLineType partyDataLine = null;

		for (final PartyDataLineType partyDataLineType : list)
			if (partyDataLineType.getReturnCode() != null)
				if (partyDataLineType.getReturnCode().intValue() == AGepirClient.RETURN_CODE_SUCCESS)
				{
					partyDataLine = partyDataLineType;
					break;
				}
				else
					returnCode = partyDataLineType.getReturnCode().intValue();

		if (partyDataLine == null)
			if (returnCode == AGepirClient.RETURN_CODE_RECONNECT)
				throw new GepirResponseException(returnCode);
			else
				return null;

		// return null in case company is on ignore list
		if (Utils.contains(this.ignoreGLNs, partyDataLine.getGln()))
			return null;

		final GepirCompany result = new GepirCompany();
		result.setName(partyDataLine.getPartyName());
		result.getAddress().addAll(GepirClient310.createAddress(partyDataLine));
		result.setGcp(partyDataLine.getGcp());
		result.setGln(partyDataLine.getGln());

		// gepir data is not always correct, so set to null to pass validation
		// TODO maybe add parameter to toggle this correction off
		if (!result.isValidGcp())
			result.setGcp(null);

		for (final PartyContactType partyContact : partyDataLine.getContact())
			for (final CommunicationChannelType channelType : partyContact.getCommunicationChannel())
				AGepirClient.setCommunicationChannel(result, channelType.getValue(),
					channelType.getCommunicationChannelCode());

		return result;
	}

	private static List<String> createAddress(final PartyDataLineType partyDataLine)
	{
		final List<String> address = new ArrayList<>();

		for (final String addressLine : partyDataLine.getStreetAddress())
			address.add(addressLine);
		// optional po box number
		if (Utils.isNotBlank(partyDataLine.getPOBoxNumber()))
			address.add(partyDataLine.getPOBoxNumber());
		// optional division
		if (Utils.isNotBlank(partyDataLine.getSubDivision()))
			address.add(partyDataLine.getSubDivision());

		String postalcodeCity = "";
		// optional postalcode
		if (Utils.isNotBlank(partyDataLine.getPostalCode()))
			postalcodeCity = partyDataLine.getPostalCode() + " ";

		address.add(postalcodeCity + partyDataLine.getCity());
		address.add(partyDataLine.getCountryISOCode());

		return address;
	}

	public void test()
	{
		final RouterSoap routerSoap = this.router.getRouterSoap();

		System.out.println(routerSoap.helloWorld());

		final ArrayOfLanguage languages = new ArrayOfLanguage();
		languages.getLanguage().add("DE");

		final GetPartyByGLN getPartyByGLN = new GetPartyByGLN();
		getPartyByGLN.setRequestedLanguages(languages);
		getPartyByGLN.getRequestedGln().add("4260133690004");
		getPartyByGLN.setVersion(GepirClient310.VERSION);

		final GepirParty gepirParty = routerSoap.getPartyByGLN(getPartyByGLN);

		final PartyDataLineType partyDataLine = gepirParty.getPartyDataLine().get(0);

		System.out.println(partyDataLine.getGcp());
		System.out.println(partyDataLine.getPartyName());
	}
}