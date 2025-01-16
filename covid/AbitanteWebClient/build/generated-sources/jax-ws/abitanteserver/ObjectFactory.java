
package abitanteserver;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the abitanteserver package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Abitante_QNAME = new QName("http://abitanteserver/", "abitante");
    private static final QName _Aggiorna_QNAME = new QName("http://abitanteserver/", "aggiorna");
    private static final QName _AggiornaResponse_QNAME = new QName("http://abitanteserver/", "aggiornaResponse");
    private static final QName _Elimina_QNAME = new QName("http://abitanteserver/", "elimina");
    private static final QName _EliminaResponse_QNAME = new QName("http://abitanteserver/", "eliminaResponse");
    private static final QName _Inserisci_QNAME = new QName("http://abitanteserver/", "inserisci");
    private static final QName _InserisciResponse_QNAME = new QName("http://abitanteserver/", "inserisciResponse");
    private static final QName _TrovaPerCategoria_QNAME = new QName("http://abitanteserver/", "trovaPerCategoria");
    private static final QName _TrovaPerCategoriaEeta_QNAME = new QName("http://abitanteserver/", "trovaPerCategoriaEeta");
    private static final QName _TrovaPerCategoriaEetaResponse_QNAME = new QName("http://abitanteserver/", "trovaPerCategoriaEetaResponse");
    private static final QName _TrovaPerCategoriaEinteresseVaccino_QNAME = new QName("http://abitanteserver/", "trovaPerCategoriaEinteresseVaccino");
    private static final QName _TrovaPerCategoriaEinteresseVaccinoResponse_QNAME = new QName("http://abitanteserver/", "trovaPerCategoriaEinteresseVaccinoResponse");
    private static final QName _TrovaPerCategoriaResponse_QNAME = new QName("http://abitanteserver/", "trovaPerCategoriaResponse");
    private static final QName _TrovaPerContrattoCovid_QNAME = new QName("http://abitanteserver/", "trovaPerContrattoCovid");
    private static final QName _TrovaPerContrattoCovidResponse_QNAME = new QName("http://abitanteserver/", "trovaPerContrattoCovidResponse");
    private static final QName _TrovaPerEta_QNAME = new QName("http://abitanteserver/", "trovaPerEta");
    private static final QName _TrovaPerEtaResponse_QNAME = new QName("http://abitanteserver/", "trovaPerEtaResponse");
    private static final QName _TrovaPerId_QNAME = new QName("http://abitanteserver/", "trovaPerId");
    private static final QName _TrovaPerIdResponse_QNAME = new QName("http://abitanteserver/", "trovaPerIdResponse");
    private static final QName _TrovaTutto_QNAME = new QName("http://abitanteserver/", "trovaTutto");
    private static final QName _TrovaTuttoResponse_QNAME = new QName("http://abitanteserver/", "trovaTuttoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: abitanteserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Abitante }
     * 
     * @return
     *     the new instance of {@link Abitante }
     */
    public Abitante createAbitante() {
        return new Abitante();
    }

    /**
     * Create an instance of {@link Aggiorna }
     * 
     * @return
     *     the new instance of {@link Aggiorna }
     */
    public Aggiorna createAggiorna() {
        return new Aggiorna();
    }

    /**
     * Create an instance of {@link AggiornaResponse }
     * 
     * @return
     *     the new instance of {@link AggiornaResponse }
     */
    public AggiornaResponse createAggiornaResponse() {
        return new AggiornaResponse();
    }

    /**
     * Create an instance of {@link Elimina }
     * 
     * @return
     *     the new instance of {@link Elimina }
     */
    public Elimina createElimina() {
        return new Elimina();
    }

    /**
     * Create an instance of {@link EliminaResponse }
     * 
     * @return
     *     the new instance of {@link EliminaResponse }
     */
    public EliminaResponse createEliminaResponse() {
        return new EliminaResponse();
    }

    /**
     * Create an instance of {@link Inserisci }
     * 
     * @return
     *     the new instance of {@link Inserisci }
     */
    public Inserisci createInserisci() {
        return new Inserisci();
    }

    /**
     * Create an instance of {@link InserisciResponse }
     * 
     * @return
     *     the new instance of {@link InserisciResponse }
     */
    public InserisciResponse createInserisciResponse() {
        return new InserisciResponse();
    }

    /**
     * Create an instance of {@link TrovaPerCategoria }
     * 
     * @return
     *     the new instance of {@link TrovaPerCategoria }
     */
    public TrovaPerCategoria createTrovaPerCategoria() {
        return new TrovaPerCategoria();
    }

    /**
     * Create an instance of {@link TrovaPerCategoriaEeta }
     * 
     * @return
     *     the new instance of {@link TrovaPerCategoriaEeta }
     */
    public TrovaPerCategoriaEeta createTrovaPerCategoriaEeta() {
        return new TrovaPerCategoriaEeta();
    }

    /**
     * Create an instance of {@link TrovaPerCategoriaEetaResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerCategoriaEetaResponse }
     */
    public TrovaPerCategoriaEetaResponse createTrovaPerCategoriaEetaResponse() {
        return new TrovaPerCategoriaEetaResponse();
    }

    /**
     * Create an instance of {@link TrovaPerCategoriaEinteresseVaccino }
     * 
     * @return
     *     the new instance of {@link TrovaPerCategoriaEinteresseVaccino }
     */
    public TrovaPerCategoriaEinteresseVaccino createTrovaPerCategoriaEinteresseVaccino() {
        return new TrovaPerCategoriaEinteresseVaccino();
    }

    /**
     * Create an instance of {@link TrovaPerCategoriaEinteresseVaccinoResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerCategoriaEinteresseVaccinoResponse }
     */
    public TrovaPerCategoriaEinteresseVaccinoResponse createTrovaPerCategoriaEinteresseVaccinoResponse() {
        return new TrovaPerCategoriaEinteresseVaccinoResponse();
    }

    /**
     * Create an instance of {@link TrovaPerCategoriaResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerCategoriaResponse }
     */
    public TrovaPerCategoriaResponse createTrovaPerCategoriaResponse() {
        return new TrovaPerCategoriaResponse();
    }

    /**
     * Create an instance of {@link TrovaPerContrattoCovid }
     * 
     * @return
     *     the new instance of {@link TrovaPerContrattoCovid }
     */
    public TrovaPerContrattoCovid createTrovaPerContrattoCovid() {
        return new TrovaPerContrattoCovid();
    }

    /**
     * Create an instance of {@link TrovaPerContrattoCovidResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerContrattoCovidResponse }
     */
    public TrovaPerContrattoCovidResponse createTrovaPerContrattoCovidResponse() {
        return new TrovaPerContrattoCovidResponse();
    }

    /**
     * Create an instance of {@link TrovaPerEta }
     * 
     * @return
     *     the new instance of {@link TrovaPerEta }
     */
    public TrovaPerEta createTrovaPerEta() {
        return new TrovaPerEta();
    }

    /**
     * Create an instance of {@link TrovaPerEtaResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerEtaResponse }
     */
    public TrovaPerEtaResponse createTrovaPerEtaResponse() {
        return new TrovaPerEtaResponse();
    }

    /**
     * Create an instance of {@link TrovaPerId }
     * 
     * @return
     *     the new instance of {@link TrovaPerId }
     */
    public TrovaPerId createTrovaPerId() {
        return new TrovaPerId();
    }

    /**
     * Create an instance of {@link TrovaPerIdResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerIdResponse }
     */
    public TrovaPerIdResponse createTrovaPerIdResponse() {
        return new TrovaPerIdResponse();
    }

    /**
     * Create an instance of {@link TrovaTutto }
     * 
     * @return
     *     the new instance of {@link TrovaTutto }
     */
    public TrovaTutto createTrovaTutto() {
        return new TrovaTutto();
    }

    /**
     * Create an instance of {@link TrovaTuttoResponse }
     * 
     * @return
     *     the new instance of {@link TrovaTuttoResponse }
     */
    public TrovaTuttoResponse createTrovaTuttoResponse() {
        return new TrovaTuttoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Abitante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Abitante }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "abitante")
    public JAXBElement<Abitante> createAbitante(Abitante value) {
        return new JAXBElement<>(_Abitante_QNAME, Abitante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Aggiorna }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Aggiorna }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "aggiorna")
    public JAXBElement<Aggiorna> createAggiorna(Aggiorna value) {
        return new JAXBElement<>(_Aggiorna_QNAME, Aggiorna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggiornaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "aggiornaResponse")
    public JAXBElement<AggiornaResponse> createAggiornaResponse(AggiornaResponse value) {
        return new JAXBElement<>(_AggiornaResponse_QNAME, AggiornaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Elimina }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Elimina }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "elimina")
    public JAXBElement<Elimina> createElimina(Elimina value) {
        return new JAXBElement<>(_Elimina_QNAME, Elimina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "eliminaResponse")
    public JAXBElement<EliminaResponse> createEliminaResponse(EliminaResponse value) {
        return new JAXBElement<>(_EliminaResponse_QNAME, EliminaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inserisci }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Inserisci }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "inserisci")
    public JAXBElement<Inserisci> createInserisci(Inserisci value) {
        return new JAXBElement<>(_Inserisci_QNAME, Inserisci.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserisciResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserisciResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "inserisciResponse")
    public JAXBElement<InserisciResponse> createInserisciResponse(InserisciResponse value) {
        return new JAXBElement<>(_InserisciResponse_QNAME, InserisciResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoria }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoria }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerCategoria")
    public JAXBElement<TrovaPerCategoria> createTrovaPerCategoria(TrovaPerCategoria value) {
        return new JAXBElement<>(_TrovaPerCategoria_QNAME, TrovaPerCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaEeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaEeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerCategoriaEeta")
    public JAXBElement<TrovaPerCategoriaEeta> createTrovaPerCategoriaEeta(TrovaPerCategoriaEeta value) {
        return new JAXBElement<>(_TrovaPerCategoriaEeta_QNAME, TrovaPerCategoriaEeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaEetaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaEetaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerCategoriaEetaResponse")
    public JAXBElement<TrovaPerCategoriaEetaResponse> createTrovaPerCategoriaEetaResponse(TrovaPerCategoriaEetaResponse value) {
        return new JAXBElement<>(_TrovaPerCategoriaEetaResponse_QNAME, TrovaPerCategoriaEetaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaEinteresseVaccino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaEinteresseVaccino }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerCategoriaEinteresseVaccino")
    public JAXBElement<TrovaPerCategoriaEinteresseVaccino> createTrovaPerCategoriaEinteresseVaccino(TrovaPerCategoriaEinteresseVaccino value) {
        return new JAXBElement<>(_TrovaPerCategoriaEinteresseVaccino_QNAME, TrovaPerCategoriaEinteresseVaccino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaEinteresseVaccinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaEinteresseVaccinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerCategoriaEinteresseVaccinoResponse")
    public JAXBElement<TrovaPerCategoriaEinteresseVaccinoResponse> createTrovaPerCategoriaEinteresseVaccinoResponse(TrovaPerCategoriaEinteresseVaccinoResponse value) {
        return new JAXBElement<>(_TrovaPerCategoriaEinteresseVaccinoResponse_QNAME, TrovaPerCategoriaEinteresseVaccinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerCategoriaResponse")
    public JAXBElement<TrovaPerCategoriaResponse> createTrovaPerCategoriaResponse(TrovaPerCategoriaResponse value) {
        return new JAXBElement<>(_TrovaPerCategoriaResponse_QNAME, TrovaPerCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerContrattoCovid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerContrattoCovid }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerContrattoCovid")
    public JAXBElement<TrovaPerContrattoCovid> createTrovaPerContrattoCovid(TrovaPerContrattoCovid value) {
        return new JAXBElement<>(_TrovaPerContrattoCovid_QNAME, TrovaPerContrattoCovid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerContrattoCovidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerContrattoCovidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerContrattoCovidResponse")
    public JAXBElement<TrovaPerContrattoCovidResponse> createTrovaPerContrattoCovidResponse(TrovaPerContrattoCovidResponse value) {
        return new JAXBElement<>(_TrovaPerContrattoCovidResponse_QNAME, TrovaPerContrattoCovidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerEta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerEta }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerEta")
    public JAXBElement<TrovaPerEta> createTrovaPerEta(TrovaPerEta value) {
        return new JAXBElement<>(_TrovaPerEta_QNAME, TrovaPerEta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerEtaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerEtaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerEtaResponse")
    public JAXBElement<TrovaPerEtaResponse> createTrovaPerEtaResponse(TrovaPerEtaResponse value) {
        return new JAXBElement<>(_TrovaPerEtaResponse_QNAME, TrovaPerEtaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerId }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerId")
    public JAXBElement<TrovaPerId> createTrovaPerId(TrovaPerId value) {
        return new JAXBElement<>(_TrovaPerId_QNAME, TrovaPerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaPerIdResponse")
    public JAXBElement<TrovaPerIdResponse> createTrovaPerIdResponse(TrovaPerIdResponse value) {
        return new JAXBElement<>(_TrovaPerIdResponse_QNAME, TrovaPerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTutto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaTutto }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaTutto")
    public JAXBElement<TrovaTutto> createTrovaTutto(TrovaTutto value) {
        return new JAXBElement<>(_TrovaTutto_QNAME, TrovaTutto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTuttoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaTuttoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://abitanteserver/", name = "trovaTuttoResponse")
    public JAXBElement<TrovaTuttoResponse> createTrovaTuttoResponse(TrovaTuttoResponse value) {
        return new JAXBElement<>(_TrovaTuttoResponse_QNAME, TrovaTuttoResponse.class, null, value);
    }

}
