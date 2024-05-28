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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/UsuariosServlet")
public class lector extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String validar = (String) session.getAttribute("nombre");

        if (validar == null || validar.isEmpty()) {
            response.sendRedirect("../includes/login.jsp");
            return;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<link rel='stylesheet' href='../css/fontawesome-all.min.css'>");
        out.println("<link rel='stylesheet' href='../css/estilo.css'>");
        out.println("<link rel='stylesheet' href='../css/es.css'>");
        out.println("<title>Usuarios</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container is-fluid'>");
        out.println("<div class='col-xs-12'>");
        out.println("<h1>Bienvenido Lector " + validar + "</h1>");
        out.println("<br>");
        out.println("<h1>Lista de usuarios</h1>");
        out.println("<br>");
        out.println("<div>");
        out.println("<a class='btn btn-warning' href='../includes/_sesion/cerrarSesion.jsp'>Log Out");
        out.println("<i class='fa fa-power-off' aria-hidden='true'></i>");
        out.println("</a>");
        out.println("<a class='btn btn-primary' href='../includes/lectorexcel.jsp'>Excel");
        out.println("<i class='fa fa-table' aria-hidden='true'></i>");
        out.println("</a>");
        out.println("</div>");
        out.println("<br>");
        out.println("<table class='table table-striped table-dark' id='table_id'>");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th>Nombre</th>");
        out.println("<th>Correo</th>");
        out.println("<th>Telefono</th>");
        out.println("<th>Fecha</th>");
        out.println("<th>Rol</th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/r_user", "root", "");
            statement = connection.createStatement();
            String SQL = "SELECT user.id, user.nombre, user.correo, user.password, user.telefono, user.fecha, permisos.rol " +
                         "FROM user LEFT JOIN permisos ON user.rol = permisos.id";
            resultSet = statement.executeQuery(SQL);

            if (resultSet.next()) {
                do {
                    out.println("<tr>");
                    out.println("<td>" + resultSet.getString("nombre") + "</td>");
                    out.println("<td>" + resultSet.getString("correo") + "</td>");
                    out.println("<td>" + resultSet.getString("telefono") + "</td>");
                    out.println("<td>" + resultSet.getString("fecha") + "</td>");
                    out.println("<td>" + resultSet.getString("rol") + "</td>");
                    out.println("</tr>");
                } while (resultSet.next());
            } else {
                out.println("<tr class='text-center'>");
                out.println("<td colspan='16'>No existen registros</td>");
                out.println("</tr>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        out.println("</tbody>");
        out.println("</table>");
        out.println("<script src='https://code.jquery.com/jquery-3.6.0.min.js' integrity='sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=' crossorigin='anonymous'></script>");
        out.println("<script type='text/javascript' charset='utf8' src='https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js'></script>");
        out.println("<script src='../js/user.js'></script>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
