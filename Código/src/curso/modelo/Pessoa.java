package curso.modelo;

public class Pessoa {
	private String nome;
	private String rg;
	private String telefone;
		
	public Pessoa(String nome, String rg, String telefone) {
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
}
