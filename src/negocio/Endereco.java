package negocio;

import interfaces.IExibido;

public class Endereco implements IExibido{
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(String rua, int numero, String bairro, String cidade, String uf) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public void exibir() {
		System.out.printf("Endereço: %s\n"
				+ "Número: %d\n"
				+ "Bairro: %s\n"
				+ "Cidade: %s\n"
				+ "UF: %s\n",
				rua,
				numero,
				bairro,
				cidade,
				uf
				);
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
