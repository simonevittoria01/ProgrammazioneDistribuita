
package ricambiautoserver;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per prodotto complex type.</p>
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.</p>
 * 
 * <pre>{@code
 * <complexType name="prodotto">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="disponibilita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="prezzo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="venduti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prodotto", propOrder = {
    "categoria",
    "disponibilita",
    "id",
    "nome",
    "prezzo",
    "venduti"
})
public class Prodotto {

    protected String categoria;
    protected int disponibilita;
    protected int id;
    protected String nome;
    protected double prezzo;
    protected int venduti;

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
     * Recupera il valore della proprietà disponibilita.
     * 
     */
    public int getDisponibilita() {
        return disponibilita;
    }

    /**
     * Imposta il valore della proprietà disponibilita.
     * 
     */
    public void setDisponibilita(int value) {
        this.disponibilita = value;
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
     * Recupera il valore della proprietà prezzo.
     * 
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * Imposta il valore della proprietà prezzo.
     * 
     */
    public void setPrezzo(double value) {
        this.prezzo = value;
    }

    /**
     * Recupera il valore della proprietà venduti.
     * 
     */
    public int getVenduti() {
        return venduti;
    }

    /**
     * Imposta il valore della proprietà venduti.
     * 
     */
    public void setVenduti(int value) {
        this.venduti = value;
    }

}
