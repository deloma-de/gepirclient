
package org.gs1.ws.gepir4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import gs1.gepir.request_header.xsd._4.RequestHeaderType;
import gs1.gepir.response_header.xsd._4.ResponseHeaderType;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.gs1.ws.gepir4 package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory
{

	private final static QName _GetRouterDetailResponse_QNAME = new QName("http://gepir4.ws.gs1.org/",
		"getRouterDetailResponse");
	private final static QName _GetPartyByName_QNAME = new QName("http://gepir4.ws.gs1.org/", "getPartyByName");
	private final static QName _GetPrefixLicenseeResponse_QNAME = new QName("http://gepir4.ws.gs1.org/",
		"getPrefixLicenseeResponse");
	private final static QName _GetKeyLicenseeResponse_QNAME = new QName("http://gepir4.ws.gs1.org/",
		"getKeyLicenseeResponse");
	private final static QName _GetPrefixLicensee_QNAME = new QName("http://gepir4.ws.gs1.org/", "getPrefixLicensee");
	private final static QName _GetRootDirectory_QNAME = new QName("http://gepir4.ws.gs1.org/", "getRootDirectory");
	private final static QName _GetKeyLicensee_QNAME = new QName("http://gepir4.ws.gs1.org/", "getKeyLicensee");
	private final static QName _RequestHeader_QNAME = new QName("http://gepir4.ws.gs1.org/", "requestHeader");
	private final static QName _GetItemByGTIN_QNAME = new QName("http://gepir4.ws.gs1.org/", "getItemByGTIN");
	private final static QName _GetRouterDetail_QNAME = new QName("http://gepir4.ws.gs1.org/", "getRouterDetail");
	private final static QName _ResponseHeader_QNAME = new QName("http://gepir4.ws.gs1.org/", "responseHeader");
	private final static QName _GetItemByGTINResponse_QNAME = new QName("http://gepir4.ws.gs1.org/",
		"getItemByGTINResponse");
	private final static QName _GetPartyByNameResponse_QNAME = new QName("http://gepir4.ws.gs1.org/",
		"getPartyByNameResponse");
	private final static QName _GetRootDirectoryResponse_QNAME = new QName("http://gepir4.ws.gs1.org/",
		"getRootDirectoryResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: org.gs1.ws.gepir4
	 * 
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link GetRouterDetailResponse }
	 * 
	 */
	public GetRouterDetailResponse createGetRouterDetailResponse()
	{
		return new GetRouterDetailResponse();
	}

	/**
	 * Create an instance of {@link GetRouterDetail }
	 * 
	 */
	public GetRouterDetail createGetRouterDetail()
	{
		return new GetRouterDetail();
	}

	/**
	 * Create an instance of {@link GetPartyByName }
	 * 
	 */
	public GetPartyByName createGetPartyByName()
	{
		return new GetPartyByName();
	}

	/**
	 * Create an instance of {@link GetKeyLicenseeResponse }
	 * 
	 */
	public GetKeyLicenseeResponse createGetKeyLicenseeResponse()
	{
		return new GetKeyLicenseeResponse();
	}

	/**
	 * Create an instance of {@link GetPrefixLicensee }
	 * 
	 */
	public GetPrefixLicensee createGetPrefixLicensee()
	{
		return new GetPrefixLicensee();
	}

	/**
	 * Create an instance of {@link GetPrefixLicenseeResponse }
	 * 
	 */
	public GetPrefixLicenseeResponse createGetPrefixLicenseeResponse()
	{
		return new GetPrefixLicenseeResponse();
	}

	/**
	 * Create an instance of {@link GetKeyLicensee }
	 * 
	 */
	public GetKeyLicensee createGetKeyLicensee()
	{
		return new GetKeyLicensee();
	}

	/**
	 * Create an instance of {@link GetRootDirectory }
	 * 
	 */
	public GetRootDirectory createGetRootDirectory()
	{
		return new GetRootDirectory();
	}

	/**
	 * Create an instance of {@link GetItemByGTIN }
	 * 
	 */
	public GetItemByGTIN createGetItemByGTIN()
	{
		return new GetItemByGTIN();
	}

	/**
	 * Create an instance of {@link GetItemByGTINResponse }
	 * 
	 */
	public GetItemByGTINResponse createGetItemByGTINResponse()
	{
		return new GetItemByGTINResponse();
	}

	/**
	 * Create an instance of {@link GetPartyByNameResponse }
	 * 
	 */
	public GetPartyByNameResponse createGetPartyByNameResponse()
	{
		return new GetPartyByNameResponse();
	}

	/**
	 * Create an instance of {@link GetRootDirectoryResponse }
	 * 
	 */
	public GetRootDirectoryResponse createGetRootDirectoryResponse()
	{
		return new GetRootDirectoryResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetRouterDetailResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getRouterDetailResponse")
	public JAXBElement<GetRouterDetailResponse> createGetRouterDetailResponse(final GetRouterDetailResponse value)
	{
		return new JAXBElement<GetRouterDetailResponse>(ObjectFactory._GetRouterDetailResponse_QNAME,
			GetRouterDetailResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetPartyByName
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getPartyByName")
	public JAXBElement<GetPartyByName> createGetPartyByName(final GetPartyByName value)
	{
		return new JAXBElement<GetPartyByName>(ObjectFactory._GetPartyByName_QNAME, GetPartyByName.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetPrefixLicenseeResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getPrefixLicenseeResponse")
	public JAXBElement<GetPrefixLicenseeResponse> createGetPrefixLicenseeResponse(final GetPrefixLicenseeResponse value)
	{
		return new JAXBElement<GetPrefixLicenseeResponse>(ObjectFactory._GetPrefixLicenseeResponse_QNAME,
			GetPrefixLicenseeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetKeyLicenseeResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getKeyLicenseeResponse")
	public JAXBElement<GetKeyLicenseeResponse> createGetKeyLicenseeResponse(final GetKeyLicenseeResponse value)
	{
		return new JAXBElement<GetKeyLicenseeResponse>(ObjectFactory._GetKeyLicenseeResponse_QNAME,
			GetKeyLicenseeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetPrefixLicensee }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getPrefixLicensee")
	public JAXBElement<GetPrefixLicensee> createGetPrefixLicensee(final GetPrefixLicensee value)
	{
		return new JAXBElement<GetPrefixLicensee>(ObjectFactory._GetPrefixLicensee_QNAME, GetPrefixLicensee.class, null,
			value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetRootDirectory }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getRootDirectory")
	public JAXBElement<GetRootDirectory> createGetRootDirectory(final GetRootDirectory value)
	{
		return new JAXBElement<GetRootDirectory>(ObjectFactory._GetRootDirectory_QNAME, GetRootDirectory.class, null,
			value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetKeyLicensee
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getKeyLicensee")
	public JAXBElement<GetKeyLicensee> createGetKeyLicensee(final GetKeyLicensee value)
	{
		return new JAXBElement<GetKeyLicensee>(ObjectFactory._GetKeyLicensee_QNAME, GetKeyLicensee.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link RequestHeaderType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "requestHeader")
	public JAXBElement<RequestHeaderType> createRequestHeader(final RequestHeaderType value)
	{
		return new JAXBElement<RequestHeaderType>(ObjectFactory._RequestHeader_QNAME, RequestHeaderType.class, null,
			value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByGTIN
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getItemByGTIN")
	public JAXBElement<GetItemByGTIN> createGetItemByGTIN(final GetItemByGTIN value)
	{
		return new JAXBElement<GetItemByGTIN>(ObjectFactory._GetItemByGTIN_QNAME, GetItemByGTIN.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetRouterDetail
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getRouterDetail")
	public JAXBElement<GetRouterDetail> createGetRouterDetail(final GetRouterDetail value)
	{
		return new JAXBElement<GetRouterDetail>(ObjectFactory._GetRouterDetail_QNAME, GetRouterDetail.class, null,
			value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ResponseHeaderType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "responseHeader")
	public JAXBElement<ResponseHeaderType> createResponseHeader(final ResponseHeaderType value)
	{
		return new JAXBElement<ResponseHeaderType>(ObjectFactory._ResponseHeader_QNAME, ResponseHeaderType.class, null,
			value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetItemByGTINResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getItemByGTINResponse")
	public JAXBElement<GetItemByGTINResponse> createGetItemByGTINResponse(final GetItemByGTINResponse value)
	{
		return new JAXBElement<GetItemByGTINResponse>(ObjectFactory._GetItemByGTINResponse_QNAME,
			GetItemByGTINResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetPartyByNameResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getPartyByNameResponse")
	public JAXBElement<GetPartyByNameResponse> createGetPartyByNameResponse(final GetPartyByNameResponse value)
	{
		return new JAXBElement<GetPartyByNameResponse>(ObjectFactory._GetPartyByNameResponse_QNAME,
			GetPartyByNameResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetRootDirectoryResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://gepir4.ws.gs1.org/", name = "getRootDirectoryResponse")
	public JAXBElement<GetRootDirectoryResponse> createGetRootDirectoryResponse(final GetRootDirectoryResponse value)
	{
		return new JAXBElement<GetRootDirectoryResponse>(ObjectFactory._GetRootDirectoryResponse_QNAME,
			GetRootDirectoryResponse.class, null, value);
	}

}
