<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
    crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Venta de Entradas</title>
    <link rel="stylesheet" href="css/estiloCompraEntrada.css"/>
</head>
<body>
    <h2>Venta de Entradas</h2>
    <form action="procesarCompra.jsp" method="post">
        <div>
            <label for="peliculas">Películas:</label>
            <select id="peliculas" name="peliculas">
                <option value="elementos">Elementos</option>
                <option value="la-monja">La Monja</option>
                <option value="five-nights-at-freddys">Five nights at Freddy's</option>
                <option value="oppenheimer">Oppenheimer</option>
                <option value="spider-man">Spider-Man: A través del Spider-Verso</option>
                <option value="red">Red</option>
                <option value="barbie">Barbie</option>
            </select>
        </div>
        <div>
            <label for="cantidad_entradas">Cantidad de Entradas:</label>
            <input type="number" id="cantidad_entradas" name="cantidad_entradas" required>
        </div>
        <div>
            <label for="precio_entrada">Precio por Entrada:</label>
            <input type="number" id="precio_entrada" name="precio_entrada" value="10" readonly required>
        </div>
        <div>
            <label for="metodo_pago">Método de Pago:</label>
            <select id="metodo_pago" name="metodo_pago">
                <option value="tarjeta">Tarjeta de Crédito</option>
                <option value="efectivo">Efectivo</option>
            </select>
        </div>
        <h2>Total a Pagar: S/<span id="total_a_pagar">0.00</span></h2>
        <button type="button" onclick="calcularTotal()">Calcular Total</button>
        <button type="submit">Comprar</button>
    </form>

    <script>
        function calcularTotal() {
            var peliculaSeleccionada = document.getElementById("peliculas").value;
            var cantidadEntradas = parseFloat(document.getElementById("cantidad_entradas").value);
            var precioEntrada = parseFloat(document.getElementById("precio_entrada").value);
            var total = cantidadEntradas * precioEntrada;

            if (peliculaSeleccionada === "spider-man") {
                total *= 1.5; // Aplicar un 50% de recargo si selecciona Spider-Man
            }

            document.getElementById("total_a_pagar").textContent = total.toFixed(2);
        }
    </script>
</body>
</html>
