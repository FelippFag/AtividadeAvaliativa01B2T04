package fag.objetos;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}
	
	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSalario(double salario) {
		if(salario >= 0) {
			this.salario = salario;
		}
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario += (salario * percentual) / 100;
	}
}
