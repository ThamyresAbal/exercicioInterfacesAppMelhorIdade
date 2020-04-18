package teste;

import negocio.Contato;
import negocio.Endereco;
import negocio.Voluntario;

public class TestaVoluntario {
	public static void main(String[] args) {
		
		Contato contatoVoluntario = new Contato("987654321", "tamyidosa@gmail.com",
				"9987654321");

		Endereco enderecoVoluntario = new Endereco("Rua do lado", 300, "Barra", "Rio de Janeiro", "RJ");
		
		Voluntario voluntario = new Voluntario("tamy", 42, false, 3, contatoVoluntario, 
				enderecoVoluntario);
	}
}
