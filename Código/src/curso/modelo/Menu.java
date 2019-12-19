package curso.modelo;

import java.util.Scanner;
import curso.controlador.ControladorMenu;

public class Menu {
	private Scanner entradaDeDados = new Scanner(System.in);
	private Scanner opcaoSair = new Scanner(System.in);
	private String opcaoFazerNovamente;

	private String usuarioUsuario;
	private String senhaUsuario;

	private ControladorMenu controladorMenu = new ControladorMenu();
	private Usuario administrador = new Usuario();

	public boolean logarNoSistema() {
		if (!administrador.adminEstaLogado()) {
			System.out.print("Digite o login: ");
			usuarioUsuario = entradaDeDados.next();
			administrador.verificarUsuario(usuarioUsuario);

			System.out.print("Digite a senha: ");
			senhaUsuario = entradaDeDados.next();
			administrador.verificarSenha(senhaUsuario);
			return administrador.adminEstaLogado();
		} else {
			return !administrador.adminEstaLogado();
		}
	}

	public void deslogarNoSistema() {
		administrador.deslogarAdmin();
	}

	public void adicionarLimiteCursos() {
		System.out.print("Digite a quantidade limite de cursos: ");
		int quantidadeDeCursos = entradaDeDados.nextInt();
		controladorMenu.adicionarQuantidadeMenuCursos(quantidadeDeCursos);
	}

	public void adicionarCursos() {
		do {
			if(controladorMenu.adicionarCurso()) {
				System.out.format("Curso adicionado!\n");
				System.out.print("Deseja adicionar outro curso? [S/N]: ");
				opcaoFazerNovamente = entradaDeDados.next();
			} else {
				opcaoFazerNovamente = "N";
			}
		} while(opcaoFazerNovamente.equalsIgnoreCase("S"));
	}

	public void editarCursos() {
		if(controladorMenu.editarCurso()) {
			System.out.println("Curso editado com sucesso!");
		} else {
			System.out.println("Não foi possível editar o curso.");
		}
	}

	public void removerCursos() {
		if(controladorMenu.removerCurso()) {
			System.out.println("Curso removido com sucesso!");
		} else {
			System.out.println("Não foi possível remover o curso.");
		}
	}

	public void buscarCursos() {
		if(controladorMenu.buscarCurso()) {
			System.out.println("Curso(s) encontrado(s).");
		} else {
			System.out.println("Nenhum curso encontrado.");
		}
	}

	public void listarCursos() {
		controladorMenu.listarCurso();
	}

	public void voltarAoMenuPrincipal() {
		System.out.println("Voltando para o menu principal...");
		administrador.deslogarAdmin();
	}

	public void adicionarLimiteEventos() {
		System.out.print("Digite a quantidade limite de eventos: ");
		int quantidadeDeEventos = entradaDeDados.nextInt();
		controladorMenu.adicionarQuantidadeMenuEventos(quantidadeDeEventos);
	}

	public void adicionarEventos() {
		do {
			if(controladorMenu.adicionarEvento()) {
				System.out.format("Evento adicionado!\n");
				System.out.print("Deseja adicionar outro evento? [S/N]: ");
				opcaoFazerNovamente = entradaDeDados.next();
			} else {
				opcaoFazerNovamente = "N";
			}
		} while(opcaoFazerNovamente.equalsIgnoreCase("S"));
	}

	public void editarEventos() {
		if(controladorMenu.editarEvento()) {
			System.out.println("Evento editado com sucesso!");
		} else {
			System.out.println("Não foi possível editar o evento.");
		}
	}

	public void removerEventos() {
		if(controladorMenu.removerEvento()) {
			System.out.println("Evento removido com sucesso!");
		} else {
			System.out.println("Não foi possível remover o evento.");
		}
	}

	public void buscarEventos() {
		if(controladorMenu.buscarEvento()) {
			System.out.println("Evento(s) encontrado(s).");
		} else {
			System.out.println("Nenhum evento encontrado.");
		}
	}

	public void listarEventos() {
		controladorMenu.listarEvento();
	}

	public void sairDoPrograma() {
		System.out.print("Você deseja realmente sair do programa? [S/N]: ");
		String sairdoProgramaDecisao = opcaoSair.next();
		if (sairdoProgramaDecisao.equalsIgnoreCase("S")) {
			System.out.println("Fechando o programa...");
			System.exit(0);
		} else if (sairdoProgramaDecisao.equalsIgnoreCase("N")){
			sairdoProgramaDecisao = "N";
			System.out.println();
			controladorMenu.exibirMenuPrincipal();
		} else {
			System.out.println("Opção inválida! Fechando o programa...");
			System.exit(0);
		}
	}
}
