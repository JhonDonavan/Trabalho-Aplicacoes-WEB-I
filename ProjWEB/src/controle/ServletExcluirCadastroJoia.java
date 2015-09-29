package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExcluirCadastroJoia
 */
@WebServlet("/ExcluirCadastroJoia")
public class ServletExcluirCadastroJoia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExcluirCadastroJoia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*Nesta parte do codigo deve se implementar o modelo.dao
		 este servlet recebe com getParameter o cpf do cliente selecionado
		 pelo cliente na JSP ListarClientes, faz uma pesquisa no banco de dados
		 e o remove se achado.
		
		
		
		
		// LER O CPF DO CANDIDATO ESCOLHIDO NA PÁGINA
			String cpf = request.getParameter("cpf");
		// CRIAR UM NOVO DAO PARA ACESSO AOS DADOS
			ClienteDAO dao = new ClienteDAO();
		// LER O CANDIDATO DO BANCO DE DADOS
			Cliente cliente = dao.obter(cpf);
		// EXCLUIR O CANDIDATO LIDO
			dao.excluir(cliente);
			
			
		*/
			// CRIAR UM DESPACHANTE PARA CHAMAR A PÁGINA JSP
			RequestDispatcher disp = request.getRequestDispatcher("ListarJoias.jsp");
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
