package curso.controlador;
import curso.modelo.Curso;

public class ControladorCurso {
	private Curso[] cursoExistente;
	private int qntCurso;

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
			if(procurarCurso != null && procurarCurso.getNome()== buscarCurso) {
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

	public void listar() {
		for(Curso cursos: cursoExistente) {
			if(cursos != null) {
				System.out.println(cursos);
			}
			break;

		}

	}










}
