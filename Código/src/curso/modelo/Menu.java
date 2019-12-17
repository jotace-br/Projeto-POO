package curso.modelo;
import curso.controlador.*;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//menu principal e menus secundários
		Scanner inputOpcaoMenuPrincipal;
		Scanner inputOpcaoMenuCursos;
		Scanner inputOpcaoMenuEventos;

		int opcaoSelecionadaMenuPrincipal = 0;
		int opcaoSairMenuPrincipal = 5;
		int opcaoSelecionadaMenuCursos;
		int opcaoSelecionadaMenuEventos;

		Usuario admin = new Usuario();
		String user;
		String password;

		ControladorCurso controladorCurso;
		int quantidadeDeCursos;
		Curso curso;

		ControladorMenu controladorMenu = new ControladorMenu();

		inputOpcaoMenuPrincipal = new Scanner(System.in);

		Usuario a = new Usuario();
		
		controladorMenu.exibirMenuPrincipal();

		System.out.print("Digite a opção desejada: ");
		opcaoSelecionadaMenuPrincipal = inputOpcaoMenuPrincipal.nextInt();

		do {
			controladorMenu.exibirMenuPrincipal();

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

				 if(admin.isLogado()) {
					 opcaoSelecionadaMenuCursos = controladorMenu.exibirMenuCursos();
					switch (opcaoSelecionadaMenuCursos) {
					case 1:
						System.out.print("Digite a quantidade limite de cursos: ");
						quantidadeDeCursos = input.nextInt();
						controladorCurso = new ControladorCurso(quantidadeDeCursos);
						break;
					case 2:
						System.out.print("Digite o ID do curso: ");
						String id = input.nextLine();

						System.out.print("Digite o nome do curso: ");
						String nomeCurso = input.nextLine();

						System.out.println("Vamos para o professor!");

						System.out.print("Digite o nome do professor: ");
						String nomeProfessor = input.nextLine();

						System.out.print("Digite o RG do professor: ");
						String rg = input.nextLine();

						System.out.print("Digite o telefone do professor: ");
						String telefone = input.nextLine();

						System.out.print("Digite o cargo do professor: ");
						String cargo = input.nextLine();

						System.out.print("Digite a disciplina que o professor leciona: ");
						String disciplinaProfessor = input.nextLine();

						System.out.println("Ufa! Agora digite a descrição do curso: ");
						String descricao = input.nextLine();

						System.out.println("Digite a disciplina do curso: ");
						String disciplina = input.nextLine();


						Professor professor = new Professor(nomeProfessor, rg, telefone, cargo, disciplinaProfessor);
						curso = new Curso(id, nomeCurso, professor, descricao, disciplina);
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
	}}	 




