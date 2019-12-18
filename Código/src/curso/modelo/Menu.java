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
		int opcaoSelecionadaMenuEventos;
		String opcaoFazerNovamente = "N";

		Usuario admin = new Usuario();
		String user;
		String password;

		ControladorMenu controladorMenu = new ControladorMenu();
		try {
			do {
				opcaoSelecionadaMenuPrincipal = controladorMenu.exibirMenuPrincipal();
				switch (opcaoSelecionadaMenuPrincipal) {
				case 1:
					System.out.print("Digite o login: ");
					user = input.nextLine();
					admin.checkUser(user);

					System.out.print("Digite a senha: ");
					password = input.nextLine();
					admin.checkSenha(password);

					if(admin.isLogado()) {
						opcaoSelecionadaMenuCursos = controladorMenu.exibirMenuCursos();
						switch (opcaoSelecionadaMenuCursos) {
						case 1:
							try {
								System.out.print("Digite a quantidade limite de cursos: ");
								int quantidadeDeCursos = input.nextInt();
								controladorMenu.adicionarQuantidadeMenuCursos(quantidadeDeCursos);
								System.out.format("\n Quantidade definida com sucesso!\n");
								admin.deslogar();
								System.out.println(input.nextLine());
							} catch (Exception e) {
								System.out.println("Não foi possível definir um limite de curso.");
							}					
							break;
						case 2:
							try {
								do {
									if(controladorMenu.adicionarCurso()) {
										System.out.println("Curso adicionado!");
										System.out.println();
										System.out.print("Deseja adicionar outro curso?: [S/N]");
										opcaoFazerNovamente = input.nextLine();
									} else {
										System.out.println("Não foi possível adicionar o curso.");
									}
								} while(opcaoFazerNovamente.equalsIgnoreCase("S"));
							} catch (Exception e) {
								System.out.println("Não foi possível adicionar o curso.");
							}
							admin.deslogar();
							System.out.println(input.nextLine());
							break;
						case 3:
							try {
								if(controladorMenu.editarCurso()) {
									System.out.println("Curso editado com sucesso!");
								} else {
									System.out.println("Não foi possível editar o curso.");
								}
							} catch (Exception e) {
								System.out.println("Não foi possível editar o curso.");
							}
							break;
						case 4:
							try {
								if(controladorMenu.removerCurso()) {
									System.out.println("Curso removido com sucesso!");
								} else {
									System.out.println("Não foi possível remover o curso.");
								}
							} catch (Exception e) {
								System.out.println("Não foi possível remover o curso.");
							}
							break;
						case 5:
							try {
								if(controladorMenu.buscarCurso()) {
									System.out.println("Curso encontrados.");
								} else {
									System.out.println("Nenhum curso encontrado.");
								}
							} catch (Exception e) {
								System.out.println("Nenhum curso encontrado.");
							} finally {
								System.out.println();
							}
							break;
						case 6:
							try {
								System.out.println("Cursos existentes: ");
								System.out.println();
								controladorMenu.listarCurso();
								System.out.println("-------------------");
								break;
							} catch (Exception e) {
								System.out.println("Não há cursos disponíveis.");
							}
							break;
						case 7:
							System.out.println("Voltando para o menu principal...");
							break;
						default:
							System.out.println();
							break;
						}
					} else {
						System.out.format("Impossível entrar sem ser administrador!\n");
					}
					break;
				case 2:
					System.out.print("Digite o login: ");
					user = input.nextLine();
					admin.checkUser(user);

					System.out.print("Digite a senha: ");
					password = input.nextLine();
					admin.checkSenha(password);

					if(admin.isLogado()) {
						opcaoSelecionadaMenuEventos = controladorMenu.exibirMenuEventos();
						switch (opcaoSelecionadaMenuEventos) {
						case 1:
							try {
								System.out.print("Digite a quantidade limite de eventos: ");
								int quantidadeDeEventos = input.nextInt();
								controladorMenu.adicionarQuantidadeMenuEventos(quantidadeDeEventos);
								System.out.format("\n Quantidade definida com sucesso!\n");
								admin.deslogar();
								System.out.println(input.nextLine());
							} catch (Exception e) {
								System.out.println("Não foi possível definir um limite de evento.");
							}
							break;
						case 2:
							try {
								do {
									if(controladorMenu.adicionarEvento()) {
										System.out.println("Evento adicionado!");
										System.out.println();
										System.out.print("Deseja adicionar outro evento?: [S/N]");
										opcaoFazerNovamente = input.nextLine();
									} else {
										System.out.println("Não foi possível adicionar o evento.");
									}
								} while(opcaoFazerNovamente.equalsIgnoreCase("S"));
							} catch (Exception e) {
								System.out.println("Não foi possível adicionar o evento.");
							}
							admin.deslogar();
							System.out.println(input.nextLine());
							break;
						case 3:
							try {
								if(controladorMenu.editarEvento()) {
									System.out.println("Evento editado com sucesso!");
								} else {
									System.out.println("Não foi possível editar o evento.");
								}
							} catch (Exception e) {
								System.out.println("Não foi possível editar o evento.");
							}
							break;
						case 4:
							try {
								if(controladorMenu.removerEvento()) {
									System.out.println("Evento removido com sucesso!");
								} else {
									System.out.println("Não foi possível remover o evento.");
								}
							} catch (Exception e) {
								System.out.println("Não foi possível remover o evneto.");
							}
							break;
						case 5:
							try {
								if(controladorMenu.buscarEvento()) {
									System.out.println("Eventos encontrados.");
								} else {
									System.out.println("Nenhum evento encontrado.");
								}
							} catch (Exception e) {
								System.out.println("Nenhum evento encontrado.");
							}
							break;
						case 6:
							try {
								System.out.println("Eventos existentes: ");
								System.out.println();
								controladorMenu.listarCurso();
								System.out.println("-------------------");
							} catch (Exception e) {
								System.out.println("Não há eventos disponíveis.");
							}
							break;
						case 7:
							System.out.println("Voltando para o menu principal...");
							break;
						default:
							System.out.println();
							break;
						}
					}
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println();
					break;
				}

			} while (opcaoSelecionadaMenuPrincipal != opcaoSairMenuPrincipal);
		} catch (Exception e) {
			System.out.println("Opção inválida.");
		} finally {
			System.out.println("Obrigado por usar o programa!");
		}
	}
}	 




