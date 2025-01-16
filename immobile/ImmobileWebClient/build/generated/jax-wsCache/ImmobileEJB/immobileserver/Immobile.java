
package immobileserver;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per immobile complex type.</p>
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.</p>
 * 
 * <pre>{@code
 * <complexType name="immobile">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="caricamentoDati" type="{http://immobileserver/}localDate" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="stato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ultimaModifica" type="{http://immobileserver/}localDate" minOccurs="0"/>
 *         <element name="valore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "immobile", propOrder = {
    "caricamentoDati",
    "id",
    "indirizzo",
    "stato",
    "ultimaModifica",
    "valore"
})
public class Immobile {

    protected LocalDate caricamentoDati;
    protected int id;
    protected String indirizzo;
    protected String stato;
    protected LocalDate ultimaModifica;
    protected int valore;

    /**
     * Recupera il valore della proprietà caricamentoDati.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getCaricamentoDati() {
        return caricamentoDati;
    }

    /**
     * Imposta il valore della proprietà caricamentoDati.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setCaricamentoDati(LocalDate value) {
        this.caricamentoDati = value;
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
     * Recupera il valore della proprietà indirizzo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Imposta il valore della proprietà indirizzo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Recupera il valore della proprietà stato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStato() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStato(String value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà ultimaModifica.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getUltimaModifica() {
        return ultimaModifica;
    }

    /**
     * Imposta il valore della proprietà ultimaModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setUltimaModifica(LocalDate value) {
        this.ultimaModifica = value;
    }

    /**
     * Recupera il valore della proprietà valore.
     * 
     */
    public int getValore() {
        return valore;
    }

    /**
     * Imposta il valore della proprietà valore.
     * 
     */
    public void setValore(int value) {
        this.valore = value;
    }

}
