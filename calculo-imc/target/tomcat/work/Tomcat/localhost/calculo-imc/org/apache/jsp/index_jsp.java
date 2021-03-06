/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-22 00:08:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- mvn org.apache.tomcat.maven:tomcat7-maven-plugin:2.2:run -Dmaven.tomcat.port=9090 -->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("\t<title>Calculo de IMC</title>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class =\"row-fluid\">\t\t\r\n");
      out.write("\t\t<div class=\"col-md-4 col-md-offset-4\" id=\"painel-meio\">\r\n");
      out.write("\t\t    <div class=\"panel panel-default\" style=\"margin-top: 84px;\">\r\n");
      out.write("\t\t    \t<div class=\"panel-heading\"> \r\n");
      out.write("\t\t    \t\t<h1>Calculo do Índice de Massa Corpórea (IMC)</h1>                               \r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <div class=\"panel-body\">\r\n");
      out.write("\t\t     \t\t<div class=\"col-xs-2\" style=\"margin-top: -15px;\">\r\n");
      out.write("\t\t\t        \t<h3><small>Peso(kg)</small></h3>\r\n");
      out.write("\t\t\t        \t<h3><small>Altura</small></h3>\t        \t \r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t        <form>\r\n");
      out.write("\t\t\t\t        <div class=\"col-xs-8\"> \r\n");
      out.write("\t\t\t\t        \t<input class=\"form-control\" type=\"text\" name=\"peso\"  placeholder=\"Peso ex: 75,8\" id= \"peso\" autofocus=\"\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t        \t<input class=\"form-control\" type=\"text\" name=\"altura\"  placeholder=\"Altura ex: 1,8\" id = \"altura\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t        \t<div id=\"div-radio\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t        \t\t<label class=\"radio-inline\">\r\n");
      out.write("\t  \t\t\t\t\t\t\t\t<input type=\"radio\" name=\"genderOption\" value=\"M\"> M\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"radio-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"radio\" name=\"genderOption\"  value=\"F\"> F\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t        \t</div>\r\n");
      out.write("\t\t\t\t   \t\t\t\r\n");
      out.write("\t\t\t\t      \t</div>\r\n");
      out.write("\t\t\t\t      \t<div class= \"col-xs-12\">\r\n");
      out.write("\t\t\t\t        \t\t<button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\" name=\"btn-calc\" value=\"calc\">Calcular</button>\r\n");
      out.write("\t\t\t\t        \t</div>\r\n");
      out.write("\t\t\t        </form>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-md-4 col-md-offset-4\" id =\" resultado\">\r\n");
      out.write("\t\t  ");
	
			 try{
	    String peso = request.getParameter("peso");
	    String altura = request.getParameter("altura");
	    String resultado="";
	    String genero = request.getParameter("genderOption");
	 	String msg ="";
	    altura = altura.replace(",", ".");
	    peso = peso.replace(",", ".");
	    if (altura != null && peso != null && genero != null){             
	        double imc = Double.parseDouble(peso) / (Double.parseDouble(altura) * Double.parseDouble(altura));
	        
	        
	       	
	        if((imc < 19.1 && genero.equals("F"))|| (imc <20.7 && genero.equals("F"))){
				msg ="<div class= 'alert alert-warning'>"+ "Você está muito abaixo do peso"+"</div>";
			
			}else if((imc >= 19.1 && imc < 25.8 && genero.equals("F"))|| (imc >= 20.7 && imc <26.4 && genero.equals("M"))){
				
				msg ="<div class= 'alert alert-success'>" +"Parabens! Você está com peso normal!" +"</div>";
			}else if((imc >= 25.8 && imc < 27.3 && genero.equals("F"))|| (imc >= 26.4 && imc <27.8 && genero.equals("M"))){
			
				msg = "<div class= 'alert alert-warning'>" + "Você esta acima do peso." +"</div>";
			}else if((imc >= 27.3 && imc < 32.3 && genero.equals("F"))|| (imc >= 27.8 && imc < 31.1 && genero.equals("M"))){
				
				msg = "<div class= 'alert alert-warning'>" + "Você está bem acima do peso, tenha cuidado! "+ "</div>";
			}else if((imc > 32.3 && genero.equals("F")) || (imc> 31.1 && genero.equals("M"))){
				
				msg = "<div class= 'alert alert-danger'>" + "Meu Deus! Você vai morrer se não procurar ajuda urgente" +"</div>";
			}else{
			
				msg = "E agora?!";
			}
			System.out.println("IMC:" + imc+"\nMsg: "+ msg );
	       	resultado = "<h1 style='text-align: center;'>" + String.format("%.2f", imc) + "\n"+ msg+"</h1>" ;
	       	out.println(resultado);
	    }
	}catch(Exception e){    
	}
		
	
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
