package fag.objetos;

public class Pessoa {
	private String nome;
	private double peso, altura;
	
	public Pessoa(String nome, double peso, double altura) {
		setNome(nome);
		setPeso(peso);
		setAltura(altura);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC() {
		return peso / (altura * altura);
	}
	
	public String classificacaoIMC() {
		if(calcularIMC() < 18.5) {
			return "Abaixo do peso";
		} else if(calcularIMC() >= 18.5 && calcularIMC() < 25) {
			return "Peso normal";
		} else if(calcularIMC() >= 25 && calcularIMC() < 30) {
			return "Sobrepeso";
		} else if(calcularIMC() >= 35 && calcularIMC() < 40) {
			return "Obesidade Grau II";
		} else {
			return "Obesidade Grau III";
		} 
	}
}
