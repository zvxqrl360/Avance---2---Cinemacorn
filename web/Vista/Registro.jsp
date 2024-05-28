<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/estilosRegistro.css"/>
<link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet"> 
</head>
<body>
 <div class="container">
  <h1>Registro de Usuario</h1>
  <div class="card">
   <div class="card-body">
    <form id="formulario" action="${contextPath}/registro_servlet" method="post">
     
        <div id="grupo_nickname" class="form-group row formulario_grupo">
         <label for="nickname_usuario" class="col-sm-2 col-form-label">Usuario</label>
         <div class="col-sm-7">
          <input type="text" class="form-control" id="nickname" name="nickname_usuario" placeholder="Jose_2002">
          <p class="formulario_input-error">El usuario tiene que ser de 4 a 20 caracteres y solo puede contener números, letras y guion bajo.</p>
         </div>
        </div>

        <div id="grupo_nombres" class="form-group row formulario_grupo">
         <label for="nombres_usuario" class="col-sm-2 col-form-label">Nombres</label>
         <div class="col-sm-7">
          <input type="text" class="form-control" id="nombres" name="nombres_usuario" placeholder="Jose">
          <p class="formulario_input-error">El nombre solo puede contener letras y espacios.</p>
         </div>
        </div>

        <div id="grupo_ape_paterno" class="form-group row formulario_grupo">
         <label for="ape_paterno_usuario" class="col-sm-2 col-form-label">Apellido Paterno</label>
         <div class="col-sm-7">
          <input type="text" class="form-control" id="ape_paterno" name="ape_paterno_usuario" placeholder="Alvarez">
          <p class="formulario_input-error">El apellido solo puede contener letras y espacios.</p>
         </div>
        </div>

        <div id="grupo_ape_materno" class="form-group row formulario_grupo">
         <label for="ape_materno_usuario" class="col-sm-2 col-form-label">Apellido Materno</label>
         <div class="col-sm-7">
          <input type="text" class="form-control" id="ape_materno" name="ape_materno_usuario" placeholder="Acarapi">
          <p class="formulario_input-error">El apellido solo puede contener letras y espacios.</p>
         </div>
        </div>

        <div id="grupo_dni" class="form-group row formulario_grupo">
         <label for="dni_usuario" class="col-sm-2 col-form-label">DNI</label>
         <div class="col-sm-7">
          <input type="text" class="form-control" id="dni" name="dni_usuario" placeholder="76023420">
          <p class="formulario_input-error">El DNI tiene que ser de 8 números.</p>
         </div>
        </div>

        <div id="grupo_telefono" class="form-group row formulario_grupo">
         <label for="telefono_usuario" class="col-sm-2 col-form-label">Teléfono</label>
         <div class="col-sm-7">
          <input type="text" class="form-control" id="telefono" name="telefono_usuario" placeholder="+51 987654321">
          <p class="formulario_input-error">El teléfono deber ser de 9 dígitos en Perú (+51).</p>
         </div>
        </div>

        <div id="grupo_correo" class="form-group row formulario_grupo">
         <label for="email_usuario" class="col-sm-2 col-form-label">Correo Electrónico</label>
         <div class="col-sm-7">
          <input type="text" class="form-control" id="correo" name="email_usuario" placeholder="jose2002@correo.com">
          <p class="formulario_input-error">El correo solo puede contener letras, números, puntos, guiones y guion bajo.</p>
         </div>
        </div>

        <div id="grupo_password" class="form-group row formulario_grupo">
         <label for="contrasena_usuario" class="col-sm-2 col-form-label">Contraseña</label>
         <div class="col-sm-7">
          <input type="password" class="form-control" id="password" name="contrasena_usuario" placeholder="">
          <p class="formulario_input-error">La contraseña tiene que ser de 4 a 40 dígitos.</p>
         </div>
        </div>

        <div id="grupo_password2" class="form-group row formulario_grupo">
         <label for="contrasena2_usuario" class="col-sm-2 col-form-label">Confirmar Contraseña</label>
         <div class="col-sm-7">
          <input type="password" class="form-control" id="password2" name="contrasena2_usuario" placeholder="">
          <p class="formulario_input-error">Ambas contraseñas deben ser iguales.</p>
         </div>
        </div>

        <div class="form-group row">
         <div class="col-sm-7 offset-sm-2">
           <input type="checkbox" id="terminos">
           <label for="terminos">Acepto los términos y condiciones</label>
         </div>
        </div>

        <div id="formulario_mensaje" class="formulario_mensaje">
         <p><i class="fa fa-exclamation-triangle"></i> <b>Error:</b> Por favor rellena el formulario correctamente.</p>
        </div>

        <div id="formulario_mensaje-exito" class="formulario_mensaje-exito">
         <p><i class="fa fa-check"></i> Formulario enviado exitosamente!</p>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
   </div>
  </div>
 </div>
    <% 
        String successParam = request.getParameter("success");
        if (successParam != null && successParam.equals("true")) {
    %>
            <p style="color: green;">¡Registro exitoso!</p>
    <% 
        } else if (successParam != null && successParam.equals("false")) {
    %>
            <p style="color: red;">Hubo un error en el registro.</p>
    <% 
        }
    %>
 <script src="https://kit.fontawesome.com/a076d05399.js"></script> <!-- Para los iconos de validación -->
 <script src="${pageContext.request.contextPath}/js/mainRegistro.js"></script> <!-- Ruta a tu archivo JS de validación -->
</body>
</html>
