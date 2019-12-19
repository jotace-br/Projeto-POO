package curso.modelo;

final public class Professor extends Pessoa {
	//atributos de professor
	private String disciplina;
	
	//construtor de professor
	public Professor(String nome, String rg, String telefone, String disciplina) {
		super(nome, rg, telefone);
		this.disciplina = disciplina;
	}

	//getters e setters
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}	
	
}
