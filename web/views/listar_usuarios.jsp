<%-- 
    Document   : listar_usuarios
    Created on : 22-06-2019, 15:25:57
    Author     : y520
--%>

<%@page import="Models.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="DB.UsuarioQuerys"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>SCY</title>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark mb-4">
            <a href="#" class="navbar-brand">Clinica sano como yogurt</a>
        </nav>
        <div class="container">
            <div class="row">
                <div class="offset-md-3 col-md-6">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Password</th>
                                <th scope="col">Rut</th>
                                <th scope="col">Telefono</th>
                                <th scope="col">Correo</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% UsuarioQuerys uq = new UsuarioQuerys();
                            List<Usuario> list = uq.index();%>
                            <%for (Usuario elem : list) { %> 
                            <tr>
                                <th scope="row"><%= elem.getId() %></th>
                                <td><%= elem.getNombre()%></td>
                                <td><%= elem.getPassword() %></td>
                                <td><%= elem.getRut() %></td>
                                <td><%= elem.getTelefono() %></td>
                                <td><%= elem.getCorreo() %></td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
