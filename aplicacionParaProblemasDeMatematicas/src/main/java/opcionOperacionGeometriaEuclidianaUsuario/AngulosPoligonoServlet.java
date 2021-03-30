package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AngulosPoligonoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AngulosPoligonoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String angulosPoligono = request.getParameter("angulosPoligono");
		AngulosPoligono objetoAngulosPolig = new AngulosPoligono(angulosPoligono);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOANGULOSPOLIG", objetoAngulosPolig);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAnguloPoligono.jsp");
		dispatcher.forward(request, response);				

	}

}
