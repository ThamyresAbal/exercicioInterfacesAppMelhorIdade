package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import negocio.Atividade;
import negocio.Contato;
import negocio.Endereco;
import negocio.Idoso;
import negocio.Instituicao;
import negocio.Voluntario;

public class TestaInstituicao {
	public static void main(String[] args) {
		Contato contatoIdoso = new Contato("123456789", "idoso@gmail.com", "9912345678");
	
		Endereco enderecoIdoso = new Endereco("Rua do centro", 250, "Centro", 
				"Rio de Janeiro", "RJ");

		Idoso idoso = new Idoso("leandro",60,true, 60, contatoIdoso, enderecoIdoso);
		List<Idoso> listarIdosos = new ArrayList<>();
		listarIdosos.add(idoso);
		
		Contato contatoVoluntario = new Contato("987654321", "tamyidosa@gmail.com",
				"9987654321");

		Endereco enderecoVoluntario = new Endereco("Rua do lado", 300, "Barra", "Rio de Janeiro", "RJ");
		
		Voluntario voluntario = new Voluntario("tamy", 42, false, 3, contatoVoluntario, 
				enderecoVoluntario);
		List<Voluntario> voluntarios = new ArrayList<>();
		voluntarios.add(voluntario);
		
        Calendar horaAtividade = Calendar.getInstance();
		DateFormat horaFormat = new SimpleDateFormat("HH:mm");
        try {
            Date data = (Date)horaFormat.parse("10:00");            
            horaAtividade.setTime(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}   
        
		Calendar dataAtividade = Calendar.getInstance();
		DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = (Date)dataFormat.parse("22/10/2018");            
            dataAtividade.setTime(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}    
        	
		Atividade atividade = new Atividade("Aulas de informatica para idosos", horaAtividade, dataAtividade,
				"2 horas", 20, "Era uma casa muito engraçada", voluntarios);
		List<Atividade> listaAtividades = new ArrayList<>();
		listaAtividades.add(atividade);
		
		Endereco enderecoInstituicao = new Endereco("Ruz jjz numero 500", 120, "icarai", "Niterói", "RJ");

		Contato contatoInstituicao = new Contato("123456789", "insti@insti.com", 
				"987654321");

		Calendar dataAbertura = Calendar.getInstance();	
		DateFormat formatDataAbertura = new SimpleDateFormat("EEEE");
        try {
            Date data = (Date)formatDataAbertura.parse("Segunda-Feira");            
            dataAbertura.setTime(data);         
		} catch (ParseException e) {
			e.printStackTrace();
		}   
        
        Calendar dataEncerramento = Calendar.getInstance();	
		DateFormat formatDataEncerramento = new SimpleDateFormat("EEEE");
        try {
            Date data = (Date)formatDataEncerramento.parse("Sexta-Feira");            
            dataEncerramento.setTime(data);         
		} catch (ParseException e) {
			e.printStackTrace();
		}    
        
		Calendar horaAbertura = Calendar.getInstance();
    	DateFormat formatHoraAbertura = new SimpleDateFormat("HH:mm");
        try {
            Date data = (Date)formatHoraAbertura.parse("06:00");            
            horaAbertura.setTime(data);         
		} catch (ParseException e) {
			e.printStackTrace();
		}        
             
		Calendar horaEncerramento = Calendar.getInstance();
    	DateFormat formatHoraEncerramento = new SimpleDateFormat("HH:mm");
        try {
            Date data = (Date)formatHoraEncerramento.parse("18:00");            
            horaEncerramento.setTime(data);         
		} catch (ParseException e) {
			e.printStackTrace();
		}   
 	
		Instituicao instituicao = new Instituicao("Ajudar Idoso", "1235161686-23",
				"Retiro de Idosos CuidaBem",dataAbertura, dataEncerramento,horaAbertura,
				horaEncerramento, listaAtividades, listarIdosos, contatoInstituicao, enderecoInstituicao);

		instituicao.setRazaoSocial("Ajudar Idoso");
		instituicao.setDiaAbertura(dataAbertura);
		instituicao.setDiaEncerramento(dataEncerramento);
		instituicao.setHorarioAbertura(horaAbertura);
		instituicao.setHorarioEncerramento(horaEncerramento);
		instituicao.setEndereco(enderecoInstituicao);
		instituicao.setContato(contatoInstituicao);
		instituicao.setAtividades(listaAtividades);
		instituicao.setIdosos(listarIdosos);
		instituicao.exibir();
	}
}
