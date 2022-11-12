
package https.ws_hospital_azurewebsites;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para WS_CONSULTAPROVEEDOR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CONSULTAPROVEEDOR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nitProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoPacienteConsultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaCoberturaConsultada" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="respuestaServicioWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaConsulta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NitValido" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descNitConsultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CONSULTAPROVEEDOR", propOrder = {
    "nitProveedor",
    "codigoPacienteConsultado",
    "fechaCoberturaConsultada",
    "respuestaServicioWeb",
    "fechaConsulta",
    "nitValido",
    "descNitConsultado"
})
public class WSCONSULTAPROVEEDOR {

    protected String nitProveedor;
    protected String codigoPacienteConsultado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCoberturaConsultada;
    protected String respuestaServicioWeb;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaConsulta;
    @XmlElement(name = "NitValido")
    protected int nitValido;
    protected String descNitConsultado;

    /**
     * Obtiene el valor de la propiedad nitProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitProveedor() {
        return nitProveedor;
    }

    /**
     * Define el valor de la propiedad nitProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitProveedor(String value) {
        this.nitProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPacienteConsultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPacienteConsultado() {
        return codigoPacienteConsultado;
    }

    /**
     * Define el valor de la propiedad codigoPacienteConsultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPacienteConsultado(String value) {
        this.codigoPacienteConsultado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCoberturaConsultada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCoberturaConsultada() {
        return fechaCoberturaConsultada;
    }

    /**
     * Define el valor de la propiedad fechaCoberturaConsultada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCoberturaConsultada(XMLGregorianCalendar value) {
        this.fechaCoberturaConsultada = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaServicioWeb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuestaServicioWeb() {
        return respuestaServicioWeb;
    }

    /**
     * Define el valor de la propiedad respuestaServicioWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuestaServicioWeb(String value) {
        this.respuestaServicioWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaConsulta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaConsulta() {
        return fechaConsulta;
    }

    /**
     * Define el valor de la propiedad fechaConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaConsulta(XMLGregorianCalendar value) {
        this.fechaConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad nitValido.
     * 
     */
    public int getNitValido() {
        return nitValido;
    }

    /**
     * Define el valor de la propiedad nitValido.
     * 
     */
    public void setNitValido(int value) {
        this.nitValido = value;
    }

    /**
     * Obtiene el valor de la propiedad descNitConsultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescNitConsultado() {
        return descNitConsultado;
    }

    /**
     * Define el valor de la propiedad descNitConsultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescNitConsultado(String value) {
        this.descNitConsultado = value;
    }

}
