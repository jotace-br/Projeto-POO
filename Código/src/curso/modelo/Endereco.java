package curso.modelo;

public class Endereco {
	private String cep;
	private String rua;
	private long numero;
	
	public Endereco(String cep, String rua, long numero) {
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

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}
	
}
