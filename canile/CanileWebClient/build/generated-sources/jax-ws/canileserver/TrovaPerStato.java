
package canileserver;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per trovaPerStato complex type.</p>
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.</p>
 * 
 * <pre>{@code
 * <complexType name="trovaPerStato">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="arg0" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trovaPerStato", propOrder = {
    "arg0"
})
public class TrovaPerStato {

    protected boolean arg0;

    /**
     * Recupera il valore della proprietà arg0.
     * 
     */
    public boolean isArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietà arg0.
     * 
     */
    public void setArg0(boolean value) {
        this.arg0 = value;
    }

}
