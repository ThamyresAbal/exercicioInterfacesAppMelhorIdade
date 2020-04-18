package negocio;

import java.util.Calendar;
import java.util.List;

import auxiliar.Calendario;
//import auxiliar.Calendario;
import interfaces.IExibido;

public class Instituicao implements IExibido{
	private String razaoSocial;	
	private String cnpj;
	private String nomeFantasia;
	private Calendar diaAbertura;
	private Calendar diaEncerramento;
	private Calendar horarioAbertura;
	private Calendar horarioEncerramento;
	private List<Atividade> atividades;
	private List<Idoso> idosos;
	private Contato contato;
	private Endereco endereco;
	
	public Instituicao(String razaoSocial, String cnpj, String nomeFantasia, Calendar diaAbertura,
			Calendar diaEncerramento, Calendar horarioAbertura, Calendar horarioEncerramento,
			List<Atividade> atividades, List<Idoso> idosos, Contato contato, Endereco endereco) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.diaAbertura = diaAbertura;
		this.diaEncerramento = diaEncerramento;
		this.horarioAbertura = horarioAbertura;
		this.horarioEncerramento = horarioEncerramento;
		this.atividades = atividades;
		this.idosos = idosos;
		this.contato = contato;
		this.endereco = endereco;
	}

	public void exibir() {
		System.out.printf("Nome da instituição: %s\n"
				+ "CNPJ: %s\n"
				+ "Razão social: %s\n"
				+ "Horario de Funcionamento: %s a %s de %s as %s\n",
				nomeFantasia,
				cnpj,
				razaoSocial,
				Calendario.obterDiaFormatado(diaAbertura.getTime()),
				Calendario.obterDiaFormatado(diaEncerramento.getTime()),
				Calendario.obterHoraFormatada(horarioAbertura.getTime()),
				Calendario.obterHoraFormatada(horarioEncerramento.getTime())
				);
		contato.exibir();
		endereco.exibir();
		System.out.println("Lista de Atividades");
		listarAtividades();
		System.out.println("Usuários da instituição");
		listarIdosos();
		
	}
	
	private void listarAtividades() {
		for (Atividade atividade: atividades) {
			atividade.exibir();
		}
	}
	
	private void listarIdosos() {
		for(Idoso idoso: idosos) {
			idoso.exibir();
		}
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Calendar getDiaAbertura() {
		return diaAbertura;
	}

	public void setDiaAbertura(Calendar diaAbertura) {
		this.diaAbertura = diaAbertura;
	}

	public Calendar getDiaEncerramento() {
		return diaEncerramento;
	}

	public void setDiaEncerramento(Calendar diaEncerramento) {
		this.diaEncerramento = diaEncerramento;
	}

	public Calendar getHorarioAbertura() {
		return horarioAbertura;
	}

	public void setHorarioAbertura(Calendar horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}

	public Calendar getHorarioEncerramento() {
		return horarioEncerramento;
	}

	public void setHorarioEncerramento(Calendar horarioEncerramento) {
		this.horarioEncerramento = horarioEncerramento;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public List<Idoso> getIdosos() {
		return idosos;
	}

	public void setIdosos(List<Idoso> idosos) {
		this.idosos = idosos;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
