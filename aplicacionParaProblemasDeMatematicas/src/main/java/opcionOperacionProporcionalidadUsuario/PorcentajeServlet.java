package opcionOperacionProporcionalidadUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class PorcentajeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PorcentajeServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cantidad = request.getParameter("cantidad");
		String porcentaje = request.getParameter("porcentaje");
		Porcentaje objetoPorcentaje = new Porcentaje(cantidad, porcentaje);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOPORCENTAJE", objetoPorcentaje);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoPorcentaje.jsp");
		dispatcher.forward(request, response);		
	}
	




}
