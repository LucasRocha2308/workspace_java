
public class ContaBancaria {

	String nomeTitular;
	String cpf;
	int numeroConta;
	int tipo;
	double saldo;

	public String exibirDadosDaConta() {
		String mensagem = "Conta Bancaria: "+numeroConta + 
				   ((tipo==0)?" - Conta Corrente":
					          ((tipo==1)?" - Poupança":" - Investimentos"));
		mensagem = mensagem + "\nTitular: "+nomeTitular+" ("+cpf+")\n";
		mensagem = mensagem + String.format("R$ %.2f\n",saldo);
		return mensagem;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
