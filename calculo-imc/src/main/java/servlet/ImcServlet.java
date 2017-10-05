package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value = "/imc")
public class ImcServlet extends HttpServlet {

	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
		
		}

	 @Override
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        processRequest(request, response);
	    }
	 
	 
	private void processRequest(HttpServletRequest request, HttpServletResponse response) {
	    processRequest(request, response);
		
	}
	
}
