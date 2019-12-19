package curso.modelo;

final public class Palestrante extends Pessoa {
	private String temaPalestra;

	public Palestrante(String nome, String rg, String telefone, String temaPalestra) {
		super(nome, rg, telefone);
		this.temaPalestra = temaPalestra;
	}
	
	public String getTemaPalestra() {
		return temaPalestra;
	}
	
}
