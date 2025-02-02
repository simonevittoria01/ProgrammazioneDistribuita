
package sanremoserver;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * Eclipse Metro/4.0.4 (RELEASE-4.0.4-ec440d5; 2024-06-28T10:09:00+0000) XMLWS-Impl/4.0.3 XMLWS-API/4.0.2 XMLB-Impl/4.0.5 XMLB-API/4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "CanzoneEJB", targetNamespace = "http://sanremoserver/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CanzoneEJB {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "inserisci", targetNamespace = "http://sanremoserver/", className = "sanremoserver.Inserisci")
    @ResponseWrapper(localName = "inserisciResponse", targetNamespace = "http://sanremoserver/", className = "sanremoserver.InserisciResponse")
    @Action(input = "http://sanremoserver/CanzoneEJB/inserisciRequest", output = "http://sanremoserver/CanzoneEJB/inserisciResponse")
    public void inserisci(
        @WebParam(name = "arg0", targetNamespace = "")
        Canzone arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "elimina", targetNamespace = "http://sanremoserver/", className = "sanremoserver.Elimina")
    @ResponseWrapper(localName = "eliminaResponse", targetNamespace = "http://sanremoserver/", className = "sanremoserver.EliminaResponse")
    @Action(input = "http://sanremoserver/CanzoneEJB/eliminaRequest", output = "http://sanremoserver/CanzoneEJB/eliminaResponse")
    public void elimina(
        @WebParam(name = "arg0", targetNamespace = "")
        Canzone arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns sanremoserver.Canzone
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "trovaPerId", targetNamespace = "http://sanremoserver/", className = "sanremoserver.TrovaPerId")
    @ResponseWrapper(localName = "trovaPerIdResponse", targetNamespace = "http://sanremoserver/", className = "sanremoserver.TrovaPerIdResponse")
    @Action(input = "http://sanremoserver/CanzoneEJB/trovaPerIdRequest", output = "http://sanremoserver/CanzoneEJB/trovaPerIdResponse")
    public Canzone trovaPerId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "aggiorna", targetNamespace = "http://sanremoserver/", className = "sanremoserver.Aggiorna")
    @ResponseWrapper(localName = "aggiornaResponse", targetNamespace = "http://sanremoserver/", className = "sanremoserver.AggiornaResponse")
    @Action(input = "http://sanremoserver/CanzoneEJB/aggiornaRequest", output = "http://sanremoserver/CanzoneEJB/aggiornaResponse")
    public void aggiorna(
        @WebParam(name = "arg0", targetNamespace = "")
        Canzone arg0);

    /**
     * 
     * @return
     *     returns java.util.List<sanremoserver.Canzone>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "trovaTutto", targetNamespace = "http://sanremoserver/", className = "sanremoserver.TrovaTutto")
    @ResponseWrapper(localName = "trovaTuttoResponse", targetNamespace = "http://sanremoserver/", className = "sanremoserver.TrovaTuttoResponse")
    @Action(input = "http://sanremoserver/CanzoneEJB/trovaTuttoRequest", output = "http://sanremoserver/CanzoneEJB/trovaTuttoResponse")
    public List<Canzone> trovaTutto();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<sanremoserver.Canzone>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "trovaPerVoti", targetNamespace = "http://sanremoserver/", className = "sanremoserver.TrovaPerVoti")
    @ResponseWrapper(localName = "trovaPerVotiResponse", targetNamespace = "http://sanremoserver/", className = "sanremoserver.TrovaPerVotiResponse")
    @Action(input = "http://sanremoserver/CanzoneEJB/trovaPerVotiRequest", output = "http://sanremoserver/CanzoneEJB/trovaPerVotiResponse")
    public List<Canzone> trovaPerVoti(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @param arg1
     */
    @WebMethod
    @RequestWrapper(localName = "modificaVoti", targetNamespace = "http://sanremoserver/", className = "sanremoserver.ModificaVoti")
    @ResponseWrapper(localName = "modificaVotiResponse", targetNamespace = "http://sanremoserver/", className = "sanremoserver.ModificaVotiResponse")
    @Action(input = "http://sanremoserver/CanzoneEJB/modificaVotiRequest", output = "http://sanremoserver/CanzoneEJB/modificaVotiResponse")
    public void modificaVoti(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<sanremoserver.Canzone>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "trovaPerCategoria", targetNamespace = "http://sanremoserver/", className = "sanremoserver.TrovaPerCategoria")
    @ResponseWrapper(localName = "trovaPerCategoriaResponse", targetNamespace = "http://sanremoserver/", className = "sanremoserver.TrovaPerCategoriaResponse")
    @Action(input = "http://sanremoserver/CanzoneEJB/trovaPerCategoriaRequest", output = "http://sanremoserver/CanzoneEJB/trovaPerCategoriaResponse")
    public List<Canzone> trovaPerCategoria(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
