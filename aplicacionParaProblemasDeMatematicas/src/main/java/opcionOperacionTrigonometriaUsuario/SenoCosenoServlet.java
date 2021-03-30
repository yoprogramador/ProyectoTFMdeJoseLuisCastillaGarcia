package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SenoCosenoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SenoCosenoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tangente = request.getParameter("tangente");
		UnDato objetoUnDato = new UnDato(tangente);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOUNDATO", objetoUnDato);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoSenoCoseno.jsp");
		dispatcher.forward(request, response);		

	}

}
