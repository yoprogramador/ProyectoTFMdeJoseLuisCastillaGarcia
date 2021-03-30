package opcionOperacionEstadisticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MediaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MediaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String datosParaMedia = request.getParameter("datosParaMedia");
		GrupoDeDatos objetoGrupoDeDatos = new GrupoDeDatos(datosParaMedia);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOGRUPODEDATOS", objetoGrupoDeDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoMediaAritmetica.jsp");
		dispatcher.forward(request, response);				

	}

}
