/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DeleteUserServlet")
public class eliminar_user extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String validar = (String) session.getAttribute("nombre");

        if (validar == null || validar.isEmpty()) {
            response.sendRedirect("../includes/login.jsp");
            return;
        }

        String id = request.getParameter("id");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Eliminar Usuarios</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container mt-5'>");
        out.println("<div class='row'>");
        out.println("<div class='col-sm-6 offset-sm-3'>");
        out.println("<div class='alert alert-danger text-center'>");
        out.println("<p>¿Desea confirmar la eliminacion del registro?</p>");
        out.println("</div>");
        out.println("<div class='row'>");
        out.println("<div class='col-sm-6'>");
        out.println("<form action='../includes/_functions.jsp' method='POST'>");
        out.println("<input type='hidden' name='accion' value='eliminar_registro'>");
        out.println("<input type='hidden' name='id' value='" + id + "'>");
        out.println("<input type='submit' value='Eliminar' class='btn btn-danger'>");
        out.println("<a href='user.jsp' class='btn btn-success'>Cancelar</a>");
        out.println("</form>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Manejo del formulario de eliminación si es necesario
    }
}
