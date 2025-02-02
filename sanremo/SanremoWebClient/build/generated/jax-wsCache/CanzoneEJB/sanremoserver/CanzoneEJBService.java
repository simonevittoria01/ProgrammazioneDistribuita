
package sanremoserver;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * Eclipse Metro/4.0.4 (RELEASE-4.0.4-ec440d5; 2024-06-28T10:09:00+0000) XMLWS-Impl/4.0.3 XMLWS-API/4.0.2 XMLB-Impl/4.0.5 XMLB-API/4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "CanzoneEJBService", targetNamespace = "http://sanremoserver/", wsdlLocation = "http://Host-001.homenet.telecomitalia.it:8080/CanzoneEJBService/CanzoneEJB?wsdl")
public class CanzoneEJBService
    extends Service
{

    private static final URL CANZONEEJBSERVICE_WSDL_LOCATION;
    private static final WebServiceException CANZONEEJBSERVICE_EXCEPTION;
    private static final QName CANZONEEJBSERVICE_QNAME = new QName("http://sanremoserver/", "CanzoneEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://Host-001.homenet.telecomitalia.it:8080/CanzoneEJBService/CanzoneEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CANZONEEJBSERVICE_WSDL_LOCATION = url;
        CANZONEEJBSERVICE_EXCEPTION = e;
    }

    public CanzoneEJBService() {
        super(__getWsdlLocation(), CANZONEEJBSERVICE_QNAME);
    }

    public CanzoneEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CANZONEEJBSERVICE_QNAME, features);
    }

    public CanzoneEJBService(URL wsdlLocation) {
        super(wsdlLocation, CANZONEEJBSERVICE_QNAME);
    }

    public CanzoneEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CANZONEEJBSERVICE_QNAME, features);
    }

    public CanzoneEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CanzoneEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CanzoneEJB
     */
    @WebEndpoint(name = "CanzoneEJBPort")
    public CanzoneEJB getCanzoneEJBPort() {
        return super.getPort(new QName("http://sanremoserver/", "CanzoneEJBPort"), CanzoneEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CanzoneEJB
     */
    @WebEndpoint(name = "CanzoneEJBPort")
    public CanzoneEJB getCanzoneEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sanremoserver/", "CanzoneEJBPort"), CanzoneEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CANZONEEJBSERVICE_EXCEPTION!= null) {
            throw CANZONEEJBSERVICE_EXCEPTION;
        }
        return CANZONEEJBSERVICE_WSDL_LOCATION;
    }

}
