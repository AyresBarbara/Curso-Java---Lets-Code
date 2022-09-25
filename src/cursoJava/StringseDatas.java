package cursoJava;

public class StringseDatas {

	public static void main(String[] args) {
		// Olá, {nome}. Hoje é {dia da semana}
		
		String nome = "Barbara";
		System.out.println(nome.toUpperCase()); //Bota em maiusculo
		System.out.println(nome.toLowerCase());// Bota em minusculo
		System.out.println(nome.length());// conta quantas letras tem
		
		String nomeOutro = "barbara";
		System.out.println(nome.equalsIgnoreCase(nomeOutro));// Equals= compara; EqualsIgnoreCasa= ignora o sensitive case

	}

}
