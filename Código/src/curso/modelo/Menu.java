package curso.modelo;
import curso.controlador.*;
import java.util.Scanner;

public class Menu {
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);

		int opcaoSelecionadaMenuPrincipal = 0;
		int opcaoSairMenuPrincipal = 5;
		int opcaoSelecionadaMenuCursos;
		String opcaoFazerNovamente = "N";

		Usuario admin = new Usuario();
		String user;
		String password;

		ControladorCurso controladorCurso = null;

		ControladorMenu controladorMenu = new ControladorMenu();

		do {
			opcaoSelecionadaMenuPrincipal = controladorMenu.exibirMenuPrincipal();
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
						System.out.println("Digite a quantidade limite de cursos: ");
						int quantidadeDeCursos = input.nextInt();
						controladorMenu.adicionarCursoMenuCursos(quantidadeDeCursos);
						System.out.format("\n Quantidade definida com sucesso!");
						break;
					case 2:
						do {
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

							Curso curso = new Curso(id, nomeCurso, professor, descricao, disciplina);

							controladorCurso.adicionarCurso(curso);
							System.out.println("Curso adicionado!");
							System.out.println();
							System.out.print("Deseja adicionar outro curso?: [S/N]");
						} while(opcaoFazerNovamente.equalsIgnoreCase("S"));
						admin.deslogar();
						break;
					case 3:
						
					default:
						break;

					}

				} else {
					System.out.println("Impossível entrar sem ser administrador!");
				}
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				break;
			}

		} while (opcaoSelecionadaMenuPrincipal != opcaoSairMenuPrincipal);
	}}	 




