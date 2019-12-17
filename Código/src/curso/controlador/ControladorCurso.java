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
		for(Curso cursos: cursoExistente) {
			if(cursos != null) {
				System.out.println(cursos);
			}
			break;
		}
	}

	public boolean removerCurso(String curso) {
		for(int i = 0; i < cursoExistente.length;i++) {
			Curso procurarCurso = cursoExistente[i];
			if(procurarCurso != null && procurarCurso.getNome()==curso) {
				for(int j=0; j<cursoExistente.length;j++) {
					cursoExistente[i]=cursoExistente[j];
					if(j == (cursoExistente.length-1)) {
						cursoExistente[j]=null;
					}

				}
				this.qntCurso--;
				return true;
			}

		}
		return false;
	}


}
