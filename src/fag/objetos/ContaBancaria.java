package fag.objetos;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		setTitular(titular);
		setSaldo(saldo);
	}
	
	public void setTitular(String titular) {
		if(titular != null && !titular.isBlank()) {
			this.titular = titular;
		}
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setSaldo(double saldo) {
		if(saldo > 0) {
			this.saldo = saldo;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
	}
	
	public void sacar(double valor) {
		if(saldo - valor > 0 && valor > 0) {
			saldo -= valor;
		}
	}
}
