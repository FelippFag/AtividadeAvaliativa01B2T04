package fag.objetos;

public class ContaLuz {
	private double consumoKwh, valorKwh;
	
	public ContaLuz(double consumoKwh, double valorKwh) {
		setConsumoKwh(consumoKwh);
		setValorKwh(valorKwh);
	}
	
	public double getConsumoKwh() {
		return consumoKwh;
	}
	
	public void setConsumoKwh(double consumoKwh) {
		if(consumoKwh > 0) {
			this.consumoKwh = consumoKwh;
		}
	}
	
	public double getValorKwh() {
		return valorKwh;
	}
	
	public void setValorKwh(double valorKwh) {
		if(valorKwh > 0) {
			this.valorKwh = valorKwh;
		}
	}
	
	public double calcularValorTotal() {
		return consumoKwh * valorKwh;
	}
}

