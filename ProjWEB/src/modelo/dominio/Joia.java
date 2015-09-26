package modelo.dominio;

public class Joia {
	private int id;
	private float preco;
	private String tipo;
	private String genero;

	public Joia(){
		super();
	}

	public Joia(int id, float preco, String tipo, String genero) {
		super();
		this.id = id;
		this.preco = preco;
		this.tipo = tipo;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
