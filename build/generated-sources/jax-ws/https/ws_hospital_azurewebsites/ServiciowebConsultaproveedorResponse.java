
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
 *         &lt;element name="servicioweb_consultaproveedorResult" type="{https://ws-hospital.azurewebsites.net/}WS_CONSULTAPROVEEDOR" minOccurs="0"/&gt;
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
    "serviciowebConsultaproveedorResult"
})
@XmlRootElement(name = "servicioweb_consultaproveedorResponse")
public class ServiciowebConsultaproveedorResponse {

    @XmlElement(name = "servicioweb_consultaproveedorResult")
    protected WSCONSULTAPROVEEDOR serviciowebConsultaproveedorResult;

    /**
     * Obtiene el valor de la propiedad serviciowebConsultaproveedorResult.
     * 
     * @return
     *     possible object is
     *     {@link WSCONSULTAPROVEEDOR }
     *     
     */
    public WSCONSULTAPROVEEDOR getServiciowebConsultaproveedorResult() {
        return serviciowebConsultaproveedorResult;
    }

    /**
     * Define el valor de la propiedad serviciowebConsultaproveedorResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCONSULTAPROVEEDOR }
     *     
     */
    public void setServiciowebConsultaproveedorResult(WSCONSULTAPROVEEDOR value) {
        this.serviciowebConsultaproveedorResult = value;
    }

}
