
package immobileserver;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the immobileserver package. 
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

    private static final QName _Aggiorna_QNAME = new QName("http://immobileserver/", "aggiorna");
    private static final QName _AggiornaResponse_QNAME = new QName("http://immobileserver/", "aggiornaResponse");
    private static final QName _Elimina_QNAME = new QName("http://immobileserver/", "elimina");
    private static final QName _EliminaResponse_QNAME = new QName("http://immobileserver/", "eliminaResponse");
    private static final QName _Immobile_QNAME = new QName("http://immobileserver/", "immobile");
    private static final QName _Inserisci_QNAME = new QName("http://immobileserver/", "inserisci");
    private static final QName _InserisciResponse_QNAME = new QName("http://immobileserver/", "inserisciResponse");
    private static final QName _TrovaPerDataVendita_QNAME = new QName("http://immobileserver/", "trovaPerDataVendita");
    private static final QName _TrovaPerDataVenditaResponse_QNAME = new QName("http://immobileserver/", "trovaPerDataVenditaResponse");
    private static final QName _TrovaPerId_QNAME = new QName("http://immobileserver/", "trovaPerId");
    private static final QName _TrovaPerIdResponse_QNAME = new QName("http://immobileserver/", "trovaPerIdResponse");
    private static final QName _TrovaPerIndirizzo_QNAME = new QName("http://immobileserver/", "trovaPerIndirizzo");
    private static final QName _TrovaPerIndirizzoResponse_QNAME = new QName("http://immobileserver/", "trovaPerIndirizzoResponse");
    private static final QName _TrovaPerStato_QNAME = new QName("http://immobileserver/", "trovaPerStato");
    private static final QName _TrovaPerStatoResponse_QNAME = new QName("http://immobileserver/", "trovaPerStatoResponse");
    private static final QName _TrovaTutto_QNAME = new QName("http://immobileserver/", "trovaTutto");
    private static final QName _TrovaTuttoResponse_QNAME = new QName("http://immobileserver/", "trovaTuttoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: immobileserver
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link Immobile }
     * 
     * @return
     *     the new instance of {@link Immobile }
     */
    public Immobile createImmobile() {
        return new Immobile();
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
     * Create an instance of {@link TrovaPerDataVendita }
     * 
     * @return
     *     the new instance of {@link TrovaPerDataVendita }
     */
    public TrovaPerDataVendita createTrovaPerDataVendita() {
        return new TrovaPerDataVendita();
    }

    /**
     * Create an instance of {@link TrovaPerDataVenditaResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerDataVenditaResponse }
     */
    public TrovaPerDataVenditaResponse createTrovaPerDataVenditaResponse() {
        return new TrovaPerDataVenditaResponse();
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
     * Create an instance of {@link TrovaPerIndirizzo }
     * 
     * @return
     *     the new instance of {@link TrovaPerIndirizzo }
     */
    public TrovaPerIndirizzo createTrovaPerIndirizzo() {
        return new TrovaPerIndirizzo();
    }

    /**
     * Create an instance of {@link TrovaPerIndirizzoResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerIndirizzoResponse }
     */
    public TrovaPerIndirizzoResponse createTrovaPerIndirizzoResponse() {
        return new TrovaPerIndirizzoResponse();
    }

    /**
     * Create an instance of {@link TrovaPerStato }
     * 
     * @return
     *     the new instance of {@link TrovaPerStato }
     */
    public TrovaPerStato createTrovaPerStato() {
        return new TrovaPerStato();
    }

    /**
     * Create an instance of {@link TrovaPerStatoResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerStatoResponse }
     */
    public TrovaPerStatoResponse createTrovaPerStatoResponse() {
        return new TrovaPerStatoResponse();
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
     * Create an instance of {@link LocalDate }
     * 
     * @return
     *     the new instance of {@link LocalDate }
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Aggiorna }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Aggiorna }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "aggiorna")
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
    @XmlElementDecl(namespace = "http://immobileserver/", name = "aggiornaResponse")
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
    @XmlElementDecl(namespace = "http://immobileserver/", name = "elimina")
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
    @XmlElementDecl(namespace = "http://immobileserver/", name = "eliminaResponse")
    public JAXBElement<EliminaResponse> createEliminaResponse(EliminaResponse value) {
        return new JAXBElement<>(_EliminaResponse_QNAME, EliminaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Immobile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Immobile }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "immobile")
    public JAXBElement<Immobile> createImmobile(Immobile value) {
        return new JAXBElement<>(_Immobile_QNAME, Immobile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inserisci }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Inserisci }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "inserisci")
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
    @XmlElementDecl(namespace = "http://immobileserver/", name = "inserisciResponse")
    public JAXBElement<InserisciResponse> createInserisciResponse(InserisciResponse value) {
        return new JAXBElement<>(_InserisciResponse_QNAME, InserisciResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerDataVendita }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerDataVendita }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaPerDataVendita")
    public JAXBElement<TrovaPerDataVendita> createTrovaPerDataVendita(TrovaPerDataVendita value) {
        return new JAXBElement<>(_TrovaPerDataVendita_QNAME, TrovaPerDataVendita.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerDataVenditaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerDataVenditaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaPerDataVenditaResponse")
    public JAXBElement<TrovaPerDataVenditaResponse> createTrovaPerDataVenditaResponse(TrovaPerDataVenditaResponse value) {
        return new JAXBElement<>(_TrovaPerDataVenditaResponse_QNAME, TrovaPerDataVenditaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerId }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaPerId")
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
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaPerIdResponse")
    public JAXBElement<TrovaPerIdResponse> createTrovaPerIdResponse(TrovaPerIdResponse value) {
        return new JAXBElement<>(_TrovaPerIdResponse_QNAME, TrovaPerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerIndirizzo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerIndirizzo }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaPerIndirizzo")
    public JAXBElement<TrovaPerIndirizzo> createTrovaPerIndirizzo(TrovaPerIndirizzo value) {
        return new JAXBElement<>(_TrovaPerIndirizzo_QNAME, TrovaPerIndirizzo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerIndirizzoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerIndirizzoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaPerIndirizzoResponse")
    public JAXBElement<TrovaPerIndirizzoResponse> createTrovaPerIndirizzoResponse(TrovaPerIndirizzoResponse value) {
        return new JAXBElement<>(_TrovaPerIndirizzoResponse_QNAME, TrovaPerIndirizzoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerStato }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerStato }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaPerStato")
    public JAXBElement<TrovaPerStato> createTrovaPerStato(TrovaPerStato value) {
        return new JAXBElement<>(_TrovaPerStato_QNAME, TrovaPerStato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerStatoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerStatoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaPerStatoResponse")
    public JAXBElement<TrovaPerStatoResponse> createTrovaPerStatoResponse(TrovaPerStatoResponse value) {
        return new JAXBElement<>(_TrovaPerStatoResponse_QNAME, TrovaPerStatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTutto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaTutto }{@code >}
     */
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaTutto")
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
    @XmlElementDecl(namespace = "http://immobileserver/", name = "trovaTuttoResponse")
    public JAXBElement<TrovaTuttoResponse> createTrovaTuttoResponse(TrovaTuttoResponse value) {
        return new JAXBElement<>(_TrovaTuttoResponse_QNAME, TrovaTuttoResponse.class, null, value);
    }

}
