package fag.objetos;

public class Musica {
	private String titulo;
	private int duracaoSegundos;
	
	public Musica(String titulo, int duracaoSegundos) {
		setTitulo(titulo);
		setDuracaoSegundos(duracaoSegundos);
	}
	
	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setDuracaoSegundos(int duracaoSegundos) {
		if(duracaoSegundos > 0) {
			this.duracaoSegundos = duracaoSegundos;
		}
	}
	
	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}
	
	public String formatarDuracao(int duracaoSegundos) {
		return String.format("%02d", duracaoSegundos / 60) + ":" + String.format("%02d", duracaoSegundos % 60);
	}
}
