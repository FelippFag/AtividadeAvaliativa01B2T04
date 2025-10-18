package fag.objetos;

public class Retangulo {
	private double largura, altura;
	private int numero = 2;
	
	public Retangulo(double largura, double altura) {
		setLargura(largura);
		setAltura(altura);
	}
	
	public void setLargura(double largura) {
		if(largura > 0) {
			this.largura = largura;
		}
	}
	
	
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}
	
	public String area() {
		if(altura > 0 && largura > 0) {
			return "Área: " + String.format("%.2f", largura * altura) + ".";
		} else {
			return "Os valores precisam ser maiores que 0.";
		}
	}
	
	public String perimetro() {
		if(altura > 0 && largura > 0) {
			return "Perímetro: " + String.format("%.2f", numero * (largura + altura)) + ".";
		} else {
			return "Os valores precisam ser maiores que 0.";
		}
	}
}
