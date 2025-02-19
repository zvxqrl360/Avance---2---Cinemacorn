<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>CINEMACORN</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Vista/css/estilosPaginaPrincipal.css"/>
</head>
<body>
    <header>
        <div class="anchoHeader">
            <div class="logo">
                <img src="Vista/imagenes/paginaPrincipal/iconos/logoPrincipal.png" class="logoPrincipal" alt="Logo Principal">
            </div>
            <h1>CINEMACORN</h1>
            
            <nav id="navPerfil">
                <ul>
                    <li><a href="Vista/Login.jsp">Iniciar Sesión</a></li>
                    <li><a href="Vista/Registro.jsp">Registrarse</a></li>
                </ul>
            </nav>
            <div class="imgPerfil">
                <a href="#">
                    <img src="Vista/imagenes/paginaPrincipal/iconos/fotoPerfilPred.png" class="fotoPerfilPred" alt="Foto de Perfil Predeterminado">
                </a>
            </div>
        </div>
        
        <br>
        
        <div class="anchoHeader">
            <div class="panelNav">
                <nav id="listaPanelNav">
                    <ul>
                        <li><a href="Vista/Peliculas.jsp">Películas</a></li>
                        <li><a href="Vista/Cines.jsp">Cines</a></li>
                        <li><a href="Vista/Promociones.jsp">Promociones</a></li>
                    </ul>
                </nav>
            </div>
            <div class="search">
                <div class="txtaSearch">
                    <input type="text" name="buscar" class="buscar" size="30" 
                           maxlength="50" minlength="2" 
                           placeholder="Ingrese el nombre de una película">
                </div>
                <div class="btnSearch">
                    <button type="submit" class="btnBuscar">Buscar</button>
                </div>
            </div>
        </div>
    </header>
    
    <br>
        
    <div class="anchoBody">
        <div class="panelNovedades">
            <h2>Novedades</h2>
            <div class="sliderNov">
                <ul>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/novedades/elExorcistaCreyentes_nov.png" alt="nov01"/></a></li>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/novedades/elCasoMonroy_nov.png" alt="nov02"/></a></li>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/novedades/laMonja2_nov.png" alt="nov03"/></a></li>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/novedades/pirú_nov.png" alt="nov04"/></a></li>
                </ul>
            </div>
        </div>
        <br>
        <div class="panelCartelera">
            <div class="titleCartelera">
                <h2 class="cartelera">Cartelera</h2>
            </div>
            <div class="cartVerTodos">
                <a class="verTodos" href="#">Ver todos</a>
            </div>
            <div class="listaCartelera">
                <ul>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/cartelera/elExorcistaCreyentes.png" alt="cart01"/></a></li>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/cartelera/sonidosDeLibertad.png" alt="cart02"/></a></li>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/cartelera/pirú.png" alt="cart03"/></a></li>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/cartelera/laMonja2.png" alt="cart04"/></a></li>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/cartelera/elCasoMonroy.png" alt="cart05"/></a></li>
                    <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/cartelera/oppenheimer.png" alt="cart06"/></a></li>
                </ul>
            </div>
        </div>
        <br>
        <div class="panelOtros">
            <div class="panelProxEstr">
                <div class="titleProxEstr">
                    <h2 class="proxEstr">Próximos Estrenos</h2>
                </div>
                <div class="proxEstrVerTodos">
                    <a class="verTodos" href="#">Ver todos</a>
                </div>
                <div class="listaProxEstr">
                    <ul>
                        <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/proxEstrenos/fnafMovie.png" alt="proxEstr01"/></a></li>
                        <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/proxEstrenos/pawPatrol2.png" alt="proxEstr02"/></a></li>
                        <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/proxEstrenos/susyDiaz.png" alt="proxEstr03"/></a></li>
                    </ul>
                </div>
            </div>
           
            <div class="panelPromoc">
                <div class="titlePromoc">
                    <h2 class="promociones">Promociones</h2>
                </div>
                <div class="promocVerTodos">
                    <a class="verTodos" href="#">Ver todos</a>
                </div>
                <div class="listaProm">
                    <ul>
                        <li><a href="#"><img src="Vista/imagenes/paginaPrincipal/posters/promociones/2x1.png" alt="prom01"/></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <br>

    <footer>
        <div class="anchoFooter">
            <div class="panelSocialMedia">
                <h2>Síguenos en:</h2>
                <br>
                <div class="twitter">
                    <a href="#">
                        <img src="Vista/imagenes/paginaPrincipal/iconos/iconoTwitter.png" class="iconoTwitter" alt="Icono Twitter">
                    </a>
                    <h3>CINEMACORN_PERU</h3>
                </div>
                <div class="facebook">
                    <a href="#">
                        <img src="Vista/imagenes/paginaPrincipal/iconos/iconoFacebook.png" class="iconoFacebook" alt="Icono Facebook">
                    </a>
                    <h3>CINEMACORN_PERU</h3>
                </div>
                <div class="instagram">
                    <a href="#">
                        <img src="Vista/imagenes/paginaPrincipal/iconos/iconoInstagram.png" class="iconoInstagram" alt="Icono Instagram">
                    </a>
                    <h3>CINEMACORN_PERU</h3>
                </div>
            </div>
            <div class="panelAtenCliente">
                <h2>Atención al Cliente</h2>
                <br>
                <a href="#">Ver boletas electrónicas</a>
                <a href="#">
                    <img src="Vista/imagenes/paginaPrincipal/iconos/anuncioAtenCliente.png" class="anuncioAtenCliente" alt="Anuncio">
                </a>
            </div>
            <div class="panelContactanos">
                <h2>Contáctanos</h2>
                <a href="Vista/Contactanos.php">Envianos un Correo</a>
                <a href="#">Ventas Corporativas</a>
                <a href="#">Términos y Condiciones</a>
                <a href="#">Políticas y Provacidad</a>
            </div>
            <div class="panelFooterOtros">
                <div class="panelOtrosServicios">
                    <h2>Otros Servicios</h2>
                    <a href="#">Eventos Especiales</a>
                    <a href="#">Publicidad</a>
                </div>
                <div class="panelDescargaApp">
                    <h2>Descarga la app:</h2>
                    <a href="#">
                        <img src="Vista/imagenes/paginaPrincipal/iconos/iconoAppStore.png" class="iconoAppStore" alt="Icono App Store">
                    </a>
                    <a href="#">
                        <img src="Vista/imagenes/paginaPrincipal/iconos/iconoPlayStore.png" class="iconoPlayStore" alt="Icono Play Store">
                    </a>
                </div>
                <br>
                <div class="panelLibroReclam">
                    <a href="#">
                        <img src="Vista/imagenes/paginaPrincipal/iconos/libroReclam.png" class="libroReclam" alt="Libro de Reclamaciones">
                        <h2>Libro de Reclamaciones</h2>
                    </a>
                </div>
            </div>
        </div>
    </footer>
</body>
