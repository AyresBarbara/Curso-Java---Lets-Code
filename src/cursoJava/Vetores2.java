package cursoJava;

public class Vetores2 {

	public static void main(String[] args) {
		int[] numeros = {9, 3, 5, 2, 10};
		int maior =  numeros[0];
		int menor = numeros[0];
		int media = 0;
		
		for(int i=0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			media += numeros[i]; // Só somou
		}
		System.out.println("Maior: "+ maior);
		System.out.println("Menor: "+ menor);
		System.out.println("Media: "+ media/numeros.length);

	}

}
