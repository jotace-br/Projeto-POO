package curso.controlador;
import curso.modelo.Curso;

public class ControladorCurso {
	Curso[] cursoExistente;
	private int qntCurso;
	Curso curso = new Curso(null, null, null, null, null);

	public ControladorCurso(int capacidade){
		this.cursoExistente = new Curso[capacidade];
		this.qntCurso = 0;
	}

	public boolean adicionarCurso(Curso cursos) {
		if(cursos != null && qntCurso < cursoExistente.length) {
			cursoExistente[qntCurso] = cursos;
			qntCurso++;
			return true;
		}
		return false;
	}

	public Curso buscarCurso(String buscarCurso) {
		for(Curso procurarCurso: cursoExistente) {
			if(procurarCurso != null && procurarCurso.getNome().equals(buscarCurso)) {
				return procurarCurso;
			}
		}
		return null;
	}

	public boolean editarCurso(String buscarCurso, String novoCurso) {
		Curso procurarCurso = this.buscarCurso(buscarCurso);
		if(procurarCurso != null) {
			procurarCurso.setNome(novoCurso);
			return true;
		}
		return false;
	}

	public void listarCurso() {
		int contadora = 1;
		for(Curso cursos: cursoExistente) {
			if(cursos != null) {
				System.out.println("-----------------------------------------");
				System.out.format("%dº Curso:\n", contadora);
				System.out.println("ID do curso: " + cursos.getID());
				System.out.println("Nome do curso: " + cursos.getNome());
				System.out.println("Nome do professor: " + cursos.getProfessor().getNome());
				System.out.println("Descrição do curso: " + cursos.getDescricao());
				System.out.println("Disciplina: " + cursos.getDisciplina());
				contadora-=-1;
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
			if(procurarCurso != null && procurarCurso.getNome().equals(curso)) {
				for(int j = 0; j < cursoExistente.length; j++) {
					cursoExistente[i] = cursoExistente[j];
					if(j == (cursoExistente.length-1)) {
						cursoExistente[j] = null;
					}
				}
				this.qntCurso--;
				return true;
			}

		}
		return false;
	}
	
	public void listarAlunosCadastrados() {
		for (int i = 0; i < curso.getListaNomeDosAlunos().length; i++) {
			if(curso.getListaNomeDosAlunos()[i] != null) {
				System.out.println(curso.getListaNomeDosAlunos()[i].charAt(0));
				System.out.println("-----------------------------------------");
			}
		}
	}

	public Curso[] getCursoExistente() {
		return cursoExistente;
	}

	public int getQntCurso() {
		return qntCurso;
	}

}
