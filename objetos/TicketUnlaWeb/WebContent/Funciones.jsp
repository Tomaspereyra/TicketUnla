<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="dao.FuncionDao" %>
<%@ page import="datos.Funcion" %>
<%@ page import="java.util.List" %>
<%@ page import="datos.Funciones" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
    <!-- ========== Meta Tags ========== -->
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="description" content="Evento -Event Html Template">
    <meta name="keywords" content="Evento , Event , Html, Template">
    <meta name="author" content="ColorLib">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <!-- ========== Title ========== -->
    <title> Funciones</title>
    <!-- ========== Favicon Ico ========== -->
    <!--<link rel="icon" href="fav.ico">-->
    <!-- ========== STYLESHEETS ========== -->
    <!-- Bootstrap CSS -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <!-- Fonts Icon CSS -->
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/css/et-line.css" rel="stylesheet">
    <link href="assets/css/ionicons.min.css" rel="stylesheet">
    <!-- Carousel CSS -->
    <link href="assets/css/owl.carousel.min.css" rel="stylesheet">
    <link href="assets/css/owl.theme.default.min.css" rel="stylesheet">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="assets/css/animate.min.css">
    <!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">
</head>
<body>
<div class="loader">
    <div class="loader-outter"></div>
    <div class="loader-inner"></div>
</div>
<!--header start here -->
<header class="header navbar fixed-top navbar-expand-md">
    <div class="container">
        <a class="navbar-brand logo" href="#">
            <img src="assets/img/logo.png" alt="Evento"/>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#headernav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="lnr lnr-text-align-right"></span>
        </button>
        
        <div class="collapse navbar-collapse flex-sm-row-reverse" id="headernav">
            <ul class=" nav navbar-nav menu">
                <li class="nav-item">
                    <a class="nav-link active" href="/TicketUnlaWeb/index.html">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="/TicketUnlaWeb/Auditorios.jsp">Auditorio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="/TicketUnlaWeb/EventosDisponibles.jsp">Eventos</a>
                </li>
                
            </ul>
        </div>
    </div>
</header>
<!--header end here-->
<!--page title section-->
<section class="inner_cover parallax-window" data-parallax="scroll" data-image-src="assets/img/bg/bg-img.png">
    <div class="overlay_dark"></div>
    <div class="container">
        <div class="row justify-content-center align-items-center">
            <div class="col-12">
                <div class="inner_cover_content">
                    <h3>
                       Funciones
                    </h3>
                </div>
            </div>
        </div>

        <div class="breadcrumbs">
            <ul>
                <li><a href="/TicketUnlaWeb/index.html">Inicio</a>  |   </li>
                <li><span>Funciones</span></li>
            </ul>
        </div>
    </div>
</section>
<!--page title section end-->

<section class="pt100 pb100">
    <div class="container">
  
   
		<% List<Funcion> funciones = (List)request.getAttribute("funciones"); 
    		for (Funcion f : funciones) { %>
    			
    		<div class="event_box">
			<img src="assets/img/events/event1.png" alt="event">
			<div class="event_info">
				<div class="event_title">
					
					<%=f.getEvento().getNombre()%>
				</div>
				<div class="speakers">
					<strong>Speakers</strong> <span>Maria Smith, Gabriel
						Hernandez, Michael Williams</span>
				</div>
				<div class="event_date"><%=Funciones.traerFechaCorta(f.getHoraFecha()) %></div>
			</div>
			<div class="event_word">
				<div class="row justify-content-center">
					<div class="col-md-6 col-12">Lorem ipsum dolor sit amet,
						consectetur adipiscing elit. In rhoncus massa nec gravida tempus.
						Integer iaculis in lacus a sollicitudin. Ut hendrerit hendrerit
						nisl a accumsan. Pellentesque convallis consectetur tortor id
						placerat. Curabitur a pulvinar nunc. Maecenas laoreet finibus
						lectus, at volutpat ligula euismod.</div>
					<div class="col-md-6 col-12">Lorem ipsum dolor sit amet,
						consectetur adipiscing elit. In rhoncus massa nec gravida tempus.
						Integer iaculis in lacus a sollicitudin. Ut hendrerit hendrerit
						nisl a accumsan. Pellentesque convallis consectetur tortor id
						placerat. Curabitur a pulvinar nunc. Maecenas laoreet finibus
						lectus, at volutpat ligula euismod.</div>
				</div>
			</div>
			<form method="GET" action="/TicketUnlaWeb/ControladorSectores">
			
			<input type="radio" name="funcion" value="<%=f.getIdFuncion()%>" id="funcion"><label for="funcion"></label>
			<input type="submit" value="Reservar">
			
			</form>
			
		</div>
		<!--event info -->
<section class="pt100 pb100">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-6 col-md-3  ">
                <div class="icon_box_two">
                    <i class="ion-ios-calendar-outline"></i>
                    <div class="content">
                        <h5 class="box_title">
                            FECHA
                        </h5>
                        <p>
                            <%=Funciones.traerFechaCortaHora(f.getHoraFecha()) %>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-6 col-md-3  ">
                <div class="icon_box_two">
                    <i class="ion-ios-location-outline"></i>
                    <div class="content">
                        <h5 class="box_title">
                            Ubicacion
                        </h5>
                        <p>
                           <%=f.getEvento().getAuditorio().getDireccion()%>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-6 col-md-3  ">
                <div class="icon_box_two">
                    <i class="ion-ios-person-outline"></i>
                    <div class="content">
                        <h5 class="box_title">
                            speakers
                        </h5>
                        <p>
                            Natalie James
                            + guests
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-6 col-md-3  ">
                <div class="icon_box_two">
                    <i class="ion-ios-pricetag-outline"></i>
                    <div class="content">
                        <h5 class="box_title">
                            tikets
                        </h5>
                        <p>
                            $65 early bird
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!--event info end -->
    			
    			
    		<% } %>
		
	</div>
</section>
<!--footer start -->
<footer>
    <div class="container">
        <div class="row justify-content-center">

            <div class="col-md-4 col-12">
                <div class="footer_box">
                    <div class="footer_header">
                        <div class="footer_logo">
                            <img src="assets/img/logo.png" alt="evento">
                        </div>
                    </div>
                    <div class="footer_box_body">
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. In rhoncus massa nec gravida tempus. Integer iaculis in aazzzCurabitur a pulvinar nunc. Maecenas laoreet finibus lectus, at volutpat ligula euismod.
                        </p>
                        <ul class="footer_social">
                            <li>
                                <a href="#"><i class="ion-social-pinterest"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="ion-social-facebook"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="ion-social-twitter"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="ion-social-dribbble"></i></a>
                            </li>
                            <li>
                                <a href="#"><i class="ion-social-instagram"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-4">
                <div class="footer_box">
                    <div class="footer_header">
                        <h4 class="footer_title">
                            instagram
                        </h4>
                    </div>
                    <div class="footer_box_body">
                        <ul class="instagram_list">
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c1.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c2.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c3.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c3.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c2.png" alt="instagram">
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <img src="assets/img/cleander/c1.png" alt="instagram">
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="col-12 col-md-4">
                <div class="footer_box">
                    <div class="footer_header">
                        <h4 class="footer_title">
                            subscribe to our newsletter
                        </h4>
                    </div>
                    <div class="footer_box_body">
                        <div class="newsletter_form">
                            <input type="email" class="form-control" placeholder="E-Mail here">
                            <button class="btn btn-rounded btn-block btn-primary">SUBSCRIBE</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
<div class="copyright_footer">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6 col-12">
                <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
            </div>
            <div class="col-12 col-md-6 ">
                <ul class="footer_menu">
                    <li>
                        <a href="#">Inicio</a>
                    </li>
                    <li>
                        <a href="#">Speakers</a>
                    </li>
                    <li>
                        <a href="#">Eventos</a>
                    </li>
                    <li>
                        <a href="#">News</a>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!--footer end -->
<!-- jquery -->
<script src="assets/js/jquery.min.js"></script>
<!-- bootstrap -->
<script src="assets/js/popper.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/waypoints.min.js"></script>
<!--slick carousel -->
<script src="assets/js/owl.carousel.min.js"></script>
<!--parallax -->
<script src="assets/js/parallax.min.js"></script>
<!--Counter up -->
<script src="assets/js/jquery.counterup.min.js"></script>
<!--Counter down -->
<script src="assets/js/jquery.countdown.min.js"></script>
<!-- WOW JS -->
<script src="assets/js/wow.min.js"></script>
<!-- Custom js -->
<script src="assets/js/main.js"></script>
</body>
</html>