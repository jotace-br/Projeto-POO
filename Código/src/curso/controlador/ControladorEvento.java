package curso.controlador;
import curso.modelo.Evento;

public class ControladorEvento {
	private Evento[] eventoExistente;
	private int qntEvento;

	public ControladorEvento(int capacidade) {
		this.eventoExistente = new Evento[capacidade];
		this.qntEvento = 0;
	}

	public boolean adicionarEvento(Evento eventos) {
		if(eventos != null && qntEvento < eventoExistente.length) {
			return true;
		}
		return false;
	}

	public Evento buscarEvento(String buscarEvento) {
		for (Evento procurarEvento : eventoExistente) {
			if(procurarEvento != null && procurarEvento.getNome().equals(buscarEvento)) {
				return procurarEvento;
			}
		}
		return null;
	}

	public boolean editarEvento(String buscarEvento, String novoEvento) {
		Evento procurarEvento = this.buscarEvento(buscarEvento);
		if(procurarEvento != null) {
			procurarEvento.setNome(novoEvento);
			return true;
		}
		return false;
	}

	public void listarEvento() {
		for (Evento eventos : eventoExistente) {
			if(eventos != null) {
				System.out.println(eventos);
			}
			break;
		}
	}
	
	public boolean removerEvento(int posicao) {
		listarEvento();
		//terá que pedir a posição desejada no menu
		if(posicao <= eventoExistente.length) {
			eventoExistente[posicao] = null;
			return true;
		}
		return false;
	}





}
