package curso.modelo;
import curso.controlador.*;
import java.util.Scanner;

public class Menu {
	private static Scanner input;
	
	//menu principal e menus secundários
	private static Scanner inputOpcaoMenuPrincipal;
	private int opcaoSelecionadaMenuPrincipal;
	private static int opcaoSairMenuPrincipal = 5;
	private static int opcaoSelecionadaMenuCursos;
	
	private static Usuario admin = new Usuario();
	private static String user;
	private static String password;

	public static void main(String[] args) {
		inputOpcaoMenuPrincipal = new Scanner(System.in);
		int opcaoSelecionadaMenuPrincipal = 0;

		do {
			opcaoSelecionadaMenuPrincipal = exibirMenuPrincipal();

			System.out.print("Digite a opção desejada: ");
			opcaoSelecionadaMenuPrincipal = inputOpcaoMenuPrincipal.nextInt();

			switch (opcaoSelecionadaMenuPrincipal) {
			case 1:
				System.out.println("Digite o login: ");
				user = input.nextLine();
				admin.checkUser(user);
				
				System.out.println("Digite a senha: ");
				password = input.nextLine();
				admin.checkSenha(password);
				
				if(admin.logado()) {
					opcaoSelecionadaMenuCursos = exibirMenuCursos();
					switch (opcaoSelecionadaMenuCursos) {
					case value:
						
						break;

					default:
						break;
					}
				} else {
					System.out.println("Impossível entrar sem ser administrador!");
				}

				break;

			default:
				break;
			}

		} while (opcaoSelecionadaMenuPrincipal != opcaoSairMenuPrincipal);
	}

	static int exibirMenuPrincipal() {
		input = new Scanner(System.in);
		System.out.println("-- Menu principal --");
		System.out.println("1º Opção: Ir ao menu de opções dos cursos. [DESENVOLVEDOR]");
		System.out.println("2º Opção: Ir ao menu de opções dos eventos. [DESENVOLVEDOR]");
		System.out.println("3º Opção: Participar de um curso.");
		System.out.println("4º Opção: Participar de um evento.");
		//mais opções no futuro...
		System.out.println("5º Opção: Sair.");
		return input.nextInt();
	}

	static int exibirMenuCursos() {
		input = new Scanner(System.in);
		System.out.println("-- Menu de cursos --");
		System.out.println("1º Opção: Adicionar quantidade limite de cursos.");
		System.out.println("2º Opção: Adicionar um novo curso.");
		System.out.println("3º Opção: Editar um curso existente.");
		System.out.println("4º Opção: Remover um curso existente.");
		System.out.println("5º Opção: Buscar um curso existente.");
		System.out.println("6º Opção: Listar todos os cursos.");
		System.out.println("7º Opção: Sair.");
		return input.nextInt();
	}
	
	static int exibirMenuEventos() {
		input = new Scanner(System.in);
		System.out.println("-- Menu de cursos --");
		System.out.println("1º Opção: Adicionar quantidade limite de eventos.");
		System.out.println("2º Opção: Adicionar um novo evento.");
		System.out.println("3º Opção: Editar um evento existente.");
		System.out.println("4º Opção: Remover um evento existente.");
		System.out.println("5º Opção: Buscar um evento existente.");
		System.out.println("6º Opção: Listar todos os eventos.");
		System.out.println("7º Opção: Sair.");
		return input.nextInt();
	}
}
