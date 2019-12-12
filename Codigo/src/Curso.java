
public class Curso {
	String id;
	String nome;
	//prof professor;
	String descricao;
	String disciplina;
	String[] aluno;
	int qnt_cursos;
	
	
	
	
	private Curso(String id, String nome, String descricao, String disciplina, String[] aluno, int qnt_cursos) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.disciplina = disciplina;
		this.aluno = aluno;
		this.qnt_cursos = qnt_cursos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public int getQnt_cursos() {
		return qnt_cursos;
	}
	public void setQnt_cursos(int qnt_cursos) {
		this.qnt_cursos = qnt_cursos;
	}
	
}
