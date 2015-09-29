package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.JoiaDao;
import modelo.dominio.Joia;

/**
 * Servlet implementation class ServletAlterarCadastroJoia
 */
@WebServlet("/AlterarCadastroJoia")
public class ServletAlterarCadastroJoia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlterarCadastroJoia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
				//Fazer nesta parte a consulta ao banco de dados
				//Com o ID que vira com o getParameter, quando usuario
				// clicar em alterar a joia desejada
				
			//Ler o CPF do Cliente escolhido na pagina
				//String cpf = request.getParameter("cpf");
				
			  //CRIAR UM NOVO DAO PARA ACESSO AOS DADOS
				//JoiaDao dao = new JoiaDao();
				
		      //LER O CANDIDATO DO BANCO DE DADOS
				//Joia joia = dao.obter("id");
				
				
				
				
				//request.setAttribute("cliente", cliente);
				
			  //CRIAR UM DESPACHANTE PARA CHAMAR A PÁGINA JSP
				RequestDispatcher disp = request.getRequestDispatcher("cadastroJoia.jsp");
				
				// EXECUTA O FORWARD PARA A PÁGINA
				disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
