
public class Teste {
	public static void main(String[] args) {
		Mecanica mecanica = new Mecanica("Oficina geral");
		
		Carro c1, c2;
		
		c1 = new Carro("Vokis", "1978", true);
		c2 = new Carro("Fiote", "1980", false);
		
		System.out.println(c1.exibirInformacao());
		System.out.println(c2.exibirInformacao());
		
		mecanica.arrumarCarro(c2);
		
		System.out.println(c2.exibirInformacao());
	}
}
