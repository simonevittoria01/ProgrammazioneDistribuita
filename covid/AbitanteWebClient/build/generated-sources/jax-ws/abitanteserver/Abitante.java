
package abitanteserver;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abitante complex type.</p>
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.</p>
 * 
 * <pre>{@code
 * <complexType name="abitante">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="contrattoCovid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="eta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="genere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="interesseVaccino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numMalattiePregresse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="priorita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abitante", propOrder = {
    "categoria",
    "cognome",
    "contrattoCovid",
    "eta",
    "genere",
    "id",
    "interesseVaccino",
    "nome",
    "numMalattiePregresse",
    "priorita"
})
public class Abitante {

    protected String categoria;
    protected String cognome;
    protected boolean contrattoCovid;
    protected int eta;
    protected String genere;
    protected int id;
    protected String interesseVaccino;
    protected String nome;
    protected int numMalattiePregresse;
    protected String priorita;

    /**
     * Recupera il valore della proprietà categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Imposta il valore della proprietà categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà contrattoCovid.
     * 
     */
    public boolean isContrattoCovid() {
        return contrattoCovid;
    }

    /**
     * Imposta il valore della proprietà contrattoCovid.
     * 
     */
    public void setContrattoCovid(boolean value) {
        this.contrattoCovid = value;
    }

    /**
     * Recupera il valore della proprietà eta.
     * 
     */
    public int getEta() {
        return eta;
    }

    /**
     * Imposta il valore della proprietà eta.
     * 
     */
    public void setEta(int value) {
        this.eta = value;
    }

    /**
     * Recupera il valore della proprietà genere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenere() {
        return genere;
    }

    /**
     * Imposta il valore della proprietà genere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenere(String value) {
        this.genere = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà interesseVaccino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteresseVaccino() {
        return interesseVaccino;
    }

    /**
     * Imposta il valore della proprietà interesseVaccino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteresseVaccino(String value) {
        this.interesseVaccino = value;
    }

    /**
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà numMalattiePregresse.
     * 
     */
    public int getNumMalattiePregresse() {
        return numMalattiePregresse;
    }

    /**
     * Imposta il valore della proprietà numMalattiePregresse.
     * 
     */
    public void setNumMalattiePregresse(int value) {
        this.numMalattiePregresse = value;
    }

    /**
     * Recupera il valore della proprietà priorita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorita() {
        return priorita;
    }

    /**
     * Imposta il valore della proprietà priorita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorita(String value) {
        this.priorita = value;
    }

}
