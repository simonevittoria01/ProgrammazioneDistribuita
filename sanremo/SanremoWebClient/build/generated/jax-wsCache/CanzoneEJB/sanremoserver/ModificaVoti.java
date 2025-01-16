
package sanremoserver;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per modificaVoti complex type.</p>
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.</p>
 * 
 * <pre>{@code
 * <complexType name="modificaVoti">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificaVoti", propOrder = {
    "arg0",
    "arg1"
})
public class ModificaVoti {

    protected int arg0;
    protected int arg1;

    /**
     * Recupera il valore della proprietà arg0.
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietà arg0.
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Recupera il valore della proprietà arg1.
     * 
     */
    public int getArg1() {
        return arg1;
    }

    /**
     * Imposta il valore della proprietà arg1.
     * 
     */
    public void setArg1(int value) {
        this.arg1 = value;
    }

}
