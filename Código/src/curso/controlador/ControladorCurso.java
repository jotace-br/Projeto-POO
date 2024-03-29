package curso.controlador;
import curso.modelo.Curso;
import curso.modelo.Professor;

public class ControladorCurso {
	private Curso[] cursoExistente;
	private int quantidadeCurso;
	private int contadora;

	private Professor professor;

	public ControladorCurso(int capacidadeDoCurso){
		this.cursoExistente = new Curso[capacidadeDoCurso];
		this.quantidadeCurso = 0;
		this.contadora = 1;
	}

	public boolean adicionarCurso(Curso curso) {
		if(curso != null && quantidadeCurso < cursoExistente.length) {
			cursoExistente[quantidadeCurso] = curso;
			quantidadeCurso++;
			return true;
		}
		return false;
	}

	public Curso buscarCurso(String curso) {
		for(Curso procurarCurso: cursoExistente) {
			System.out.println("-----------------------------------------");
			if(procurarCurso != null && procurarCurso.getNome().equals(curso)) {
				return procurarCurso;
			}
		}
		return null;	
	}

	/*public void exibirCurso(String cursoNome) {
		for (Curso curso : cursoExistente) {
			System.out.println("-----------------------------------------");
			if(cursoNome.equals("")) {
				listarCurso();
			} else if(curso.getNome().equals(cursoNome)) {
				for (Curso cursoDisponivel : cursoExistente) {
					System.out.println("Nome do curso: " + cursoDisponivel.getNome());
					System.out.println("Descrição do curso: " + cursoDisponivel.getDescricao());
					System.out.println("Professor do curso: " + cursoDisponivel.getProfessor().getNome());
					System.out.println("Descrição do curso: " + cursoDisponivel.getDescricao());
					System.out.println("Disciplina do curso: " + cursoDisponivel.getDisciplina());
				}
			}
		}
	}*/

	public boolean editarCurso(String buscarIdCurso, String novoNomeCurso, String novoDescricaoCurso,
			String novoNomeProfessor, String novoRgProfessor, 
			String novoTelefoneProfessor, String novoDisciplinaProfessor, 
			String novoDisciplinaCurso) {

		Curso procurarCurso = this.buscarCurso(buscarIdCurso);
		professor = new Professor(novoNomeProfessor, novoRgProfessor, 
				novoTelefoneProfessor, novoDisciplinaProfessor);

		if(procurarCurso != null) {
			procurarCurso.setNome(novoNomeCurso);
			procurarCurso.setDescricao(novoDescricaoCurso);
			procurarCurso.setProfessor(professor);
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

	public Curso[] getCursoExistente() {
		return cursoExistente;
	}

	public int getQntCurso() {
		return quantidadeCurso;
	}
}
