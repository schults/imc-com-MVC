package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Guilherme Schults
 */
@WebServlet("/imcController")
public class ImcController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String peso1 = request.getParameter("peso");
      
        String altura1 = request.getParameter("altura");
     
        String genero = request.getParameter("genero");    
        
        ImcModel resposta = new ImcModel();
        String resultado = resposta.calcular(peso1, altura1, genero);
        
        altura1 = altura1.replace(",", ".");
	    peso1 = peso1.replace(",", ".");
        
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    	}
	}

	
