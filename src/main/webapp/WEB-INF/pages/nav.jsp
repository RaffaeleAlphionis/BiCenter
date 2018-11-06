<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
 			<a class="navbar-brand" href="home">Bicenter</a>
  			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    			<span class="navbar-toggler-icon"></span>
  			</button>
  			<div class="collapse navbar-collapse" id="navbarText">
    			<ul class="navbar-nav mr-auto">
      				<li class="nav-item active">
        				<a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
     			 	</li>
      				<li class="nav-item">
       					<a class="nav-link" href="corsi">Corsi</a>
      				</li>
     				 <li class="nav-item">
        				<a class="nav-link" href="aule">Aule</a>
      				</li>
    			</ul>
    			<%if(session.getAttribute("userInSession") == null || session.getAttribute("userInSession").equals("")){ %>
    				<form action="login"><button type="submit" class="btn btn-light" >Login</button></form>
    			<%}else{%>
    				<a Style="color:#fff;font-weight: 900;">Benvenuto <%=session.getAttribute("userInSession")%>,</a> <a href="logout" Style="color:red;font-weight: 900;"> Logout</a>
    			<%} %>
  			</div>
		</nav>
    </body>
</html>
