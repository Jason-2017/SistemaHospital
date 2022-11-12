/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
/**
 *
 * @author rmija
 */
@WebServlet(name = "MostrarMensaje", urlPatterns = {"/MostrarMensaje"})
public class MostrarMensaje extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String codigoPaciente = request.getParameter("codigoPaciente");
            String fechaNacimiento = request.getParameter("fechaNacimiento");
            String Response = "";
//            try {
//                Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
//                Response = serviciowebConsultaafiliado(Integer.parseInt(codigoPaciente), converFeca(date1));
//                System.out.println(Response);
//            } catch (ParseException ex) {}
                    
            out.println("<!DOCTYPE html>");
            out.println("<html>"+request.getContextPath());
            out.println("<head>");
            out.println("<title>Respuesta de consulta de afiliados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Respuesta de consulta de afiliados</h1>");
            out.println("<br>");
            out.println("<h2> Codigo paciente consultado: " + codigoPaciente + "</h2>");
            out.println("<h2> Fecha de nacimiento paciente: " + fechaNacimiento + "</h2>");
            out.println("<h2> Respuesta de servicio web: " + Response + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static String serviciowebConsultaafiliado(int codigoPaciente, javax.xml.datatype.XMLGregorianCalendar fechaNacimiento) {
        https.ws_hospital_azurewebsites.WSHospital service = new https.ws_hospital_azurewebsites.WSHospital();
        https.ws_hospital_azurewebsites.WSHospitalSoap port = service.getWSHospitalSoap();
        return port.serviciowebConsultaafiliado(codigoPaciente, fechaNacimiento);
    }
    
    private static XMLGregorianCalendar converFeca(Date fecha){
        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(fecha);
        
        try {
            xmlDate = DatatypeFactory.newInstance()
                          .newXMLGregorianCalendar(gc);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return xmlDate;
    }

}
