
public class Televisao {
	String marca;
	int tamanho;
	boolean ligado;
	int canal;
	int volume;

	void exibirTV() {
		System.out.println("        \\/         ");
		System.out.println("+===================+");
		System.out.println("| " + marca + "        |");
		System.out.println("| " + tamanho + "         pol    |");
		System.out.println("+===================+");
		System.out.println("     |        |");
	}

	void ligar() {
		ligado = true;
		System.out.println("A TV " + marca + " agora esta ligada");
	}

	void desligar() {
		ligado = false;
		System.out.println("A TV " + marca + " foi desligada");
	}

	void aumentarVolume() {
		if (!ligado) {
			System.out.println("Para aumentar o volume, ligue a TV");
		} else {
			volume++;
			System.out.println("Agora a TV " + marca + " esta com volume " + volume);
		}
	}

	void avancarCanal() {
		if (!ligado) {
			System.out.println("Para mudar de canal, ligue a TV");
		} else {
			canal++;
			System.out.println("Agora a TV " + marca + " esta no canal " + canal);
		}
	}
	
	void sintonizarCanal(int novoCanal) {
		if(!ligado) {
			System.out.println("Para sintonizar, ligue a TV");
		}
		else {
			if(novoCanal <= 0 || novoCanal > 999) {
				System.out.println("Erro - canal invalido");
			}
			else {
				canal = novoCanal;
				System.out.println("Agora a TV"+marca+" esta no canal "+ canal);
			}
		}
	}
	
	int obterCanalSintonizado() {
		return canal;
	}

}
