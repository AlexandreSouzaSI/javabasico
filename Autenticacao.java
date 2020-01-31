package autenticar;

import interfaces.PermitirAcesso;

public class Autenticacao {

private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
		
	}
	
	public Autenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

	public Autenticacao(String login, String senha) {
		
	}
}

