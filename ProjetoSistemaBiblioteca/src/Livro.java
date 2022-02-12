
public class Livro {
	private String titulo;
	private String autor;
	private String categoria;
	private int anoDePublicacao;
	private int numeroDaEstante;
	private int numeroDaPrateleira;
	private boolean disponivel;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public int getNumeroDaEstante() {
		return numeroDaEstante;
	}

	public void setNumeroDaEstante(int numeroDaEstante) {
		this.numeroDaEstante = numeroDaEstante;
	}

	public int getNumeroDaPrateleira() {
		return numeroDaPrateleira;
	}

	public void setNumeroDaPrateleira(int numeroDaPrateleira) {
		this.numeroDaPrateleira = numeroDaPrateleira;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public String exibirInfo() {
		String mensagem;
		mensagem = "Livro: " + titulo + " / " + autor + " (" + anoDePublicacao + ")\n"+ "Categoria: " + categoria + 
				   "  Pos: " + numeroDaEstante + "-" + numeroDaPrateleira + "\n" +
				   ((disponivel) ? "DISPONIVEL" : "EMPRESTADO");
		return mensagem;
	}

	public Livro(String titulo, String autor, String categoria, int anoDePublicacao, int numeroDaEstante,
			int numeroDaPrateleira) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.anoDePublicacao = anoDePublicacao;
		this.numeroDaEstante = numeroDaEstante;
		this.numeroDaPrateleira = numeroDaPrateleira;
	}

	public void emprestar() {
		disponivel = false;
	}

	public void devolver() {
		disponivel = true;
	}

}
