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
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean checkUser(String loginUser) {
		if(this.login.equals(loginUser)) {
			return true == administradorLogin;
		}
		return false;
	}

	public boolean checkSenha(String loginSenha) {
		if(this.login.equals(loginSenha)) {
			return true == administradorSenha;
		}
		return false;
	}

	public boolean logado() {
		if(administradorLogin && administradorSenha) {
			return true == administrador;
		}
		return false;
	}

}
