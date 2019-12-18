package curso.modelo;

public class Pessoa {
	private String nome;
	//private Endereco endereco;
	private String rg;
	private String telefone;
	
	public Pessoa(String nome, String rg, String telefone) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
