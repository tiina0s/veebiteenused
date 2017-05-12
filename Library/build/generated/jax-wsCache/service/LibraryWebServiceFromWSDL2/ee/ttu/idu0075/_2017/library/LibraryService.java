
package ee.ttu.idu0075._2017.library;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LibraryService", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", wsdlLocation = "file:/C:/Users/Kasutaja/Documents/NetBeansProjects/Library/src/conf/xml-resources/web-services/LibraryWebServiceFromWSDL2/wsdl/Service.wsdl")
public class LibraryService
    extends Service
{

    private final static URL LIBRARYSERVICE_WSDL_LOCATION;
    private final static WebServiceException LIBRARYSERVICE_EXCEPTION;
    private final static QName LIBRARYSERVICE_QNAME = new QName("http://www.ttu.ee/idu0075/2017/library", "LibraryService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Kasutaja/Documents/NetBeansProjects/Library/src/conf/xml-resources/web-services/LibraryWebServiceFromWSDL2/wsdl/Service.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIBRARYSERVICE_WSDL_LOCATION = url;
        LIBRARYSERVICE_EXCEPTION = e;
    }

    public LibraryService() {
        super(__getWsdlLocation(), LIBRARYSERVICE_QNAME);
    }

    public LibraryService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIBRARYSERVICE_QNAME, features);
    }

    public LibraryService(URL wsdlLocation) {
        super(wsdlLocation, LIBRARYSERVICE_QNAME);
    }

    public LibraryService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIBRARYSERVICE_QNAME, features);
    }

    public LibraryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LibraryService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LibraryPortType
     */
    @WebEndpoint(name = "LibraryPort")
    public LibraryPortType getLibraryPort() {
        return super.getPort(new QName("http://www.ttu.ee/idu0075/2017/library", "LibraryPort"), LibraryPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LibraryPortType
     */
    @WebEndpoint(name = "LibraryPort")
    public LibraryPortType getLibraryPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ttu.ee/idu0075/2017/library", "LibraryPort"), LibraryPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIBRARYSERVICE_EXCEPTION!= null) {
            throw LIBRARYSERVICE_EXCEPTION;
        }
        return LIBRARYSERVICE_WSDL_LOCATION;
    }

}