package curso.controlador;

import java.util.Scanner;

public class ControladorMenu {
	Scanner inputOpcao = new Scanner(System.in);
	ControladorCurso controladorCurso;
	
	public int exibirMenuPrincipal() {
		System.out.println("-- Menu principal --");
		System.out.println("1º Opção: Ir ao menu de opções dos cursos. [DESENVOLVEDOR]");
		System.out.println("2º Opção: Ir ao menu de opções dos eventos. [DESENVOLVEDOR]");
		System.out.println("3º Opção: Participar de um curso.");
		System.out.println("4º Opção: Participar de um evento.");
		//mais opções no futuro...
		System.out.println("5º Opção: Sair.");
		System.out.println();
		System.out.print("Digite a opção desejada:");
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
		System.out.print("Digite a opção desejada:");
		return inputOpcao.nextInt();
	}
	
	public int adicionarCursoMenuCursos(int quantidadeDeCursos) {
		controladorCurso = new ControladorCurso(quantidadeDeCursos);
		return quantidadeDeCursos;
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
		System.out.print("Digite a opção desejada:");
		return inputOpcao.nextInt();
	}
}
