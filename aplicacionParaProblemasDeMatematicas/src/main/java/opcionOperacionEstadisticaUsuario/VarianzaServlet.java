package opcionOperacionEstadisticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VarianzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VarianzaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String datosParaVarianza = request.getParameter("datosParaVarianza");
		GrupoDeDatos objetoGrupoDeDatos = new GrupoDeDatos(datosParaVarianza);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOGRUPODEDATOS", objetoGrupoDeDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoVarianza.jsp");
		dispatcher.forward(request, response);				

	}

}
