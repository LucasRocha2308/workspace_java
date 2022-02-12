import java.util.Scanner;

public class Uri2483 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int I;
		String letraA = "a";
		I = teclado.nextInt();
		
		for(int cont = 1; cont < I; cont++) {
			letraA += "a";
		}
		
		System.out.println("Feliz nat"+letraA+ "l!");
		teclado.close();
	}
}
