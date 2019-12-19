package curso.controlador;
import java.util.Scanner;

import curso.modelo.Curso;
import curso.modelo.Endereco;
import curso.modelo.Evento;
import curso.modelo.Palestrante;
import curso.modelo.Professor;

public class ControladorMenu {
	private Scanner inputOpcao = new Scanner(System.in);
	private Scanner input = new Scanner(System.in);

	private ControladorCurso controladorCurso = new ControladorCurso(0);
	private ControladorEvento controladorEvento = new ControladorEvento(0);
	private Curso curso;
	private Professor professor;
	private Palestrante palestrante;
	private Endereco endereco;
	private Evento evento;

	public int exibirMenuPrincipal() {
		System.out.println("-- Menu principal --");
		System.out.println("1º Opção: Ir ao menu de opções dos cursos. [DESENVOLVEDOR]");
		System.out.println("2º Opção: Ir ao menu de opções dos eventos. [DESENVOLVEDOR]");
		System.out.println("3º Opção: Sair.");
		System.out.println();
		System.out.print("Digite a opção desejada: ");
		return inputOpcao.nextInt();
	}

	public int exibirMenuCursos() {
		System.out.println("-- Menu de cursos --");
		System.out.println("1º Opção: Adicionar quantidade limite de cursos.");
		System.out.println("2º Opção: Adicionar um novo curso.");
		System.out.println("3º Opção: Editar um curso existente.");
		System.out.println("4º Opção: Remover um curso existente.");
		System.out.println("5º Opção: Buscar um curso existente.");
		System.out.println("6º Opção: Listar todos os cursos.");
		System.out.println("7º Opção: Sair.");
		System.out.println();
		System.out.print("Digite a opção desejada: ");
		return inputOpcao.nextInt();
	}

	public int adicionarQuantidadeMenuCursos(int quantidadeDeCursos) {
		controladorCurso = new ControladorCurso(quantidadeDeCursos);
		return quantidadeDeCursos;
	}

	public boolean adicionarCurso() {
		if(controladorCurso.getQntCurso() < controladorCurso.getCursoExistente().length) {
			System.out.print("Digite o ID do curso: ");
			String idCurso = input.nextLine();

			System.out.print("Digite o nome do curso: ");
			String nomeCurso = input.nextLine();

			System.out.format("\nVamos para o professor!\n");

			System.out.print("Digite o nome do professor: ");
			String nomeProfessor = input.nextLine();

			System.out.print("Digite o RG do professor: ");
			String rgProfessor = input.nextLine();

			System.out.print("Digite o telefone do professor: ");
			String telefoneProfessor = input.nextLine();

			System.out.print("Digite a disciplina que o professor leciona: ");
			String disciplinaProfessor = input.nextLine();

			System.out.format("\nUfa! Agora digite a descrição do curso: ");
			String descricaoCurso = input.nextLine();

			System.out.print("Digite a disciplina do curso: ");
			String disciplinaCurso = input.nextLine();

			professor = new Professor(nomeProfessor, rgProfessor, 
											    telefoneProfessor, disciplinaProfessor);
			curso = new Curso(idCurso, nomeCurso, professor, descricaoCurso, disciplinaCurso);
			controladorCurso.adicionarCurso(curso);
			return true;
		} else {
			System.out.println("Não foi possível adicionar um curso devido ao limite de cursos estabelecido.");
		}
		return false;
	}

	public boolean editarCurso() {
		if(!controladorCurso.existeCurso()){
			System.out.println("Não há cursos disponí­veis para editar.");
		} else {
			try {
				System.out.println("-- Cursos disponíveis --");
				controladorCurso.listarCurso();
				System.out.println("------------------------");

				System.out.print("Digite o ID do curso que deseja editar: ");
				String buscarIdCurso = input.nextLine();

				System.out.print("Edite o nome do novo curso: ");
				String novoNomeCurso = input.nextLine();
				
				System.out.print("Edite a descricão do curso:");
				String novoDescricaoCurso = input.nextLine();
				
				System.out.print("Edite o nome do professor do curso: ");
				String novoNomeProfessor = input.nextLine();

				System.out.print("Edite nome do RG do professor: ");
				String novoRgProfessor = input.nextLine();

				System.out.print("Edite nome do telefone do professor: ");
				String novoTelefoneProfessor = input.nextLine();

				System.out.print("Edite nome da disciplina que o professor leciona: ");
				String novoDisciplinaProfessor = input.nextLine();

				System.out.print("Edite a disciplina do curso:");
				String novoDisciplinaCurso = input.nextLine();
				
				controladorCurso.editarCurso(buscarIdCurso, novoNomeCurso, novoDescricaoCurso,
						novoNomeProfessor, novoRgProfessor, novoTelefoneProfessor,
						novoDisciplinaProfessor, novoDisciplinaCurso);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}

	public boolean removerCurso() {
		try {
			System.out.print("Digite o ID do curso que deseja remover: ");
			String curso = input.nextLine();
			controladorCurso.removerCurso(curso);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean buscarCurso() {
		try {
			System.out.println("Digite o nome do curso para buscá-lo: ");
			String buscarCurso = input.nextLine();
			controladorCurso.buscarCurso(buscarCurso);
			//controladorCurso.exibirCurso(buscarCurso);
			return true;
		} catch (Exception e) {
			System.out.println("Não foi possível achar o curso.");
		}
		return false;
	}

	public void listarCurso() {
		controladorCurso.listarCurso();
	}

	public int exibirMenuEventos() {
		System.out.println("-- Menu de eventos --");
		System.out.println("1º Opção: Adicionar quantidade limite de eventos.");
		System.out.println("2º Opção: Adicionar um novo evento.");
		System.out.println("3º Opção: Editar um evento existente.");
		System.out.println("4º Opção: Remover um evento existente.");
		System.out.println("5º Opção: Buscar um evento existente.");
		System.out.println("6º Opção: Listar todos os eventos.");
		System.out.println("7º Opção: Sair.");
		System.out.println();
		System.out.print("Digite a opção desejada: ");
		return inputOpcao.nextInt();
	}

	public int adicionarQuantidadeMenuEventos(int quantidadeDeEventos) {
		controladorEvento = new ControladorEvento(quantidadeDeEventos);
		return quantidadeDeEventos;
	}

	public boolean adicionarEvento() {
		if(controladorEvento.getQuantidadeEvento() < controladorEvento.getEventoExistente().length) {
			System.out.print("Digite o ID do evento: ");
			String idEvento = input.nextLine();

			System.out.print("Digite o nome do evento: ");
			String nomeEvento = input.nextLine();

			System.out.format("\nVamos para o palestrante!\n");

			System.out.print("Digite o nome do palestrante: ");
			String nomePalestrante = input.nextLine();

			System.out.print("Digite o RG do palestrante: ");
			String rgPalestrante = input.nextLine();

			System.out.print("Digite o telefone do palestrante: ");
			String telefonePalestrante = input.nextLine();

			System.out.print("Digite o tema da palestra: ");
			String temaPalestra = input.nextLine();

			System.out.format("\nUfa! Agora digite a descrição do evento: ");
			String descricaoEvento = input.nextLine();

			System.out.print("Digite o nome dos organizadores: ");
			String organizadores = input.nextLine();

			System.out.print("Digite a data do evento: ");
			String dataEvento = input.nextLine();

			System.out.format("\nAgora vamos para a localização!\n");

			System.out.print("Digite o endereço do evento: ");
			String cepEnderecoEvento = input.nextLine();

			System.out.print("Digite o nome da rua do evento: ");
			String ruaEnderecoEvento = input.nextLine();

			System.out.print("Digite o número do local do evento: ");
			String numeroEnderecoEvento = input.nextLine();

			palestrante = new Palestrante(nomePalestrante, rgPalestrante, 
														  telefonePalestrante, temaPalestra);
			endereco = new Endereco(cepEnderecoEvento, ruaEnderecoEvento, 
												 		  numeroEnderecoEvento);
			evento = new Evento(idEvento, nomeEvento, palestrante, 
										   				  descricaoEvento, organizadores, 
										   				  dataEvento, endereco);
			controladorEvento.adicionarEvento(evento);
			return true;
		} else {
			System.out.println("Não foi possível adicionar um curso devido ao limite de cursos estabelecido.");
		}
		return false;
	}

	public boolean editarEvento() {
		if(!controladorEvento.existeEvento()){
			System.out.println("Não há cursos disponíveis para editar.");
		} else {
			try {
				System.out.println("-- Eventos disponíveis --");
				controladorEvento.listarEvento();
				System.out.println("------------------------");

				System.out.print("Digite o ID do evento que deseja editar: ");
				String buscarIdEvento = input.nextLine();

				System.out.print("Edite o nome do evento: ");
				String novoNomeEvento = input.nextLine();

				System.out.print("Edite a descrição do evento: ");
				String novaDescricao = input.nextLine();
				
				System.out.print("Edite o nome dos organizadores: ");
				String novoOrganizadoresEvento = input.nextLine();

				System.out.print("Edite o nome do palestrante do evento: ");
				String novoNomePalestrante = input.nextLine();

				System.out.print("Edite o RG do palestrante: ");
				String novoRgPalestrante = input.nextLine();

				System.out.print("Edite o telefone do palestrante: ");
				String novoTelefonePalestrante = input.nextLine();

				System.out.print("Edite o tema da palestra: ");
				String novoTemaPalestra = input.nextLine();

				System.out.print("Edite o local do evento: ");
				String ruaEndereco = input.nextLine();

				System.out.print("Edite o bairro do local do evento: ");
				String bairroEndereco = input.nextLine();

				System.out.print("Edite o numero do local do evento: ");
				String numeroEndereco = input.nextLine();
				
				System.out.print("Edite a data do local do evento: ");
				String dataEvento = input.nextLine();

				controladorEvento.editarEvento(buscarIdEvento, novoNomeEvento, novaDescricao,
						novoOrganizadoresEvento, novoNomePalestrante, novoRgPalestrante,
						novoTelefonePalestrante, novoTemaPalestra,ruaEndereco, bairroEndereco,
						numeroEndereco, dataEvento);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}

	public boolean removerEvento() {
		try {
			System.out.print("Digite o nome do evento que deseja remover: ");
			String evento = input.nextLine();
			controladorEvento.removerEvento(evento);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean buscarEvento() {
		try {
			System.out.println("Digite o nome do evento para buscá-lo: ");
			String buscarEvento = input.nextLine();
			controladorEvento.buscarEvento(buscarEvento);
			return true;
		} catch (Exception e) {
			System.out.println("Não foi possível achar o curso.");
		}
		return false;
	}

	public void listarEvento() {
		controladorEvento.listarEvento();
	}
}
