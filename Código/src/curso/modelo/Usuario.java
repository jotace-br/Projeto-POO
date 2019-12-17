package curso.modelo;

public class Usuario {
	private String login;
	private String senha;
	private boolean administrador;
	private boolean administradorLogin;
	private boolean administradorSenha;

	public Usuario() {
		this.login = "ADMGeral";
		this.senha = "123";
		this.administradorLogin = false;
		this.administradorSenha = false;
		this.administrador = false;
	}

	public boolean checkUser(String loginUser) {
		if(login.equals(loginUser)) {
			administradorLogin = true;
		}
		return administradorLogin;
	}

	public boolean checkSenha(String loginSenha) {
		if(senha.equals(loginSenha)) {
			administradorSenha = true;
		}
		return administradorSenha;
	}

	public boolean isLogado() {
		if(administradorLogin && administradorSenha) {
			administrador = true;
		}
		return administrador;
	}
	
	public void deslogar() {
		administradorLogin = false;
		administradorSenha = false;
		administrador = false;
	}

}
