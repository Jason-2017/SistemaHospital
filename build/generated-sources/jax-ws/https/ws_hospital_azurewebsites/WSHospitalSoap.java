
package https.ws_hospital_azurewebsites;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSHospitalSoap", targetNamespace = "https://ws-hospital.azurewebsites.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSHospitalSoap {


    /**
     * verificar si el paciente (afiliado al seguro médico) se encuentra activo
     * 
     * @param nitProveedor
     * @param fechaNacimiento
     * @param codigoPaciente
     * @param fechaInicioCobertura
     * @return
     *     returns https.ws_hospital_azurewebsites.WSCONSULTAPROVEEDOR
     */
    @WebMethod(operationName = "servicioweb_consultaproveedor", action = "https://ws-hospital.azurewebsites.net/servicioweb_consultaproveedor")
    @WebResult(name = "servicioweb_consultaproveedorResult", targetNamespace = "https://ws-hospital.azurewebsites.net/")
    @RequestWrapper(localName = "servicioweb_consultaproveedor", targetNamespace = "https://ws-hospital.azurewebsites.net/", className = "https.ws_hospital_azurewebsites.ServiciowebConsultaproveedor")
    @ResponseWrapper(localName = "servicioweb_consultaproveedorResponse", targetNamespace = "https://ws-hospital.azurewebsites.net/", className = "https.ws_hospital_azurewebsites.ServiciowebConsultaproveedorResponse")
    public WSCONSULTAPROVEEDOR serviciowebConsultaproveedor(
        @WebParam(name = "nitProveedor", targetNamespace = "https://ws-hospital.azurewebsites.net/")
        String nitProveedor,
        @WebParam(name = "codigoPaciente", targetNamespace = "https://ws-hospital.azurewebsites.net/")
        String codigoPaciente,
        @WebParam(name = "fechaNacimiento", targetNamespace = "https://ws-hospital.azurewebsites.net/")
        XMLGregorianCalendar fechaNacimiento,
        @WebParam(name = "fechaInicioCobertura", targetNamespace = "https://ws-hospital.azurewebsites.net/")
        XMLGregorianCalendar fechaInicioCobertura);

    /**
     * Consulta afiliado
     * 
     * @param fechaNacimiento
     * @param codigoPaciente
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "servicioweb_consultaafiliado", action = "https://ws-hospital.azurewebsites.net/servicioweb_consultaafiliado")
    @WebResult(name = "servicioweb_consultaafiliadoResult", targetNamespace = "https://ws-hospital.azurewebsites.net/")
    @RequestWrapper(localName = "servicioweb_consultaafiliado", targetNamespace = "https://ws-hospital.azurewebsites.net/", className = "https.ws_hospital_azurewebsites.ServiciowebConsultaafiliado")
    @ResponseWrapper(localName = "servicioweb_consultaafiliadoResponse", targetNamespace = "https://ws-hospital.azurewebsites.net/", className = "https.ws_hospital_azurewebsites.ServiciowebConsultaafiliadoResponse")
    public String serviciowebConsultaafiliado(
        @WebParam(name = "codigoPaciente", targetNamespace = "https://ws-hospital.azurewebsites.net/")
        int codigoPaciente,
        @WebParam(name = "fechaNacimiento", targetNamespace = "https://ws-hospital.azurewebsites.net/")
        XMLGregorianCalendar fechaNacimiento);

}
