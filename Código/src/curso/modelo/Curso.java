package curso.modelo;
public class Curso {
	private String ID;
	private String nome;
	private Professor professor;
	private String descricao;
	private String disciplina;
	private String[] aluno;
	private int qntCursos;
	
	public Curso(String iD, String nome, Professor professor, String descricao, String disciplina, String[] aluno,
			int qntCursos) {
		super();
		ID = iD;
		this.nome = nome;
		this.professor = professor;
		this.descricao = descricao;
		this.disciplina = disciplina;
		this.aluno = aluno;
		this.qntCursos = qntCursos;
	}
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
	public String[] getAluno() {
		return aluno;
	}
	public void setAluno(String[] aluno) {
		this.aluno = aluno;
	}
	public int getQntCursos() {
		return qntCursos;
	}
	public void setQntCursos(int qntCursos) {
		this.qntCursos = qntCursos;
	}
	
}
