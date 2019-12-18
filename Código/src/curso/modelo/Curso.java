package curso.modelo;
public class Curso {
	private String ID;
	private String nome;
	private Professor professor;
	private String descricao;
	private String disciplina;
	private String[] ListaNomeDosAlunos;
	private int indiceAtual;
	private int QNTALUNOS = 30;

	public Curso(String iD, String nome, Professor professor, String descricao, String disciplina) {
		super();
		ID = iD;
		this.nome = nome;
		this.professor = professor;
		this.descricao = descricao;
		this.disciplina = disciplina;
		this.ListaNomeDosAlunos = new String[QNTALUNOS];
		this.indiceAtual = 0;
	}

	public boolean adicionarAluno(String nome) {
		if(nome.equals("") && QNTALUNOS < ListaNomeDosAlunos.length) {
			ListaNomeDosAlunos[indiceAtual] = nome;
			indiceAtual++;
			return true;
		}
		return false;
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
	public String[] getAlunoVetor() {
		return ListaNomeDosAlunos;
	}
	public void setAlunoVetor(String[] aluno) {
		this.ListaNomeDosAlunos = aluno;
	}

	public String setAluno(String participar) {
		ListaNomeDosAlunos[QNTALUNOS] = participar;
		QNTALUNOS--;
		return participar;
	}

	public String[] getListaNomeDosAlunos() {
		return ListaNomeDosAlunos;
	}

	public void setListaNomeDosAlunos(String[] listaNomeDosAlunos) {
		ListaNomeDosAlunos = listaNomeDosAlunos;
	}




}
