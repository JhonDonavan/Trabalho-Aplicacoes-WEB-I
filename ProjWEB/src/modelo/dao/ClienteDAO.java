package modelo.dao;


import java.util.ArrayList;
import java.util.List;


import modelo.dominio.Cliente;

public class ClienteDAO {
	
private static ArrayList<Cliente> lista = new ArrayList<Cliente>();
	
	static
	{
		
	}
	
	public void incluir(Cliente cliente){
		
	}
	
	public void alterar(Cliente cliente)
	{
		// TODO ESCREVER O CÓDIGO PARA PERSISTÊNCIA
	}
	
	public void excluir(Cliente cliente)
	{
		// TODO ESCREVER O CÓDIGO PARA PERSISTÊNCIA
	}
	
	public Cliente obter(String cpf)
	{
		// TODO ESCREVER O CÓDIGO PARA PERSISTÊNCIA
		return null;
	}
	
	public List<Cliente> listar() {
		return lista;
	}

}
