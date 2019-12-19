package curso.controlador;
import curso.modelo.Endereco;
import curso.modelo.Evento;
import curso.modelo.Palestrante;

public class ControladorEvento {
	//atributos do controlador de evento
	private Evento[] eventoExistente;
	private int quantidadeEvento;
	private int contadora;
	
	//instanciação
	Endereco editarEndereco;
	Palestrante editarPalestrante;

	//construtor do controlador de evento
	public ControladorEvento(int capacidade) {
		this.eventoExistente = new Evento[capacidade];
		this.quantidadeEvento = 0;
		this.contadora = 1;
	}

	//métodos do controlador de evento
	public boolean adicionarEvento(Evento eventos) {
		if(eventos != null && quantidadeEvento < eventoExistente.length) {
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

	public boolean editarEvento(String buscarIdEvento, String novoEvento, String novaDescricao,
							    String novoNomePalestrante, String novoRgPalestrante,
							    String novoTelefonePalestrante, String novoTemaPalestra, 
							    String ruaEndereco,String bairroEndereco, Long numeroEndereco) {
		
		Evento procurarEvento = this.buscarEvento(buscarIdEvento);
		editarPalestrante = new Palestrante(novoNomePalestrante, novoRgPalestrante,
										  novoTelefonePalestrante, novoTemaPalestra);
		editarEndereco = new Endereco(ruaEndereco, bairroEndereco, numeroEndereco);
		
		if(procurarEvento != null) {
			procurarEvento.setNome(novoEvento);
			procurarEvento.setDescricao(novaDescricao);
			procurarEvento.setPalestrante(editarPalestrante);
			procurarEvento.setLocalizacao(editarEndereco);
			return true;
		}
		return false;
	}

	public void listarEvento() {
		for (Evento eventos : eventoExistente) {
			if(eventos != null) {
				System.out.println("-----------------------------------------");
				System.out.format("%dº Curso:\n", contadora);
				System.out.println("ID do evento: " + eventos.getID());
				System.out.println("Nome do evento: " + eventos.getNome());
				System.out.println("Nome do palestrante: " + eventos.getPalestrante().getNome());
				System.out.println("Tema da palestra: " + eventos.getPalestrante().getTemaPalestra());
				System.out.println("Descrição do evento: " + eventos.getDescricao());
				System.out.println("Organizadores: " + eventos.getOrganizadores());
				System.out.println("Data do evento: " + eventos.getData());
				System.out.println("Localização do evento: " + eventos.getLocalizacao());
				contadora++;
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
				this.quantidadeEvento--;
				return true;
			}
		}
		return false;
	}
}
