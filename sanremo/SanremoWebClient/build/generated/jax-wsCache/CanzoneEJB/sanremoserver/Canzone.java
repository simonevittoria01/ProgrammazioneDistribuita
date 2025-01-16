
package sanremoserver;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per canzone complex type.</p>
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.</p>
 * 
 * <pre>{@code
 * <complexType name="canzone">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cantato" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="incipit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="voti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "canzone", propOrder = {
    "cantato",
    "categoria",
    "id",
    "incipit",
    "nome",
    "voti"
})
public class Canzone {

    protected boolean cantato;
    protected String categoria;
    protected int id;
    protected String incipit;
    protected String nome;
    protected int voti;

    /**
     * Recupera il valore della proprietà cantato.
     * 
     */
    public boolean isCantato() {
        return cantato;
    }

    /**
     * Imposta il valore della proprietà cantato.
     * 
     */
    public void setCantato(boolean value) {
        this.cantato = value;
    }

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
     * Recupera il valore della proprietà incipit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncipit() {
        return incipit;
    }

    /**
     * Imposta il valore della proprietà incipit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncipit(String value) {
        this.incipit = value;
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
     * Recupera il valore della proprietà voti.
     * 
     */
    public int getVoti() {
        return voti;
    }

    /**
     * Imposta il valore della proprietà voti.
     * 
     */
    public void setVoti(int value) {
        this.voti = value;
    }

}
