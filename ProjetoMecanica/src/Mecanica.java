
public class Mecanica {
	private String nome;

	public Mecanica(String nome) {
		super();
		this.nome = nome;
	}
	
	public void arrumarCarro(Carro c) {
		System.out.println("------"+nome+"------");
		System.out.println("Arrumar o carro"+c.getMarca());
		System.out.println("Preço do serviço R$ 1000.00");
		c.setFuncionando(true);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
