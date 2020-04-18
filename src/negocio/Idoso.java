package negocio;

public class Idoso extends Usuario {
	private boolean necessidadesEspeciais;
	
	public Idoso(String nome, int idade, boolean genero, int estadoCivil, Contato contato, Endereco endereco) {
		super(nome, idade, genero, estadoCivil, contato, endereco);
		// TODO Auto-generated constructor stub
	}

	public void exibir() {
		super.exibir();
		System.out.printf("Necessidades Especiais? %s",
				necessidadesEspeciais ? "sim\n" : "não\n");			
	}

	public boolean isNecessidadesEspeciais() {
		return necessidadesEspeciais;
	}

	public void setNecessidadesEspeciais(boolean necessidadesEspeciais) {
		this.necessidadesEspeciais = necessidadesEspeciais;
	}

	

}
