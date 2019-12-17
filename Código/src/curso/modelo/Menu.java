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
						controladorMenu.adicionarQuantidadeMenuCursos(quantidadeDeCursos);
						System.out.format("\n Quantidade definida com sucesso!\n");
						admin.deslogar();
						System.out.println(input.nextLine());
						break;
					case 2:
						try {
							do {
								controladorMenu.adicionarCurso();
								if(controladorMenu.adicionarCurso()) {
									System.out.println("Curso adicionado!");
								} else {
									System.out.println("Não foi possível adicionar o curso.");
								}
							} while(opcaoFazerNovamente.equalsIgnoreCase("S"));
						} catch (Exception e) {
							System.out.println("Não foi possível adicionar o curso.");
						} finally {
							System.out.println();
							System.out.print("Deseja adicionar outro curso?: [S/N]");
							opcaoFazerNovamente = input.nextLine();
						}
						admin.deslogar();
						System.out.println(input.nextLine());
						break;
					case 3:
						try {
							controladorMenu.editarCurso();
							if(controladorMenu.editarCurso()) {
								System.out.println("Curso editado com sucesso!");
							} else {
								System.out.println("Não foi possível adicionar o curso.");
							}
						} catch (Exception e) {
							System.out.println("Não foi possível adicionar o curso.");
						} finally {
							System.out.println();
						}
						break;
					case 4:
						break;

					}

				} else {
					System.out.format("Impossível entrar sem ser administrador!\n");
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




