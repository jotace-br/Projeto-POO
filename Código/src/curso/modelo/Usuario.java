package curso.modelo;

public class Usuario {
	private String login;
	private String senha;
	private boolean administrador;
	private boolean administradorLogin;
	private boolean administradorSenha;

	public Usuario() {
		this.login = "walker.ataide";
		this.senha = "_ifal_riolargo_";
		this.administradorLogin = false;
		this.administradorSenha = false;
		this.administrador = false;
	}

	public boolean verificarUsuario(String loginUser) {
		if(login.equals(loginUser)) {
			administradorLogin = true;
		}
		return administradorLogin;
	}

	public boolean verificarSenha(String loginSenha) {
		if(senha.equals(loginSenha)) {
			administradorSenha = true;
		}
		return administradorSenha;
	}

	public boolean adminEstaLogado() {
		if(administradorLogin && administradorSenha) {
			administrador = true;
		}
		return administrador;
	}
	
	public void deslogarAdmin() {
		administradorLogin = false;
		administradorSenha = false;
		administrador = false;
	}

}
