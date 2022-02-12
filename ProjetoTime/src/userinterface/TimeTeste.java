package userinterface;
import core.LocalTime;

public class TimeTeste {
	public static void main(String[] args) {
		LocalTime t = new LocalTime();
		t.setTime(20,5,8);
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHoraUniversal());
	}
}
