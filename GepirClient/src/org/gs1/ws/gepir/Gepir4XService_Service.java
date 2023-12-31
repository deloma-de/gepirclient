
package org.gs1.ws.gepir;

import java.io.IOException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "Gepir4xService", targetNamespace = "http://gepir.ws.gs1.org/", wsdlLocation = "http://localhost/gepir-v4.wsdl")
public class Gepir4XService_Service extends Service
{

	private final static URL GEPIR4XSERVICE_WSDL_LOCATION;
	private final static WebServiceException GEPIR4XSERVICE_EXCEPTION;
	private final static QName GEPIR4XSERVICE_QNAME = new QName("http://gepir.ws.gs1.org/", "Gepir4xService");

	static
	{
		URL url = null;
		WebServiceException e = null;
		try
		{
			// url = new URL("https://www.gepir.de/soap/gepir-v4");
			//
			// final URLConnection conn = url.openConnection();
			// final HttpURLConnection httpConn = (HttpURLConnection) conn;
			// httpConn.setInstanceFollowRedirects(true);

			final URL baseUrl = org.gs1.ws.gepir.Gepir4XService_Service.class.getResource(".");
			url = new URL(baseUrl, "http://localhost/gepir-v4.wsdl");
		}
		catch (final IOException ex)
		{
			e = new WebServiceException(ex);
		}
		GEPIR4XSERVICE_WSDL_LOCATION = url;
		GEPIR4XSERVICE_EXCEPTION = e;
	}

	public Gepir4XService_Service()
	{
		super(Gepir4XService_Service.__getWsdlLocation(), Gepir4XService_Service.GEPIR4XSERVICE_QNAME);
	}

	public Gepir4XService_Service(final WebServiceFeature... features)
	{
		super(Gepir4XService_Service.__getWsdlLocation(), Gepir4XService_Service.GEPIR4XSERVICE_QNAME, features);
	}

	public Gepir4XService_Service(final URL wsdlLocation)
	{
		super(wsdlLocation, Gepir4XService_Service.GEPIR4XSERVICE_QNAME);
	}

	public Gepir4XService_Service(final URL wsdlLocation, final WebServiceFeature... features)
	{
		super(wsdlLocation, Gepir4XService_Service.GEPIR4XSERVICE_QNAME, features);
	}

	public Gepir4XService_Service(final URL wsdlLocation, final QName serviceName)
	{
		super(wsdlLocation, serviceName);
	}

	public Gepir4XService_Service(final URL wsdlLocation, final QName serviceName, final WebServiceFeature... features)
	{
		super(wsdlLocation, serviceName, features);
	}

	/**
	 *
	 * @return returns Gepir4XService
	 */
	@WebEndpoint(name = "Gepir4xPort")
	public Gepir4XService getGepir4XPort()
	{
		return super.getPort(new QName("http://gepir.ws.gs1.org/", "Gepir4xPort"), Gepir4XService.class);
	}

	/**
	 *
	 * @param features A list of {@link javax.xml.ws.WebServiceFeature} to
	 *            configure on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns Gepir4XService
	 */
	@WebEndpoint(name = "Gepir4xPort")
	public Gepir4XService getGepir4XPort(final WebServiceFeature... features)
	{
		return super.getPort(new QName("http://gepir.ws.gs1.org/", "Gepir4xPort"), Gepir4XService.class, features);
	}

	private static URL __getWsdlLocation()
	{
		if (Gepir4XService_Service.GEPIR4XSERVICE_EXCEPTION != null)
		{
			throw Gepir4XService_Service.GEPIR4XSERVICE_EXCEPTION;
		}
		return Gepir4XService_Service.GEPIR4XSERVICE_WSDL_LOCATION;
	}

}
