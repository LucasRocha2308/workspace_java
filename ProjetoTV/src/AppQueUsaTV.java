
public class AppQueUsaTV {
	public static void main(String[] args) {
		
		Televisao t1, t2;
		
		t1 = new Televisao();
		t2 = new Televisao();
		
		t1.marca	= "Telefunken";
		t1.tamanho	= 20;
		t1.ligado	= false;
		t1.canal	= 5;
		t1.volume 	= 0;
		
		t2.marca	= "Filipis";
		t2.tamanho	= 55;
		t2.ligado	= true;
		t2.canal	= 10;
		t2.volume 	= 3;
		
		t1.ligar();
		t1.aumentarVolume();
		t1.aumentarVolume();
		t1.sintonizarCanal(7);
		t1.exibirTV();
		
		System.out.println("A TV foi desligada no canal "+t1.obterCanalSintonizado());
		
	}
}
