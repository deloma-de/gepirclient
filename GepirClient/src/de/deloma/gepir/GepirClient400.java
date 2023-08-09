package de.deloma.gepir;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Holder;

import org.gs1.ws.gepir.Gepir4XService;
import org.gs1.ws.gepir.Gepir4XService_Service;
import org.gs1.ws.gepir4.GetKeyLicensee;
import org.gs1.ws.gepir4.GetKeyLicenseeResponse;

import gs1.gepir.gepir_common.xsd._4.GepirRequestedKeyType;
import gs1.gepir.gepir_common.xsd._4.RequestedKeyCodeType;
import gs1.gepir.gepir_party.xsd._4.PartyDataLineType;
import gs1.gepir.get_key_licensee.xsd._4.GetKeyLicenseeType;
import gs1.gepir.request_header.xsd._4.RequestHeaderType;
import gs1.gepir.response_header.xsd._4.ResponseHeaderType;
import gs1.shared.shared_common.xsd._3.AddressType;
import gs1.shared.shared_common.xsd._3.CommunicationChannelType;
import gs1.shared.shared_common.xsd._3.ContactType;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;

/**
 * GS1 Gepir client v4
 *
 * @author Florian Keller 2017
 */
public class GepirClient400 extends AGepirClient
{
	private final Gepir4XService service;
	private LanguageCodeType lngType;

	public GepirClient400(	final String requesterGln, final String language, final int cascade,
							final String[] ignoreGLNs)
	{
		super(requesterGln, language, cascade, ignoreGLNs);
		this.service = new Gepir4XService_Service().getGepir4XPort();
	}

	@Override
	protected void init(final String language)
	{
		// TODO Auto-generated method stub
		if (language != null)
		{
			this.lngType = new LanguageCodeType();
			this.lngType.setValue(language);
		}
	}

	@Override
	public GepirCompany getCompanyByGtin(final String gtin) throws GepirResponseException
	{
		final RequestHeaderType header = this.CreateHeader();
		final GetKeyLicensee getKeyLicense = this.CreateRequest(gtin, GepirRequestedKeyTypeValue.GTIN);
		final Holder<GetKeyLicenseeResponse> resultKeyLicensee = new Holder<>(new GetKeyLicenseeResponse());
		final Holder<ResponseHeaderType> responseHeader = new Holder<>(new ResponseHeaderType());
		this.service.getKeyLicensee(getKeyLicense, header, resultKeyLicensee, responseHeader);
		return this.CreateCompany(resultKeyLicensee.value);
	}

	@Override
	public GepirCompany getCompanyByGln(final String gln) throws GepirResponseException
	{
		final RequestHeaderType header = this.CreateHeader();
		final GetKeyLicensee getKeyLicense = this.CreateRequest(gln, GepirRequestedKeyTypeValue.GLN);
		final Holder<GetKeyLicenseeResponse> resultKeyLicensee = new Holder<>(new GetKeyLicenseeResponse());
		final Holder<ResponseHeaderType> responseHeader = new Holder<>(new ResponseHeaderType());
		this.service.getKeyLicensee(getKeyLicense, header, resultKeyLicensee, responseHeader);

		return this.CreateCompany(resultKeyLicensee.value);
	}

	private GepirCompany CreateCompany(final GetKeyLicenseeResponse response) throws GepirResponseException
	{
		if (response == null)
			return null;

		int returnCode = AGepirClient.RETURN_CODE_SUCCESS;
		PartyDataLineType partyDataLine = null;

		for (final PartyDataLineType partyDataLineType : response.getGepirParty().getPartyDataLine())
		{
			final int dataLineReturnCode = Integer.parseInt(partyDataLineType.getReturnCode().getValue());

			// System.out.println(dataLineReturnCode);

			if (dataLineReturnCode == AGepirClient.RETURN_CODE_SUCCESS
				|| dataLineReturnCode == AGepirClient.RETURN_CODE_MULTIPLE_RESULTS)
			{
				partyDataLine = partyDataLineType;
				break;
			}
			else
				returnCode = dataLineReturnCode;
		}

		if (partyDataLine == null)
			if (returnCode == AGepirClient.RETURN_CODE_RECONNECT)
				throw new GepirResponseException(returnCode);
			else
				return null;

		// return null in case company is on ignore list
		if (Utils.contains(this.ignoreGLNs, partyDataLine.getGS1KeyLicensee().getGln()))
			return null;

		final GepirCompany result = new GepirCompany();

		result.setName(String.join(", ", partyDataLine.getGS1KeyLicensee().getPartyName()));
		result.getAddress().addAll(this.createAddress(partyDataLine.getAddress()));
		result.setGcp(partyDataLine.getGS1CompanyPrefix());
		result.setGln(partyDataLine.getGS1KeyLicensee().getGln());

		// gepir data is not always correct, so set to null to pass validation
		// TODO maybe add parameter to toggle this correction off
		if (!result.isValidGcp())
			result.setGcp(null);

		for (final ContactType contact : partyDataLine.getContact())
			for (final CommunicationChannelType channel : contact.getCommunicationChannel())
				AGepirClient.setCommunicationChannel(result, channel.getCommunicationValue(),
					channel.getCommunicationChannelCode().getValue());

		return result;
	}

	private List<String> createAddress(final AddressType address)
	{
		final List<String> result = new ArrayList<>();

		if (address == null)
			return result;

		if (Utils.isNotBlank(address.getStreetAddressOne()))
			result.add(address.getStreetAddressOne());
		if (Utils.isNotBlank(address.getStreetAddressTwo()))
			result.add(address.getStreetAddressTwo());
		if (Utils.isNotBlank(address.getStreetAddressThree()))
			result.add(address.getStreetAddressThree());

		// optional po box number
		if (Utils.isNotBlank(address.getPOBoxNumber()))
			result.add(address.getPOBoxNumber());
		// optional division. Not existing anymore
		// if (Utils.isNotBlank(address.getSubDivision()))
		// result.add(address.getSubDivision());

		String postalcodecity = "";

		// optional postalcode
		if (Utils.isNotBlank(address.getPostalCode()))
			postalcodecity = address.getPostalCode() + " ";

		result.add(postalcodecity + address.getCity());
		result.add(address.getCountryCode().getValue());

		return result;
	}

	private GetKeyLicensee CreateRequest(String value, final GepirRequestedKeyTypeValue valueType)
	{
		// GTIN must be 14 digits long
		if (valueType == GepirRequestedKeyTypeValue.GTIN)
			value = Utils.leftPad(value, AGepirClient.GTIN_LENGTH_MAX, '0');

		final RequestedKeyCodeType keyCodeType = new RequestedKeyCodeType();
		keyCodeType.setValue(valueType.toString());

		final GepirRequestedKeyType gepirRequestedKeyType = new GepirRequestedKeyType();

		// GTIN does not allows language request
		if (valueType != GepirRequestedKeyTypeValue.GTIN)
			gepirRequestedKeyType.setRequestedLanguage(this.lngType);

		gepirRequestedKeyType.setRequestedKeyCode(keyCodeType);
		gepirRequestedKeyType.setRequestedKeyValue(value);

		final GetKeyLicenseeType getKeyLicenseeType = new GetKeyLicenseeType();
		getKeyLicenseeType.getGetKeyLicensee().add(gepirRequestedKeyType);

		final GetKeyLicensee getKeyLicensee = new GetKeyLicensee();
		getKeyLicensee.setGetKeyLicensee(getKeyLicenseeType);
		return getKeyLicensee;
	}

	private RequestHeaderType CreateHeader()
	{
		final RequestHeaderType header = new RequestHeaderType();
		header.setCascade(this.cascade);
		header.setRequesterGLN(this.requesterGln);
		return header;
	}

	private enum GepirRequestedKeyTypeValue
	{
		GTIN,
		GLN
	}



}
