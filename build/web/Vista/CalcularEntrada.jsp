<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Calculadora de Pago de Entradas</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    
    <h2>Calculadora de Pago de Entradas</h2>
    <form action="calcularTotal.jsp" method="post">
        <label for="cantidad_entradas">Cantidad de Entradas:</label>
        <input type="text" id="cantidad_entradas" name="cantidad_entradas"><br><br>
        <label for="precio_entrada">Precio por Entrada:</label>
        <input type="text" id="precio_entrada" name="precio_entrada" value="10" readonly><br><br>
        <input type="submit" value="Calcular Total">
    </form>

    <% 
        String cantidadEntradasStr = request.getParameter("cantidad_entradas");
        String precioEntradaStr = request.getParameter("precio_entrada");
        
        if (cantidadEntradasStr != null && precioEntradaStr != null) {
            try {
                int cantidadEntradas = Integer.parseInt(cantidadEntradasStr);
                int precioEntrada = Integer.parseInt(precioEntradaStr);
                int total = cantidadEntradas * precioEntrada;
                out.println("<p>Total a pagar: $" + total + "</p>");
            } catch (NumberFormatException e) {
                out.println("<p>Por favor, ingrese una cantidad válida de entradas.</p>");
            }
        }
    %>
</body>
</html>
