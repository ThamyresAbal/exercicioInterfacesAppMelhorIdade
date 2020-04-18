package negocio;

import java.util.Calendar;
import java.util.List;

import auxiliar.Calendario;
import interfaces.IExibido;

public class Atividade implements IExibido{
	private String nome;
	private Calendar hora;
	private Calendar data;
	private String duracao;
	private int vagas;
	private String descricao;
	private List<Voluntario> voluntarios;
	
	public Atividade(String nome, Calendar hora, Calendar data, String duracao, int vagas, String descricao,
			List<Voluntario> voluntarios) {
		this.nome = nome;
		this.hora = hora;
		this.data = data;
		this.duracao = duracao;
		this.vagas = vagas;
		this.descricao = descricao;
		this.voluntarios = voluntarios;
	}

	public void exibir() {
		System.out.printf("Nome da atividade: %s\n"
				+ "Horário da atividade: %s\n"
				+ "Data da atividade: %s\n"
				+ "Duração da atividade: %s\n"
				+ "Quantidade de vagas: %d\n"
				+ "Descrição: %s\n",
				nome,
				Calendario.obterHoraFormatada(hora.getTime()),
				Calendario.obterDataFormatada(data.getTime()),
				duracao,
				vagas,
				descricao
				);
		System.out.println("Lista de voluntarios da atividade");
		listarVoluntarios();
	}
	
	private void listarVoluntarios() {
		for (Voluntario voluntario: voluntarios) {
			voluntario.exibir();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getHora() {
		return hora;
	}

	public void setHora(Calendar hora) {
		this.hora = hora;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Voluntario> getVoluntarios() {
		return voluntarios;
	}

	public void setVoluntarios(List<Voluntario> voluntarios) {
		this.voluntarios = voluntarios;
	}


}
