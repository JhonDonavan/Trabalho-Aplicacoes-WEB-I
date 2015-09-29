package modelo.dominio;

public class Joia {
	private int id;
	private float preco;
	private String tipo;
	private String genero;
	private int quantidade;

	public Joia(){
		super();
	}

	public Joia(int id, float preco, String tipo, String genero, int quatidade) {
		super();
		this.id = id;
		this.preco = preco;
		this.tipo = tipo;
		this.genero = genero;
		this.quantidade = quantidade;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Joia other = (Joia) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
