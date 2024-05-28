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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/EditUserServlet")
public class editar_user extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String validar = (String) session.getAttribute("nombre");

        if (validar == null || validar.isEmpty()) {
            response.sendRedirect("../includes/login.jsp");
            return;
        }

        String id = request.getParameter("id");

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/r_user", "root", "");
            String query = "SELECT * FROM user WHERE id = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, id);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String correo = resultSet.getString("correo");
                String telefono = resultSet.getString("telefono");
                String password = resultSet.getString("password");
                int rol = resultSet.getInt("rol");

                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<html lang='es-MX'>");
                out.println("<head>");
                out.println("<meta charset='UTF-8'>");
                out.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
                out.println("<title>Registros</title>");
                out.println("<link rel='stylesheet' href='../css/fontawesome-all.min.css'>");
                out.println("<link rel='stylesheet' href='../css/styles.css'>");
                out.println("<link rel='stylesheet' href='../css/es.css'>");
                out.println("</head>");
                out.println("<body id='page-top'>");

                out.println("<form action='../includes/_functions.jsp' method='POST'>");
                out.println("<div id='login'>");
                out.println("<div class='container'>");
                out.println("<div id='login-row' class='row justify-content-center align-items-center'>");
                out.println("<div id='login-column' class='col-md-6'>");
                out.println("<div id='login-box' class='col-md-12'>");
                out.println("<br><br>");
                out.println("<h3 class='text-center'>Editar usuario</h3>");
                out.println("<div class='form-group'>");
                out.println("<label for='nombre' class='form-label'>Nombre *</label>");
                out.println("<input type='text' id='nombre' name='nombre' class='form-control' value='" + nombre + "' required>");
                out.println("</div>");
                out.println("<div class='form-group'>");
                out.println("<label for='username'>Correo:</label><br>");
                out.println("<input type='email' name='correo' id='correo' class='form-control' value='" + correo + "'>");
                out.println("</div>");
                out.println("<div class='form-group'>");
                out.println("<label for='telefono' class='form-label'>Telefono *</label>");
                out.println("<input type='tel' id='telefono' name='telefono' class='form-control' value='" + telefono + "' required>");
                out.println("</div>");
                out.println("<div class='form-group'>");
                out.println("<label for='password'>Contraseña:</label><br>");
                out.println("<input type='password' name='password' id='password' class='form-control' value='" + password + "' required>");
                out.println("</div>");
                out.println("<div class='form-group'>");
                out.println("<label for='rol' class='form-label'>Rol de usuario *</label>");
                out.println("<input type='number' id='rol' name='rol' class='form-control' value='" + rol + "' required>");
                out.println("<input type='hidden' name='accion' value='editar_registro'>");
                out.println("<input type='hidden' name='id' value='" + id + "'>");
                out.println("</div>");
                out.println("<br>");
                out.println("<div class='mb-3'>");
                out.println("<button type='submit' class='btn btn-success'>Editar</button>");
                out.println("<a href='user.jsp' class='btn btn-danger'>Cancelar</a>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</form>");

                out.println("</body>");
                out.println("</html>");
                out.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle form submission if needed
    }
}
