import java.util.Scanner;

public class Uri1174 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A[] = new double[100];

		for (int cont = 0; cont < 100; cont++) {
			A[cont] = teclado.nextDouble();
		}

		for (int i = 0; i < 100; i++) {
			if (A[i] <= 10.0) {
				System.out.println("A[" + i + "] = " + A[i]);
			}
		}
		teclado.close();
	}
}
