package curso.modelo;

public class Endereco {
	//atributos do endereço
	private String cep;
	private String rua;
	private String numero;
	
	//construtor do endereço
	public Endereco(String cep, String rua, String numeroEndereco) {
		this.cep = cep;
		this.rua = rua;
		this.numero = numeroEndereco;
	}
	
	//getters e setters
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
