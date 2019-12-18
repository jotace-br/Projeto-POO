package curso.modelo;

final public class Professor extends Pessoa {
	private String cargo;
	private String disciplina;
	
	public Professor(String nome, String rg, String telefone, String cargo, String disciplina) {
		super(nome, rg, telefone);
		this.cargo = cargo;
		this.disciplina = disciplina;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}	
	
}
