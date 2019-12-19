package curso.modelo;

final public class Palestrante extends Pessoa {
	//atributos de pessoa
	private String temaPalestra;

	//construtor de palestrante
	public Palestrante(String nome, String rg, String telefone, String temaPalestra) {
		super(nome, rg, telefone);
		this.temaPalestra = temaPalestra;
	}
	
	//getters e setters
	public String getTemaPalestra() {
		return temaPalestra;
	}

	public void setTemaPalestra(String temaPalestra) {
		this.temaPalestra = temaPalestra;
	}

}
