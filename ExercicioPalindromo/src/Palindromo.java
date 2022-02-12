import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String palavra;
		String palindromo = "";

		System.out.println("Digite uma palavra: ");
		palavra = teclado.nextLine();

		for (int i = palavra.length() - 1; i >= 0; i--) {

			palindromo += palavra.charAt(i);

		}

		if (palindromo.equals(palavra)) {
			System.out.println("Eh um palindromo");
		} else {
			System.out.println("Nao eh um palindromo");
		}
		teclado.close();
	}
}
