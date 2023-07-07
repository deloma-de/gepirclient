package de.deloma.tools.gepir;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.gepir.CommunicationChannelCodeType;
import org.gepir.Router;

import ch.ean.gepir.GepirSoapHandler;

/**
 * Gs1 Gepir Client connection class
 *
 * @author Florian Keller 2014, Marco Janc 2014 - 2021
 */
public abstract class AGepirClient
{
	private final static Logger logger = Logger.getLogger(AGepirClient.class.getName());

	protected final static int RETURN_CODE_SUCCESS = 0;
	protected final static int RETURN_CODE_MULTIPLE_RESULTS = 3;
	protected final static int RETURN_CODE_RECONNECT = 14;

	protected final static int GTIN_LENGTH_MAX = 14;

	/**
	 * authentication GLN for requests
	 */
	protected final String requesterGln;

	/**
	 * Cascade level
	 */
	protected final int cascade;

	/**
	 * List of GLN's of Company's that shall be ignored and null returned on
	 * retrieval methods.
	 */
	protected final String[] ignoreGLNs;

	/**
	 * Creates a new GepirClient using the given requester GLN and cascade
	 * level.<br>
	 * Creates a new {@link Router} instance so this constructor so any
	 * exceptions resulting from down services shall be catched.
	 *
	 * @param requesterGln
	 * @param language Optional ISO 639-1 language code to use for request
	 * @param cascade Cascade level
	 * @param ignoreGLNs List of GLN's of Company's that shall be ignored and
	 *            null returned on retrieval methods.
	 *
	 * @see GepirSoapHandler#GepirSoapHandler(String, Integer)
	 */
	public AGepirClient(final String requesterGln, final String language, final int cascade, final String... ignoreGLNs)
	{
		this.requesterGln = requesterGln;
		this.ignoreGLNs = ignoreGLNs;
		this.cascade = cascade;

		this.init(language);
	}

	/**
	 * Initializes this GepirClient
	 *
	 * @param requesterGln
	 * @param language Optional ISO 639-1 language code to use for request
	 * @param cascade
	 * @param ignoreGLNs List of GLN's of Company's that shall be ignored and
	 *            null returned on retrieval methods.
	 */
	protected abstract void init(String languages);

	/**
	 * Retrieves a Company instance of the manufacturer or vendor that is
	 * responsible of the item with the given GTIN.
	 *
	 * @param gtin
	 * @return
	 * @throws GepirResponseException
	 */
	public abstract GepirCompany getCompanyByGtin(String gtin) throws GepirResponseException;

	/**
	 * Retrieves a Company instance of the manufacturer defined by the given
	 * GTIN.
	 *
	 * @param gln
	 * @return
	 * @throws GepirResponseException
	 */
	public abstract GepirCompany getCompanyByGln(String gln) throws GepirResponseException;

	/*
	 * utils
	 */

	/**
	 * Set communication Channel of Company
	 *
	 * @param company
	 * @param channelType
	 */
	protected static void setCommunicationChannel(final GepirCompany company, final String value,
		final CommunicationChannelCodeType type)
	{
		if (Utils.isBlank(value))
			return;

		switch (type)
		{
			case WEBSITE:
				company.setUrl(value);
				break;
			case EMAIL:
				company.setEmail(value);
				break;
			case TELEPHONE:
				company.setPhone(value);
				break;
			case TELEFAX:
				company.setFax(value);
				break;
		}
	}

	protected static void setCommunicationChannel(final GepirCompany company, final String value, final String strType)
	{
		try
		{
			final CommunicationChannelCodeType type = CommunicationChannelCodeType.valueOf(strType);

			AGepirClient.setCommunicationChannel(company, value, type);
		}
		catch (final Exception e)
		{
			AGepirClient.logger.log(Level.WARNING,
				"could not convert: " + strType + " to " + CommunicationChannelCodeType.class.getName());
		}
	}
}