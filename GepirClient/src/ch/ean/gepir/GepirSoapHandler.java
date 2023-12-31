package ch.ean.gepir;

import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.gepir.GepirRequestHeader;
import org.gepir.ObjectFactory;

/**
 * Gepir response header
 *
 * @author Marco Janc (c) 2014
 */
public class GepirSoapHandler implements SOAPHandler<SOAPMessageContext>
{
	private final JAXBElement<GepirRequestHeader> requestHeader;

	/**
	 * Creates a new Gepir soap handler using the given requester GLN and cascade level.
	 *
	 * @param requesterGln Requester GLN (API-key)
	 * @param cascade [0-9] optional cascade level defining how many GS1 servers will be contacted until a response is
	 *            retrieved. Input is bound to range. If out of range 9 is used.
	 */
	public GepirSoapHandler(final String requesterGln, int cascade)
	{
		if (requesterGln == null)
			throw new IllegalArgumentException("requesterGln");

		final GepirRequestHeader header = new GepirRequestHeader();

		if (cascade < 0)
			cascade = 9;
		header.setCascade(Math.min(cascade, 9));
		header.setRequesterGln(requesterGln);

		this.requestHeader = new ObjectFactory().createGepirRequestHeader(header);
	}

	@Override
	public boolean handleMessage(final SOAPMessageContext context)
	{
		final boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (!isRequest)
			return true;

		try
		{
			final SOAPMessage soapMessage = context.getMessage();
			final SOAPEnvelope soapEnv = soapMessage.getSOAPPart().getEnvelope();
			SOAPHeader soapHeader = soapEnv.getHeader();

			if (soapHeader == null)
				soapHeader = soapEnv.addHeader();
			// TODO return if gepir already added!

			final JAXBContext jaxbContext = JAXBContext.newInstance(GepirRequestHeader.class);
			final Marshaller marshaller = jaxbContext.createMarshaller();

			marshaller.marshal(this.requestHeader, soapHeader);

			return true;
		}
		catch (final SOAPException | JAXBException e)
		{
			return false;
		}
	}

	@Override
	public boolean handleFault(final SOAPMessageContext context)
	{
		return false;
	}

	@Override
	public void close(final MessageContext context)
	{
	}

	@Override
	public Set<QName> getHeaders()
	{
		return null;
	}
}