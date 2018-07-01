<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="decathlonApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Decathlon app</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet" />
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>

<script src="resources/js/angular.js"></script>
<script src="resources/js/angular-route.js"></script>
<script src="resources/js/app.js"></script>
<script src="resources/js/appcontroller.js"></script>
<script src="resources/js/appservice.js"></script>
<script>
	$(document).ready(function() {
		document.getElementById('welcomelist').click();

	});

	jQuery(function($) {

		$(".nav a").on("click", function() {
			$(".nav").find(".active").removeClass("active");
			$(this).parent().addClass("active");
		});

	});
</script>
<style>
footer {
	position: fixed;
	height: 30px;
	bottom: 0;
	width: 100%;
	background-color: #222222;
	color: white;
	text-align: center;
}
</style>
</head>
<body>
	<div class="wrapper" style="padding-bottom: 35px;">

		<div class="col-sm-10">
			<nav class="navbar navbar-inverse  navbar-fixed-top">
			<div class="container-fluid" style="padding-left: 0px;">
				<div class="col-sm-2" style="padding: 0px;">
					<img src="resources/images/header-image.jpg"
						style="width: 100%; height: 63px;" />
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a style="font-size: 17px;"
						id="welcomelist" href="#/welcome">Home</a></li>

					<li><a style="font-size: 17px;" href="#/orderCreation">Order
							Creation</a></li>
					<li><a style="font-size: 17px;" href="#/changeOrderStatus">Update
							order status</a></li>
				</ul>
			</div>
			</nav>
		</div>

	</div>
	<div style="color: red; font-size: 13px; margin-top: 30px;">**Disclaimer-
		All the images are taken from google for just app demo purpose. Images
		might be subject to copyrights**</div>

	<div ng-view></div>
	<footer class="fixed-bottom">2018 created by- Indu</footer>
</body>
</html>