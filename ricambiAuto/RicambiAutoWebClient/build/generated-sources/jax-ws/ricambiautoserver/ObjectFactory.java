
package ricambiautoserver;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ricambiautoserver package. 
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

    private static final QName _Aggiorna_QNAME = new QName("http://ricambiautoserver/", "aggiorna");
    private static final QName _AggiornaResponse_QNAME = new QName("http://ricambiautoserver/", "aggiornaResponse");
    private static final QName _Elimina_QNAME = new QName("http://ricambiautoserver/", "elimina");
    private static final QName _EliminaResponse_QNAME = new QName("http://ricambiautoserver/", "eliminaResponse");
    private static final QName _Inserisci_QNAME = new QName("http://ricambiautoserver/", "inserisci");
    private static final QName _InserisciResponse_QNAME = new QName("http://ricambiautoserver/", "inserisciResponse");
    private static final QName _ModificaPrezzo_QNAME = new QName("http://ricambiautoserver/", "modificaPrezzo");
    private static final QName _ModificaPrezzoResponse_QNAME = new QName("http://ricambiautoserver/", "modificaPrezzoResponse");
    private static final QName _Prodotto_QNAME = new QName("http://ricambiautoserver/", "prodotto");
    private static final QName _TrovaDaOrdinare_QNAME = new QName("http://ricambiautoserver/", "trovaDaOrdinare");
    private static final QName _TrovaDaOrdinareResponse_QNAME = new QName("http://ricambiautoserver/", "trovaDaOrdinareResponse");
    private static final QName _TrovaPerCategoria_QNAME = new QName("http://ricambiautoserver/", "trovaPerCategoria");
    private static final QName _TrovaPerCategoriaResponse_QNAME = new QName("http://ricambiautoserver/", "trovaPerCategoriaResponse");
    private static final QName _TrovaPerId_QNAME = new QName("http://ricambiautoserver/", "trovaPerId");
    private static final QName _TrovaPerIdResponse_QNAME = new QName("http://ricambiautoserver/", "trovaPerIdResponse");
    private static final QName _TrovaTutti_QNAME = new QName("http://ricambiautoserver/", "trovaTutti");
    private static final QName _TrovaTuttiResponse_QNAME = new QName("http://ricambiautoserver/", "trovaTuttiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ricambiautoserver
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
     * Create an instance of {@link ModificaPrezzo }
     * 
     * @return
     *     the new instance of {@link ModificaPrezzo }
     */
    public ModificaPrezzo createModificaPrezzo() {
        return new ModificaPrezzo();
    }

    /**
     * Create an instance of {@link ModificaPrezzoResponse }
     * 
     * @return
     *     the new instance of {@link ModificaPrezzoResponse }
     */
    public ModificaPrezzoResponse createModificaPrezzoResponse() {
        return new ModificaPrezzoResponse();
    }

    /**
     * Create an instance of {@link Prodotto }
     * 
     * @return
     *     the new instance of {@link Prodotto }
     */
    public Prodotto createProdotto() {
        return new Prodotto();
    }

    /**
     * Create an instance of {@link TrovaDaOrdinare }
     * 
     * @return
     *     the new instance of {@link TrovaDaOrdinare }
     */
    public TrovaDaOrdinare createTrovaDaOrdinare() {
        return new TrovaDaOrdinare();
    }

    /**
     * Create an instance of {@link TrovaDaOrdinareResponse }
     * 
     * @return
     *     the new instance of {@link TrovaDaOrdinareResponse }
     */
    public TrovaDaOrdinareResponse createTrovaDaOrdinareResponse() {
        return new TrovaDaOrdinareResponse();
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
     * Create an instance of {@link TrovaPerCategoriaResponse }
     * 
     * @return
     *     the new instance of {@link TrovaPerCategoriaResponse }
     */
    public TrovaPerCategoriaResponse createTrovaPerCategoriaResponse() {
        return new TrovaPerCategoriaResponse();
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
     * Create an instance of {@link TrovaTutti }
     * 
     * @return
     *     the new instance of {@link TrovaTutti }
     */
    public TrovaTutti createTrovaTutti() {
        return new TrovaTutti();
    }

    /**
     * Create an instance of {@link TrovaTuttiResponse }
     * 
     * @return
     *     the new instance of {@link TrovaTuttiResponse }
     */
    public TrovaTuttiResponse createTrovaTuttiResponse() {
        return new TrovaTuttiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Aggiorna }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Aggiorna }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "aggiorna")
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
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "aggiornaResponse")
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
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "elimina")
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
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "eliminaResponse")
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
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "inserisci")
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
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "inserisciResponse")
    public JAXBElement<InserisciResponse> createInserisciResponse(InserisciResponse value) {
        return new JAXBElement<>(_InserisciResponse_QNAME, InserisciResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaPrezzo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificaPrezzo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "modificaPrezzo")
    public JAXBElement<ModificaPrezzo> createModificaPrezzo(ModificaPrezzo value) {
        return new JAXBElement<>(_ModificaPrezzo_QNAME, ModificaPrezzo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaPrezzoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificaPrezzoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "modificaPrezzoResponse")
    public JAXBElement<ModificaPrezzoResponse> createModificaPrezzoResponse(ModificaPrezzoResponse value) {
        return new JAXBElement<>(_ModificaPrezzoResponse_QNAME, ModificaPrezzoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prodotto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Prodotto }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "prodotto")
    public JAXBElement<Prodotto> createProdotto(Prodotto value) {
        return new JAXBElement<>(_Prodotto_QNAME, Prodotto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaDaOrdinare }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaDaOrdinare }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "trovaDaOrdinare")
    public JAXBElement<TrovaDaOrdinare> createTrovaDaOrdinare(TrovaDaOrdinare value) {
        return new JAXBElement<>(_TrovaDaOrdinare_QNAME, TrovaDaOrdinare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaDaOrdinareResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaDaOrdinareResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "trovaDaOrdinareResponse")
    public JAXBElement<TrovaDaOrdinareResponse> createTrovaDaOrdinareResponse(TrovaDaOrdinareResponse value) {
        return new JAXBElement<>(_TrovaDaOrdinareResponse_QNAME, TrovaDaOrdinareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoria }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoria }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "trovaPerCategoria")
    public JAXBElement<TrovaPerCategoria> createTrovaPerCategoria(TrovaPerCategoria value) {
        return new JAXBElement<>(_TrovaPerCategoria_QNAME, TrovaPerCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerCategoriaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "trovaPerCategoriaResponse")
    public JAXBElement<TrovaPerCategoriaResponse> createTrovaPerCategoriaResponse(TrovaPerCategoriaResponse value) {
        return new JAXBElement<>(_TrovaPerCategoriaResponse_QNAME, TrovaPerCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaPerId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaPerId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "trovaPerId")
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
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "trovaPerIdResponse")
    public JAXBElement<TrovaPerIdResponse> createTrovaPerIdResponse(TrovaPerIdResponse value) {
        return new JAXBElement<>(_TrovaPerIdResponse_QNAME, TrovaPerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTutti }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaTutti }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "trovaTutti")
    public JAXBElement<TrovaTutti> createTrovaTutti(TrovaTutti value) {
        return new JAXBElement<>(_TrovaTutti_QNAME, TrovaTutti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTuttiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrovaTuttiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ricambiautoserver/", name = "trovaTuttiResponse")
    public JAXBElement<TrovaTuttiResponse> createTrovaTuttiResponse(TrovaTuttiResponse value) {
        return new JAXBElement<>(_TrovaTuttiResponse_QNAME, TrovaTuttiResponse.class, null, value);
    }

}
