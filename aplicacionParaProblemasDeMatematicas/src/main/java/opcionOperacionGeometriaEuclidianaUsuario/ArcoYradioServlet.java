package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ArcoYradioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ArcoYradioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String arco = request.getParameter("arco");
		String radio = request.getParameter("radio");
		ArcoYradio objetoArcoYradio = new ArcoYradio(arco, radio);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOARCOYRADIO", objetoArcoYradio);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoGradosAngulo.jsp");
		dispatcher.forward(request, response);		
		
	}

}
