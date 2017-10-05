<!DOCTYPE html>
<!-- mvn org.apache.tomcat.maven:tomcat7-maven-plugin:2.2:run -Dmaven.tomcat.port=9090 -->
<html>
<head>
	<%@page contentType="text/html" pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Calculo de IMC</title>
	<style type="text/css"></style>
	
<body>
	<div class ="row-fluid">		
		<div class="col-md-4 col-md-offset-4" id="painel-meio">
		    <div class="panel panel-default" style="margin-top: 84px;">
		    	<div class="panel-heading"> 
		    		<h1>Calculo do Índice de Massa Corporal (IMC)</h1>                               
		        </div>
		        <div class="panel-body">
		     		<div class="col-xs-2" style="margin-top: -15px;">
			        	<h3><small>Peso(kg)</small></h3>
			        	<h3><small>Altura</small></h3>	        	 
			        </div>
			        <form action="imcController">
				        <div class="col-xs-8"> 
				        	<input class="form-control" type="text" name="peso"  placeholder="Peso ex: 75,8" id= "peso" autofocus="" style="margin-bottom: 10px;">
				        	<input class="form-control" type="text" name="altura"  placeholder="Altura ex: 1,8" id = "altura" style="margin-bottom: 10px;">

				        	<div id="div-radio" style="margin-bottom: 10px;">
				        		<label class="radio-inline">
	  								<input type="radio" name="genero" value="M"> M
								</label>
								<label class="radio-inline">
								  <input type="radio" name="genero"  value="F"> F
								</label>
				        	</div>
				   			
				      	</div>
				      	<div class= "col-xs-12">
				        		<button type="submit" class="btn btn-primary btn-lg btn-block" name="btn-calc" value="calc">Calcular IMC</button>
				        		
				        </div> 
			        </form>	 
		        </div>
		    </div>
		    
		    				<div class="div col-xs-12">
		    					<%if(request.getAttribute("resultado")!=null){ %>
									<%=request.getAttribute("resultado")%>
								<% } %>
							</div>
		</div>
	</div>
	
			
</body>
</html>

