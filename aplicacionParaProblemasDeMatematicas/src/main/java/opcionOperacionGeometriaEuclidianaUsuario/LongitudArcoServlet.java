package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LongitudArcoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LongitudArcoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String angulo = request.getParameter("angulo");
		String radio = request.getParameter("radio");
		AnguloYradio objetoAnguloYradio = new AnguloYradio(angulo, radio);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOANGULOYRADIO", objetoAnguloYradio);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoLongitudArco.jsp");
		dispatcher.forward(request, response);		
		
	}

}
