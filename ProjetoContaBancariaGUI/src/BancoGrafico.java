import javax.swing.JOptionPane;

public class BancoGrafico {
	public static void main(String[] args) {

		int opcao;
		double valor;
		String texto;

		ContaBancaria conta;
		conta = new ContaBancaria();

		conta.setNomeTitular("Lucas Rocha");

		conta.setCpf("111.111.111-11");
		conta.setTipo(2);
		conta.setNumeroConta(123456);
		conta.setSaldo(1000.00);

		do {
			texto = JOptionPane.showInputDialog("bank do Povo - 1-Deposito/2-Saque/3-Info/0-Encerra");
			opcao = Integer.parseInt(texto);
			switch (opcao) {
			case 1:
				texto = JOptionPane.showInputDialog("Digite o valor do deposito");
				valor = Double.parseDouble(texto);
				conta.depositar(valor);
				break;
			case 2:
				texto = JOptionPane.showInputDialog("Digite o valor do saque");
				valor = Double.parseDouble(texto);
				if (conta.sacar(valor)) {
					JOptionPane.showMessageDialog(null, "Saque Efetuado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, conta.exibirDadosDaConta());
				break;
			case 0:
				JOptionPane.showMessageDialog(null,"obrigado pela preferencia");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opcao invalida");
				break;
			}
		} while (opcao != 0);

	}
}
