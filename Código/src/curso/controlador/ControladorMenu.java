package curso.controlador;

import java.util.Scanner;

import curso.modelo.Curso;
import curso.modelo.Professor;

public class ControladorMenu {
	Scanner inputOpcao = new Scanner(System.in);
	Scanner input = new Scanner(System.in);

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

	public int adicionarQuantidadeMenuCursos(int quantidadeDeCursos) {
		controladorCurso = new ControladorCurso(quantidadeDeCursos);
		return quantidadeDeCursos;
	}

	public boolean adicionarCurso() {
		try {
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

			System.out.print("Digite o cargo do professor: ");
			String cargoProfessor = input.nextLine();

			System.out.print("Digite a disciplina que o professor leciona: ");
			String disciplinaProfessor = input.nextLine();

			System.out.format("\nUfa! Agora digite a descrição do curso: ");
			String descricaoCurso = input.nextLine();

			System.out.print("Digite a disciplina do curso: ");
			String disciplinaCurso = input.nextLine();

			Professor professor = new Professor(nomeProfessor, rgProfessor, telefoneProfessor, cargoProfessor, disciplinaProfessor);
			Curso curso = new Curso(idCurso, nomeCurso, professor, descricaoCurso, disciplinaCurso);
			controladorCurso.adicionarCurso(curso);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean editarCurso() {
		try {
			System.out.print("Digite o nome do curso que deseja editar: ");
			String buscarCurso = input.nextLine();
			
			System.out.print("Digite o nome do novo curso: ");
			String novoCurso = input.nextLine();
			controladorCurso.editarCurso(buscarCurso, novoCurso);
			return true;
		} catch (Exception e) {
			return false;
		}
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
