package curso.modelo;

public class Endereco {
	private String cep;
	private String rua;
	private int numero;
	
	public Endereco(String cep, String rua, int numero) {
		super();
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
