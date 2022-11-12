<%-- 
    Document   : index
    Created on : 11 nov 2022, 21:27:04
    Author     : rmija
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de proveedor</title>
    <h1>${pageContext.request.contextPath}</h1>
    </head>
    <body>
        <h1>SISTEMA DE PROVEEDOR</h1>
        <form action="/SistemaHospital/MostrarMensaje" method="get">
            <table>
                <tr>
                    <td>Código del paciente: </td>
                    <td><input type="text" name="codigoPaciente" required></td>
                </tr>
                <tr>
                    <td>Fecha de nacimiento: </td>
                    <td><input type="date" name="fechaNacimiento" required></td>
                </tr>
                <tr>
                    <td><input type="reset" value="Limpiar"></td>
                    <td><input type="submit" value="Consultar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
