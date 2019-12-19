package curso.modelo;
public class Curso {
	//atributos do curso
	private String ID;
	private String nome;
	private Professor professor;
	private String descricao;
	private String disciplina;
	
	//construtor do curso
	public Curso(String ID, String nome, Professor professor, String descricao, String disciplina) {
		this.ID = ID;
		this.nome = nome;
		this.professor = professor;
		this.descricao = descricao;
		this.disciplina = disciplina;
	}

	//getters e setters
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
		
}
