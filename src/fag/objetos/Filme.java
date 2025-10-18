package fag.objetos;

public class Filme {
	private String titulo;
	private double avaliacao;
	
	public Filme() {}
	public Filme(String titulo, double avaliacao) {
		setTitulo(titulo);
		setAvaliacao(avaliacao);
	}
	
	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAvaliacao(double avaliacao) {
		if(avaliacao >= 0 && avaliacao <= 5) {
			this.avaliacao = avaliacao;
		}
	}
	
	public double getAvaliacao() {
		return avaliacao;
	}
	
	public String exibir() {
		return "Filme: "+titulo+" | Avaliação: "+avaliacao+".";
	}
}
