package curso.modelo;

public class Endereco {
	private String cep;
	private String rua;
	private String numero;
	
	public Endereco(String cep, String rua, String numeroEndereco) {
		this.cep = cep;
		this.rua = rua;
		this.numero = numeroEndereco;
	}
	
	public String getRua() {
		return rua;
	}
	
}
