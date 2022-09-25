package cursoJava;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] letras = new String [5];
		// [0] [1] [2] [3] [4]
//		letras [0] = "A";
//		letras [1] = "B";
//		letras [2] = "F";
//		letras [3] = "E";
//		letras [4] = "W";
		
//		for (int = i=0; i < letras.length; i++) {}
		
		
		//SE EU JÀ SEI QUEM È O ARRAY
		String[] letras = {"A", "B", "C", "D", "E"};
		for (int i=0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		System.out.println(Arrays.toString(letras));

	}

}
