package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RaizCuadradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

    public RaizCuadradaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String radicando = request.getParameter("radicando");
		RaizCuadrada objetoRaiz = new RaizCuadrada(radicando);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETORAIZ", objetoRaiz);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoRaizCuadrada.jsp");
		dispatcher.forward(request, response);				
	}





}
