package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductorioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductorioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productorio = request.getParameter("productorio");
		Productorio objetoProductorio = new Productorio(productorio);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOPRODUCTORIO", objetoProductorio);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoProductorio.jsp");
		dispatcher.forward(request, response);				

	}

}
