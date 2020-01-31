package curso.java.lista13;

import interfaces.PermitirAcesso;

public class Aluno implements PermitirAcesso {
	
	private String login;
	private String senha;
	
	public Aluno() {
	}
	
	public Aluno(String login,String senha) {
		this.login = login;
		this.senha = senha;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("123") && senha.equals("123");
	}

}
