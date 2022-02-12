import java.util.Scanner;

public class Uri1159 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X, cont = 1, somaValores = 0, salvaValores = 0;

		while(true) {
			X = teclado.nextInt();
			salvaValores = X;
			if (X % 2 == 0) {
				somaValores += X;
			} else {
				salvaValores = X + 1;
				somaValores += salvaValores;
			}

			while (cont < 5) {
				salvaValores += 2;
				somaValores += salvaValores;
				cont++;
			}
			if(X == 0) {
				break;
			}
			System.out.println(somaValores);
			cont = 1;
			somaValores = 0;
		}
		teclado.close();
	}
}
