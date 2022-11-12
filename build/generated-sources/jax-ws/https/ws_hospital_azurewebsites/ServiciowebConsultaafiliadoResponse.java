
package https.ws_hospital_azurewebsites;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servicioweb_consultaafiliadoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviciowebConsultaafiliadoResult"
})
@XmlRootElement(name = "servicioweb_consultaafiliadoResponse")
public class ServiciowebConsultaafiliadoResponse {

    @XmlElement(name = "servicioweb_consultaafiliadoResult")
    protected String serviciowebConsultaafiliadoResult;

    /**
     * Obtiene el valor de la propiedad serviciowebConsultaafiliadoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiciowebConsultaafiliadoResult() {
        return serviciowebConsultaafiliadoResult;
    }

    /**
     * Define el valor de la propiedad serviciowebConsultaafiliadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiciowebConsultaafiliadoResult(String value) {
        this.serviciowebConsultaafiliadoResult = value;
    }

}
