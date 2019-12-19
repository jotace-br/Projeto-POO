package curso.sistema;
import curso.controlador.ControladorMenu;
import curso.modelo.Menu;

public class Sistema {
	public static void main(String[] args) {
		//variáveis
		int opcaoSelecionadaMenuPrincipal = 0;
		int opcaoSelecionadaMenuDeCursos = 0;
		int opcaoSelecionadaMenuDeEventos = 0;
		int opcaoSairDoPrograma = 3;

		ControladorMenu controladorMenu = new ControladorMenu();
		Menu menuPrincipal = new Menu();

		try {
			do {
				opcaoSelecionadaMenuPrincipal = controladorMenu.exibirMenuPrincipal();
				switch (opcaoSelecionadaMenuPrincipal) {
				case 1:
					if(menuPrincipal.logarNoSistema()) {
						opcaoSelecionadaMenuDeCursos = controladorMenu.exibirMenuEventos();
						switch (opcaoSelecionadaMenuDeCursos) {
						case 1:
							try {
								menuPrincipal.adicionarLimiteCursos();
								System.out.format("Quantidade definida com sucesso!\n");
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
								break;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 2:
							try {
								menuPrincipal.adicionarCursos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
								break;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 3:
							try {
								menuPrincipal.editarCursos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
								break;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 4:
							try {
								menuPrincipal.removerCursos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
								break;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
						case 5:
							try {
								menuPrincipal.buscarCursos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
								break;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 6:
							try {
								menuPrincipal.listarCursos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
								break;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 7:
							try {
								menuPrincipal.voltarAoMenuPrincipal();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
								break;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s\n", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						default:
							opcaoSelecionadaMenuDeCursos = 0;
							menuPrincipal.deslogarNoSistema();
							opcaoSelecionadaMenuPrincipal = 0;
							System.out.println();
							break;
						}
					} else {
						System.out.format("\nImpossível entrar sem ser administrador!\n\n");
					}
				break;
				case 2:
					if(menuPrincipal.logarNoSistema()) {
						opcaoSelecionadaMenuDeEventos = controladorMenu.exibirMenuEventos();
						switch (opcaoSelecionadaMenuDeEventos) {
						case 1:
							try {
								menuPrincipal.adicionarLimiteEventos();
								System.out.format("Quantidade definida com sucesso!\n");
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 2:
							try {
								menuPrincipal.adicionarEventos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 3:
							try {
								menuPrincipal.editarEventos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 4:
							try {
								menuPrincipal.removerEventos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 5:
							try {
								menuPrincipal.buscarEventos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 6:
							try {
								menuPrincipal.listarEventos();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						case 7:
							try {
								menuPrincipal.voltarAoMenuPrincipal();
								menuPrincipal.deslogarNoSistema();
								opcaoSelecionadaMenuPrincipal = 0;
							} catch (Exception e) {
								System.err.println("Um erro inesperado aconteceu.");
								System.out.format("Veja mais em: \n%s", e);
								menuPrincipal.deslogarNoSistema();
							}
							break;
						default:
							opcaoSelecionadaMenuDeEventos = 0;
							menuPrincipal.deslogarNoSistema();
							opcaoSelecionadaMenuPrincipal = 0;
							System.out.println();
							break;
						}
					} else {
						System.out.format("\nImpossível entrar sem ser administrador!\n\n");
					}
					break;
				case 3:
					menuPrincipal.sairDoPrograma();
					opcaoSelecionadaMenuPrincipal = 0;
				default:
					break;
				}

			} while(opcaoSelecionadaMenuPrincipal != opcaoSairDoPrograma);

		} catch (Exception e) {
			System.out.println("Opção inválida.");
			System.out.format("Veja mais em: \n%s\n", e);
		} finally {
			System.out.println();
			System.out.println("Obrigado por usar o programa!");
		}
	}
}
