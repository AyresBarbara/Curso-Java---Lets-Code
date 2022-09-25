package cursoJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringseDatas2 {

	public static void main(String[] args) {
		// Olá, {nome}. Hoje é {dia da semana}
		String nome = "Bárbara";
		
		LocalDate hoje = LocalDate.now();
		Locale brasil =new Locale ("pt", "BR");
		//Locale brasil =new Locale ( language: "pt", country: "BR")
		// System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		String saudacao;
		LocalDateTime agora = LocalDateTime.now();
		
		if (agora.getHour() >= 8 && agora.getHour()<=12 ) {
			saudacao = "Bom dia";
		} else if (agora.getHour()>=12 && agora.getHour()<=18){
			saudacao = "Boa tarde";
		}else if (agora.getHour()>=18 && agora.getHour()<=24) {
			saudacao = "Boa Noite";
		}else {
			saudacao = "Olá";
		}
		System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome , diaSemana, saudacao.toUpperCase());
		
	}

}
