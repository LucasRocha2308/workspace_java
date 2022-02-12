package core;

public class LocalTime {
	private int hora;
	private int minuto;
	private int segundo;
	
	public LocalTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public LocalTime(int hora, int minuto) {
		this(hora, minuto, 0);
	}
	
	public LocalTime(int hora) {
		this(hora, 0, 0);
	}
	
	public LocalTime() {
		this(0, 0, 0);
	}

	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void setTime(int hora, int minuto) {
		this.hora = hora;  
		this.minuto = minuto;
		this.segundo = 0;
	}
	
	public void setTime(int hora) {
		this.setTime(hora, 0, 0);
	}
	
	public String exibirHoraUniversal() {
		return formataNumero(this.hora) + ":" + formataNumero(this.minuto) + ":" + formataNumero(this.segundo);
	}
	
	public String exibirHoraPadrao() {
		String horaPadrao;
		String sufixo;
		if (hora == 0) {
			horaPadrao = "12:";
			sufixo = "AM";
		}
		else if (hora == 12) {
			horaPadrao = "12:";
			sufixo = "PM";
		}
		else if (hora > 0 && hora < 12) {
			horaPadrao = formataNumero(hora) + ":";
			sufixo = "AM";
		}
		else {
			horaPadrao = formataNumero(hora - 12) + ":";
			sufixo = "PM";
		}
		horaPadrao = horaPadrao + formataNumero(this.minuto)+":"+formataNumero(this.segundo) + sufixo;
		return horaPadrao;
	}
	
	private String formataNumero(int numero) {
		return (numero < 10)?"0"+numero : String.valueOf(numero);
	}
	
}
