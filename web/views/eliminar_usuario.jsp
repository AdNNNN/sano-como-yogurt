<%-- 
    Document   : inscripcion_usuario
    Created on : 18-06-2019, 19:23:29
    Author     : y520
--%>

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
                    <form action="/SanoComoYogurt/EliminarUsuarioServlet" method="post">
                        <div class="form-group">
                            <label for="id">ID</label>
                            <input type="text" class="form-control" name="id" aria-describedby="idHelp" placeholder="Ingresar id">
                        </div>
                        <input type="submit" class="btn btn-primary" value="Buscar">
                    </form>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
