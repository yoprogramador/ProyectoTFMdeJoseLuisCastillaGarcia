package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NumeroDeLadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NumeroDeLadosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numeroDeLados = request.getParameter("numeroDeLados");
		NumeroDeLados objetonumeroDeLados = new NumeroDeLados(numeroDeLados);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETONUMERODELADOS", objetonumeroDeLados);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAnguloPoligonoReg.jsp");
		dispatcher.forward(request, response);				

	}

}
