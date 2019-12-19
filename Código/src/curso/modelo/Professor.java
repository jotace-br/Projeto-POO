package curso.modelo;

final public class Professor extends Pessoa {
	private String disciplina;
	
	public Professor(String nome, String rg, String telefone, String disciplina) {
		super(nome, rg, telefone);
		this.disciplina = disciplina;
	}	
}
