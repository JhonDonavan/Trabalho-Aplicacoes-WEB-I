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
 * Servlet implementation class ServletSalvarCadastro
 */
@WebServlet("/SalvarCadastro")
public class ServletSalvarCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSalvarCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// CRIAR UM DESPACHANTE PARA CHAMAR A PÁGINA JSP
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String end = request.getParameter("end");
		
		
		
		
		Cliente cliente = new Cliente(nome, cpf, tel, email, end);
		
		boolean dadosOK = true;
		String pagina = null;
		String mensagem = null;
		
		if(cpf.length() <=10){
			dadosOK = false;
			mensagem = "CPF invalido";
		}
		else if((email == null) ||(email.length() <= 7 ) ){
			dadosOK = false;
			mensagem = "Email inválido!";
		}
		if (dadosOK == true){
			pagina = "confirmacao.jsp";
			ClienteDAO dao = new ClienteDAO();
			 
			//adc ao banco
			dao.incluir(cliente);	
		}
		else{
			pagina = "cadastro.jsp";
			}
		
		//guardarObjeto no reques para ser lido pela pagina
		
		request.setAttribute("cliente", cliente);
		request.setAttribute("mensagem", mensagem);
		//criar despachante para chamar a pagina jsp
		RequestDispatcher disp = request.getRequestDispatcher(pagina);
		
		//executar forwar para a pagina
		disp.forward(request, response);
		
	
	
	
	
	}

	

}
