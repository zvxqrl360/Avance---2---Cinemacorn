<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>--FORMULARIO--</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/estilosLogin.css"/>
</head>
<body class="layout">
    <section class="form-login">
        <h5>INGRESA CON TU CUENTA DE CINEMACORN</h5>
        <form action="#" method="POST" onsubmit="return validarFormulario()">
            <div class="User">
                <h1>Usuario</h1>
                <input class="controlsU" type="email" name="Usuario" placeholder="Ej: User_123" id="Usuario" oninput="borrarMensajeError()">
            </div>
            <br>
            <div class="password">
                <h1>Contraseña</h1>
                <input class="controlsP" type="password" name="Contraseña" placeholder="" id="Contraseña" oninput="borrarMensajeError()">
            </div>
            <a href="#">¿Olvidaste tu contraseña?</a>
            <input class="buttonE" type="submit" name="submit" value="ENTRAR" id="buttonE" onclick="redirigirAEntrar()">
            <input class="buttonR" type="submit" name="registrate" value="REGISTRARSE" id="buttonR" onclick="redirigirARegistro()">
        </form>
        <div id="mensajeError" class="mensaje-error"></div>
    </section>
    <script src="js/mainLogin.js"></script>
</body>
</html>
