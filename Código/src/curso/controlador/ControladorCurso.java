package curso.controlador;
import curso.modelo.Curso;
import curso.modelo.Professor;

public class ControladorCurso {
	//atributos do controlador do curso
	Curso[] cursoExistente;
	private int quantidadeCurso;
	private int contadora;

	//instanciação
	Professor editarProfessor;

	//construtor do controlador do curso
	public ControladorCurso(int capacidade){
		this.cursoExistente = new Curso[capacidade];
		this.quantidadeCurso = 0;
		this.contadora = 1;
	}

	//métodos do controlador do curso
	public boolean adicionarCurso(Curso cursos) {
		if(cursos != null && quantidadeCurso < cursoExistente.length) {
			cursoExistente[quantidadeCurso] = cursos;
			quantidadeCurso++;
			return true;
		}
		return false;
	}

	public Curso buscarCurso(String buscarCurso) {
		for(Curso procurarCurso: cursoExistente) {
			System.out.println("-----------------------------------------");
			if(procurarCurso != null && procurarCurso.getNome().equals(buscarCurso)) {
				return procurarCurso;
			}
		}
		return null;	
	}
	
	/*public void exibirCurso(Curso curso) {
		System.out.println("Nome do curso: " + curso.getNome());
		System.out.println("Descrição do curso: " + curso.getDescricao());
		System.out.println("Professor do curso: " + curso.getProfessor().getNome());
		System.out.println("Descrição do curso: " + curso.getDescricao());
		System.out.println("Disciplina do curso: " + curso.getDisciplina());
	}
	*/

	public boolean editarCurso(String buscarIdCurso, String novoNomeCurso, String novoDescricaoCurso,
							   String novoNomeProfessor, String novoRgProfessor, 
							   String novoTelefoneProfessor, String novoDisciplinaProfessor, 
							   String novoDisciplinaCurso) {

		Curso procurarCurso = this.buscarCurso(buscarIdCurso);
		editarProfessor = new Professor(novoNomeProfessor, novoRgProfessor, 
				novoTelefoneProfessor, novoDisciplinaProfessor);

		if(procurarCurso != null) {
			procurarCurso.setNome(novoNomeCurso);
			procurarCurso.setDescricao(novoDescricaoCurso);
			procurarCurso.setProfessor(editarProfessor);
			procurarCurso.setDescricao(novoDescricaoCurso);
			procurarCurso.setDisciplina(novoDisciplinaCurso);
			return true;
		}
		return false;
	}

	public void listarCurso() {
		for(Curso cursos: cursoExistente) {
			if(cursos != null) {
				System.out.println("-----------------------------------------");
				System.out.format("%dº Curso:\n", contadora++);
				System.out.println("ID do curso: " + cursos.getID());
				System.out.println("Nome do curso: " + cursos.getNome());
				System.out.println("Nome do professor: " + cursos.getProfessor().getNome());
				System.out.println("Descrição do curso: " + cursos.getDescricao());
				System.out.println("Disciplina: " + cursos.getDisciplina());
			} else {
				System.out.println("Curso não encontrado/Listado todos os cursos.");
			}
		}
	}

	public boolean existeCurso() {
		boolean encontrou = false;
		for (Curso curso : cursoExistente) {
			if (curso != null) {
				encontrou = true;	
			} else {
				System.out.println("Não há cursos disponíveis.");
				encontrou = false;
			}
		}
		return encontrou;
	}

	public boolean removerCurso(String curso) {
		for(int i = 0; i < cursoExistente.length; i++) {
			Curso procurarCurso = cursoExistente[i];
			if(procurarCurso != null && procurarCurso.getID().equals(curso)) {
				for(int j = 0; j < cursoExistente.length; j++) {
					cursoExistente[i] = cursoExistente[j];
					if(j == (cursoExistente.length-1)) {
						cursoExistente[j] = null;
					}
				}
				this.quantidadeCurso--;
				return true;
			}
		}
		return false;
	}

	//getters e setters
	public Curso[] getCursoExistente() {
		return cursoExistente;
	}

	public void setCursoExistente(Curso[] cursoExistente) {
		this.cursoExistente = cursoExistente;
	}

	public int getQntCurso() {
		return quantidadeCurso;
	}

	public void setQntCurso(int qntCurso) {
		this.quantidadeCurso = qntCurso;
	}

}
