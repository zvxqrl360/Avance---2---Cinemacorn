/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "registro_servlet", urlPatterns = {"/registro_servlet"})
public class registro_servlet extends HttpServlet {

    controlador_registro ctrlRegistro = new controlador_registro();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registro_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registro_servlet at " + request.getContextPath() + "</h1>");
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

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni_usuario = request.getParameter("dni_usuario");
        String nickname_usuario = request.getParameter("nickname_usuario");
        String nombres_usuario = request.getParameter("nombres_usuario");
        String ape_paterno_usuario = request.getParameter("ape_paterno_usuario");
        String ape_materno_usuario = request.getParameter("ape_materno_usuario");
        String email_usuario = request.getParameter("email_usuario");
        String contrasena_usuario = request.getParameter("contrasena_usuario");
        String telefono_usuario = request.getParameter("telefono_usuario");
        
        usuarios usu = new usuarios();
        usu.setDni_usuario(dni_usuario);
        usu.setNickname_usuario(nickname_usuario);
        usu.setNombres_usuario(nombres_usuario);
        usu.setApe_paterno_usuario(ape_paterno_usuario);
        usu.setApe_materno_usuario(ape_materno_usuario);
        usu.setEmail_usuario(email_usuario);
        usu.setContrasena_usuario(contrasena_usuario);
        usu.setTelefono_usuario(telefono_usuario);
        
        ctrlRegistro.crear_registro(usu);
    }

    
   
    @Override
    public String getServletInfo() {
        return "Short description";
    } 
}

