package curso.controlador;
import curso.modelo.Curso;

public class Controlador_Curso {
	private Curso[] curso_Existente;
	private int qnt_Curso;
	
	public Controlador_Curso(int capacidade){
		this.curso_Existente = new Curso[capacidade];
		this.qnt_Curso= 0;
	}
	
	
	public boolean adicionar(Curso cursos) {
		if(cursos != null && qnt_Curso < curso_Existente.length) {
			curso_Existente[qnt_Curso] = cursos;
			qnt_Curso++;
			
			return true;
			
		}
		return false;
	}
	 

	public Curso buscar ( String  buscar_Curso) {
		for(Curso procurar: curso_Existente) {
			if(procurar != null && procurar.getNome()== buscar_Curso) {
				return procurar;
				
			}
		}
		return null;
		
	}
	
	public boolean editar(String buscar_Curso, String novo_Curso) {
		Curso procurar = this.buscar(buscar_Curso);
		
		if(procurar != null) {
			procurar.setNome(novo_Curso);
			return true;
		}
		return false;
	}
	
	public void listar() {
		for(Curso cursos: curso_Existente) {
			if(cursos != null) {
				System.out.println(cursos);
			}
			else {
				break;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	

}
