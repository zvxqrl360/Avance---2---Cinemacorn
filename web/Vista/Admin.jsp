<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Gestión de Contactos</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<div class="container">
    <h2>Gestión de Contactos</h2>
    
    <div class="section">
        <h3>Ingresar Datos</h3>
        <form action="ContactController" method="post">
            <label for="id">ID:</label>
            <input type="text" id="id" name="id">
            
            <label for="nombres">NOMBRES:</label>
            <input type="text" id="nombres" name="nombres">
            
            <label for="correo">CORREO:</label>
            <input type="email" id="correo" name="correo">
            
            <label for="telefono">TELEFONO:</label>
            <input type="text" id="telefono" name="telefono">
            
            <div class="operations">
                <button type="submit" name="action" value="agregar">AGREGAR</button>
                <button type="submit" name="action" value="listar">LISTAR</button>
                <button type="submit" name="action" value="update">UPDATE</button>
                <button type="submit" name="action" value="delete">DELETE</button>
            </div>
        </form>
    </div>

    <div class="section">
        <button class="edit-btn">EDITAR</button>
        <button class="new-btn">NUEVO</button>
    </div>

    <div class="section">
        <h3>Detalle</h3>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NOMBRES</th>
                    <th>CORREO</th>
                    <th>TELEFONO</th>
                </tr>
            </thead>
            <tbody>
                <!-- Aquí se pueden iterar los datos obtenidos desde el backend -->
                <!-- Por ejemplo:
                <c:forEach var="contact" items="${contacts}">
                    <tr>
                        <td>${contact.id}</td>
                        <td>${contact.nombres}</td>
                        <td>${contact.correo}</td>
                        <td>${contact.telefono}</td>
                    </tr>
                </c:forEach>
                -->
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
