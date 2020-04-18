package negocio;

import interfaces.IExibido;

public class Contato implements IExibido  {
	private String telefone;
	private String email;
	private String celular;
	
	public Contato(String telefone, String email, String celular) {
		this.telefone = telefone;
		this.email = email;
		this.celular = celular;
	}

	public void exibir() {
		System.out.printf("Telefone: %s\n"
				+ "E-mail: %s\n"
				+ "Celular: %s\n",
				telefone,
				email,
				celular);
		
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
}
