
public class Biblioteca {
	public static void main(String[] args) {
		
		Livro l1, l2, l3, l4;
		
		l1 = new Livro("Java for Beginners", "Professor Isidro", "Terror", 2021, 1, 2);
		l2 = new Livro("Java Web", "Professor Isidro", "Suspense", 2021,1,3);
		l3 = new Livro("Desenvolvimento de Software","Professor Isidro", "Auto Ajuda", 2021, 2, 1);
		l4 = new Livro("Sistemas Operacionais", "Professor Isidro", "Ficção", 2021, 2, 2);
		
		System.out.println(l1.exibirInfo());
		System.out.println(l2.exibirInfo());
		System.out.println(l3.exibirInfo());
		System.out.println(l4.exibirInfo());
		
	}
}
