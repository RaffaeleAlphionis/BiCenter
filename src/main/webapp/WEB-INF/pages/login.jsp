<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body style="background-color:#4dd6cebf;">
       <jsp:include page="nav.jsp" />
       <div class="row justify-content-center">
       	<div class="col-md-4" style="border:solid;border-radius: 12px;text-align:center;margin-top: 25vh;">
    		<h4>Login</h4>
    		<br/>
    		<p>Inserire i dati di accesso</p>
     		<form action="checkLogin" method="POST">
    			<div style="padding-top:15px;padding-bottom: 15px;">
    				<a>User</a>
    			<input type="text" name="user">
    			</div>
    			<div style="padding-bottom: 15px;">
    				<a>Password</a>
    					<input type="text" name="pass">
    			</div>
    			<input type="submit" class="btn btn-success" value="Login"  />
    		</form>
    	</div>
    	
    		<%if(request.getParameter("err").equals("errore")){
    			%>
    			<div class="col-md-12" style="position:absolute;">
    				<p style="text-align: center;color: red;font-size: 2em; font-weight: 900;"> Errore nel inserire i dati di accesso</p>
    			</div>
    		
    		<% } %>
    	
       	</div>
       
    	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" ></script>
    	<script src="bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>