import java.util.Scanner;

public class Palindromo2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.nextLine();
		
		boolean ehPalindromo = true;
		
		char letras[] = palavra.toCharArray();
		
		for (int pos = 0; pos < letras.length/2; pos++) {
			if(letras[pos] != letras[letras.length - 1 - pos]) {
				ehPalindromo = false;
				break;
			}
		}

		if (ehPalindromo) {
			System.out.println("Eh um palindromo");
		} else {
			System.out.println("Nao eh um palindromo");
		}
		teclado.close();
	}
}
