
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content 
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>-->

<title>The Memo</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link  href="http://fonts.googleapis.com/css?
	family=Reenie+Beanie:regular" 
	rel="stylesheet"
	type="text/css">
  
  
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>

<!-- css -->

<style>
*{
    margin:0;
    padding:0;
  }

  body{
    font-family:cursive,sans-serif;
    font-size:100%;
    margin:3em;
    background:#ff9966;
    color:#fff;
  }

  h2,p{
    font-size:100%;
    font-weight:normal;
  }

  ul,li{
    list-style:none;
  }

  ul{
    overflow:hidden;
    padding: 5em;
  }

ul li a{
  text-decoration:none;
  color:#000;
  background:#ffc;
  display:block;
  height:10em;
  width:10em;
  padding:1em;
  -moz-box-shadow:5px 5px 7px rgba(33,33,33,1);
  -webkit-box-shadow: 5px 5px 7px rgba(33,33,33,.7);
  box-shadow: 5px 5px 7px rgba(33,33,33,.7);
  -moz-transition:-moz-transform .15s linear;
  -o-transition:-o-transform .15s linear;
  -webkit-transition:-webkit-transform .15s linear;
}

ul li{

  margin:2em;
  float:left;
}

ul li:nth-child(even) a{
  -o-transform:rotate(4deg);
  -webkit-transform:rotate(4deg);
  -moz-transform:rotate(4deg);
  position:relative;
  top:1px;
  background:#cfc;
}
ul li:nth-child(3n) a{
  -o-transform:rotate(-3deg);
  -webkit-transform:rotate(-3deg);
  -moz-transform:rotate(-3deg);
  position:relative;
  top:-5px;
  background:#ccf;
}
ul li:nth-child(5n) a{
  -o-transform:rotate(5deg);
  -webkit-transform:rotate(5deg);
  -moz-transform:rotate(5deg);
  position:relative;
  top:-10px;
}

ul li a:hover,ul li a:focus{
  -moz-box-shadow:10px 10px 7px rgba(0,0,0,.7);
  -webkit-box-shadow: 10px 10px 7px rgba(0,0,0,.7);
  box-shadow:10px 10px 7px rgba(0,0,0,.7);
  -webkit-transform: scale(1.25);
  -moz-transform: scale(1.25);
  -o-transform: scale(1.25);
  position:relative;
  z-index:5;
}

ul li a{
  text-decoration:none;
  color:#000;
  background:#ffc;
  display:block;
  height:20em;
  width:20em;
  padding:1em;
  /* Firefox */
  -moz-box-shadow:5px 5px 7px rgba(33,33,33,1);
  /* Safari+Chrome */
  -webkit-box-shadow: 5px 5px 7px rgba(33,33,33,.7);
  /* Opera */
  box-shadow: 5px 5px 7px rgba(33,33,33,.7);
}
</style>
<!-- end of css -->

	<div class="jumbotron text-center">
		  <h1 style="color:black;margin-left:30px;"><i class="far fa-calendar-minus"></i> Welcome to Memo</h1>
		  <center>
		  		 
		  		<a type="button" class="btn btn-warning" href="/form">add note</a> 		
		  </center>  
	</div>

	<hr>
	
	<!-- weather -->
	<c:forEach items="${weather}" var="item">
		<h1>The weather : ${item.weather_name}</h1>
		<H3>THE weather detail : ${item.weather_detail}</H3>
	</c:forEach>	
	
	<ul>
		<c:forEach items="${memos}" var="item">
			<li>
		      <a href="#">
		      	<div style="position: top: 5px; float: right; ">
		      		<button class="btn btn-danger" ><i class="fa fa-trash-alt"></i></button>
	    		</div>	      	
		        <h2>name : ${item.name}</h2>
		        <H3>${item.topic}</H3>
		        <p>${item.detail}</p>
		        <div style="position:  bottom: 5px; ">
			        <c:choose>
						<c:when test="${empty item.dateRemind}">
							<H3></H3>
						</c:when>
						<c:otherwise>
							<p style="text-align:right"><fmt:formatDate value="${item.dateRemind}" pattern="dd/MM/yyyy" /></p>
						</c:otherwise>
					</c:choose>
				</div>	                	    	
		      </a>
		    </li>		
		</c:forEach>
	</ul>
	
	
	
			
	    
	 
	
	

</body>
</html>