package curso.controlador;
import curso.modelo.Curso;
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
	
	public boolean existeEvento() {
		boolean encontrou = false;
		for (Evento evento : eventoExistente) {
			if (evento != null) {
				encontrou = true;	
			} else {
				System.out.println("Não há eventos disponíveis.");
				encontrou = false;
			}
		}
		return encontrou;
	}
	
	public boolean removerEvento(String evento) {
		for(int i = 0; i < eventoExistente.length; i++) {
			Evento procurarEvento = eventoExistente[i];
			if(procurarEvento != null && procurarEvento.getNome().equals(evento)) {
				for(int j = 0; j < eventoExistente.length; j++) {
					eventoExistente[i] = eventoExistente[j];
					if(j == (eventoExistente.length-1)) {
						eventoExistente[j] = null;
					}
				}
				this.qntEvento--;
				return true;
			}
		}
		return false;
	}

}
