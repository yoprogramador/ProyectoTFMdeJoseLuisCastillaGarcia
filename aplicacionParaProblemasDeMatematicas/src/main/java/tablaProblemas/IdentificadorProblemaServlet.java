package tablaProblemas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IdentificadorProblemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IdentificadorProblemaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String identificador = request.getParameter("identificadorDelProblema");
		IdentificadorProblema objetoIdentificador = new IdentificadorProblema(identificador);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOIDENTIFICADOR", objetoIdentificador);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoProblemaPorId.jsp");
		dispatcher.forward(request, response);

	}

}
