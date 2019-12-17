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
			if(procurarEvento != null && procurarEvento.getNome() == buscarEvento) {
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

	public void listar() {
		for (Evento eventos : eventoExistente) {
			if(eventos != null) {
				System.out.println(eventos);
			}
			break;
		}
	}





}
