package teste;

import negocio.Contato;
import negocio.Endereco;
import negocio.Idoso;


public class TestaIdoso {
	public static void main(String[] args) {
		
		Contato contatoIdoso = new Contato("123456789", "idoso@gmail.com", "9912345678");
		
		Endereco enderecoIdoso = new Endereco("Rua do centro", 250, "Centro", 
				"Rio de Janeiro", "RJ");

		Idoso idoso = new Idoso("leandro",60,true, 60, contatoIdoso, enderecoIdoso);
	}
}
