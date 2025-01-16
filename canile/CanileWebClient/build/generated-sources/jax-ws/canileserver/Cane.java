
package canileserver;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cane complex type.</p>
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.</p>
 * 
 * <pre>{@code
 * <complexType name="cane">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="chip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="razza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="stato" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="taglia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cane", propOrder = {
    "chip",
    "eta",
    "id",
    "nome",
    "razza",
    "sesso",
    "stato",
    "taglia"
})
public class Cane {

    protected String chip;
    protected String eta;
    protected int id;
    protected String nome;
    protected String razza;
    protected String sesso;
    protected boolean stato;
    protected String taglia;

    /**
     * Recupera il valore della proprietà chip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChip() {
        return chip;
    }

    /**
     * Imposta il valore della proprietà chip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChip(String value) {
        this.chip = value;
    }

    /**
     * Recupera il valore della proprietà eta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEta() {
        return eta;
    }

    /**
     * Imposta il valore della proprietà eta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEta(String value) {
        this.eta = value;
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
     * Recupera il valore della proprietà razza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazza() {
        return razza;
    }

    /**
     * Imposta il valore della proprietà razza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazza(String value) {
        this.razza = value;
    }

    /**
     * Recupera il valore della proprietà sesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesso() {
        return sesso;
    }

    /**
     * Imposta il valore della proprietà sesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesso(String value) {
        this.sesso = value;
    }

    /**
     * Recupera il valore della proprietà stato.
     * 
     */
    public boolean isStato() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     */
    public void setStato(boolean value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà taglia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaglia() {
        return taglia;
    }

    /**
     * Imposta il valore della proprietà taglia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaglia(String value) {
        this.taglia = value;
    }

}
