/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DB.UsuarioQuerys;
import Models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author y520
 */
public class InscripcionUsuarioServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        Usuario usuario = new Usuario();
        UsuarioQuerys uq = new UsuarioQuerys();

        usuario.setCorreo(request.getParameter("correo"));
        usuario.setNombre(request.getParameter("nombre"));
        usuario.setPassword(request.getParameter("password"));
        usuario.setRut(request.getParameter("rut"));
        usuario.setTelefono(request.getParameter("telefono"));

        try {
            uq.store(usuario);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InscripcionMedicoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Agregado");
            out.println("</br> </b>");
            out.println("Usuario: " + usuario.getNombre());
            out.println("</br>");
            out.println("Password: " + usuario.getPassword());
            out.println("</br>");
            out.println("Correo: " + usuario.getCorreo());
            out.println("</br>");
            out.println("<label><a href=\"/SanoComoYogurt\">Volver</a></label>");
            out.println("</body>");
            out.println("</html>");            
        } catch (Exception e) {
            System.out.println(e);
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

}
