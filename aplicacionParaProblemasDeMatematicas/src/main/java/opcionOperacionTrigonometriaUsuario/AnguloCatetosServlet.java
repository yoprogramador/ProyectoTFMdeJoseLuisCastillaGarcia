package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AnguloCatetosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AnguloCatetosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String anguloConocido = request.getParameter("anguloConocido");		
		String hipotenusa = request.getParameter("hipotenusa");
		DosDatos objetoDosDatos = new DosDatos(anguloConocido, hipotenusa);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETODOSDATOS", objetoDosDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAnguloCatetos.jsp");
		dispatcher.forward(request, response);

	}

}
