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
		// TODO ESCREVER O C�DIGO PARA PERSIST�NCIA
	}
	
	public void excluir(Cliente cliente)
	{
		// TODO ESCREVER O C�DIGO PARA PERSIST�NCIA
	}
	
	public Cliente obter(String cpf)
	{
		// TODO ESCREVER O C�DIGO PARA PERSIST�NCIA
		return null;
	}
	
	public List<Cliente> listar() {
		return lista;
	}

}
