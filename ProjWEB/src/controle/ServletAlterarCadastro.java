package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.ClienteDAO;
import modelo.dominio.Cliente;

/**
 * Servlet implementation class ServletAlterarCadastro
 */
@WebServlet("/AlterarCadastro")
public class ServletAlterarCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlterarCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Fazer nesta parte a consulta ao banco de dados
		//Com o CPF que vira com o getParameter, quando usuario
		// clicar em alterar o cleinte desejado
		
	/*//Ler o CPF do Cliente escolhido na pagina
		String cpf = request.getParameter("cpf");
		
	  //CRIAR UM NOVO DAO PARA ACESSO AOS DADOS
		ClienteDAO dao = new ClienteDAO();
		
      //LER O CANDIDATO DO BANCO DE DADOS
		Cliente cliente = dao.obter(cpf);
		
		
		*/
		
		//request.setAttribute("cliente", cliente);
		
	  //CRIAR UM DESPACHANTE PARA CHAMAR A PÁGINA JSP
		RequestDispatcher disp = request.getRequestDispatcher("cadastro.jsp");
		
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
