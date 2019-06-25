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
public class ModificarUsuarioServlet extends HttpServlet {

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

        int id = Integer.parseInt(request.getParameter("id"));

        UsuarioQuerys uq = new UsuarioQuerys();

        Usuario usuario = new Usuario();

        try {
            usuario = uq.show(id);
        } catch (Exception e) {
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<%-- \n"
                    + "    Document   : inscripcion_usuario\n"
                    + "    Created on : 18-06-2019, 19:23:29\n"
                    + "    Author     : y520\n"
                    + "--%>\n"
                    + "\n"
                    + "<%@page contentType=\"text/html\" pageEncoding=\"UTF-8\"%>\n"
                    + "<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                    + "        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n"
                    + "        <title>SCY</title>\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <nav class=\"navbar navbar-dark bg-dark mb-4\">\n"
                    + "            <a href=\"#\" class=\"navbar-brand\">Clinica sano como yogurt</a>\n"
                    + "        </nav>\n"
                    + "        <div class=\"container\">\n"
                    + "            <div class=\"row\">\n"
                    + "                <div class=\"offset-md-3 col-md-6\">\n"
                    + "                    <form action=\"/SanoComoYogurt/Modificar2UsuarioServlet\" method=\"post\">\n"
                    + "                            <input name=\"id\" value=\"" + usuario.getId()+ "\" type=\"hidden\" >\n"
                    + "                        <div class=\"form-group\">\n"
                    + "                            <label for=\"nombre\">Nombre</label>\n"
                    + "                            <input value=\"" + usuario.getNombre() + "\" type=\"text\" class=\"form-control\" name=\"nombre\" aria-describedby=\"nombreHelp\" placeholder=\"Ingresar nombre\">\n"
                    + "                        </div>\n"
                    + "                        <div class=\"form-group\">\n"
                    + "                            <label for=\"pass\">Password</label>\n"
                    + "                            <input value=\"" + usuario.getPassword() + "\" type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\n"
                    + "                        </div>\n"
                    + "                        <div class=\"form-group\">\n"
                    + "                            <label for=\"nombre\">Rut</label>\n"
                    + "                            <input value=\"" + usuario.getRut() + "\" type=\"text\" class=\"form-control\" name=\"rut\" aria-describedby=\"rutHelp\" placeholder=\"Ingresar rut\">\n"
                    + "                        </div>\n"
                    + "                        <div class=\"form-group\">\n"
                    + "                            <label for=\"telefono\">Telefono</label>\n"
                    + "                            <input value=\"" + usuario.getTelefono() + "\" type=\"text\" class=\"form-control\" name=\"telefono\" aria-describedby=\"telefonoHelp\" placeholder=\"Ingresar telefono\">\n"
                    + "                        </div>\n"
                    + "                        <div class=\"form-group\">\n"
                    + "                            <label for=\"correo\">Direccion de correo</label>\n"
                    + "                            <input value=\"" + usuario.getCorreo() + "\" type=\"email\" class=\"form-control\" name=\"correo\" aria-describedby=\"correoHelp\" placeholder=\"Ingresar correo\">\n"
                    + "                        </div>\n"
                    + "                        <input type=\"submit\" class=\"btn btn-primary\" value=\"Enviar\">\n"
                    + "                    </form>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </div>\n"
                    + "        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n"
                    + "        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n"
                    + "        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n"
                    + "    </body>\n"
                    + "</html>\n"
                    + "");
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
