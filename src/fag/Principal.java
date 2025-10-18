package fag;

import fag.objetos.ContaBancaria;
import fag.objetos.Filme;
import fag.objetos.Funcionario;
import fag.objetos.Retangulo;
import fag.objetos.Musica;
import fag.objetos.Pessoa;
import fag.objetos.ContaLuz;
import fag.objetos.BicicletaAlugada;
import fag.objetos.ProdutoEstoque;
import fag.objetos.Temperatura;

public class Principal {
	public static void main(String[] args) {
		atividadeUm();
		atividadeDois();
		atividadetres();
		atividadeQuatro();
		atividadeCinco();
		atividadeSeis();
		atividadeSete();
		atividadeOito();
		atividadeNove();
		atividadeDez();
		
	}
	
	public static void atividadeUm() {
		ContaBancaria contaBancaria = new ContaBancaria("Felipp", 0);
		contaBancaria.depositar(120.32);
		contaBancaria.depositar(456.12);
		contaBancaria.sacar(140.60);
		
		System.out.println("=== ATIVIDADE 1 ===");
		System.out.printf("Titular: %s -> Saldo final: %.2f\n", contaBancaria.getTitular(), contaBancaria.getSaldo());
	}
	
	public static void atividadeDois() {
		Filme filmeUm = new Filme("A era do gelo", 2);
		Filme filmeDois = new Filme("Karavan com motor K24 de Honda Civic", 5);
		
		System.out.println("\n=== ATIVIDADE 2 ===");
		System.out.println(filmeUm.exibir());
		System.out.println(filmeDois.exibir());
	}
	
	public static void atividadetres() {
		Funcionario funcionario = new Funcionario("Felipp", 21.2);
		
		System.out.println("\n=== ATIVIDADE 3 ===");
		System.out.printf("Funcionário: %s -> Salário antigo: %.2f.\n", funcionario.getNome(), funcionario.getSalario());
		funcionario.aumentarSalario(12);
		System.out.printf("Funcionário: %s -> Salário novo: %.2f.\n", funcionario.getNome(), funcionario.getSalario());
	}
	
	public static void atividadeQuatro() {
		System.out.println("\n=== ATIVIDADE 4 ===");
		Retangulo retangulo = new Retangulo(25.70, 28.90);
		System.out.println(retangulo.area());
		System.out.println(retangulo.perimetro());
	}
	
	public static void atividadeCinco() {
		Musica musicaUm = new Musica("i don't wanna go war", 150);
		Musica musicaDois = new Musica("Sleep deprivation", 176);
		
		if(musicaUm.getDuracaoSegundos() > 0 && musicaUm.getTitulo() != null && !musicaUm.getTitulo().isBlank()) {
			System.out.println("\n=== ATIVIDADE 5 ===");
			System.out.printf("Título: %s -> Duração: %s", musicaUm.getTitulo(), musicaUm.formatarDuracao(musicaUm.getDuracaoSegundos()) + "\n\n");
		} else {
			System.out.println("Informe corretamente o nome e a duração da música");
		}
		
		if(musicaDois.getDuracaoSegundos() > 0 && musicaDois.getTitulo() != null && !musicaDois.getTitulo().isBlank()) {
			System.out.printf("Título: %s -> Duração: %s", musicaDois.getTitulo(), musicaDois.formatarDuracao(musicaDois.getDuracaoSegundos()) + "\n\n");
		} else {
			System.out.println("Informe corretamente o nome e a duração da música");
		}
	}
	
	public static void atividadeSeis() {
		Pessoa pessoa = new Pessoa("Felipp", 75.40, 1.79);
		
		System.out.println("\n=== ATIVIDADE 6 ===");
		System.out.printf("Pessoa: %s -> IMC: %.2f -> Classficação do IMC: %s\n", pessoa.getNome(), pessoa.calcularIMC(), pessoa.classificacaoIMC());
	}
	
	public static void atividadeSete() {
		ContaLuz contaLuz = new ContaLuz(120.32, 0.630);
		
		System.out.println("\n=== ATIVIDADE 7 ===");
		System.out.printf("Consumo do Kwh: %.2f -> Valor do Kwh: %.2f -> Valor total da fatura: %.2f\n", contaLuz.getConsumoKwh(), contaLuz.getValorKwh(), contaLuz.calcularValorTotal());
	}
	
	public static void atividadeOito() {
		BicicletaAlugada bicicletaAlugada = new BicicletaAlugada(4, 12.50);
		
		System.out.println("\n=== ATIVIDADE 8 ===");
		System.out.printf("Total de horas: %d -> Valor da hora: %.2f -> Valor final: %.2f\n", bicicletaAlugada.getHoras(), bicicletaAlugada.getValorHora(), bicicletaAlugada.calcularValor());
	}
	
	public static void atividadeNove() {
		ProdutoEstoque produtoEstoque = new ProdutoEstoque("RTX 4090", 6);
		produtoEstoque.adicionarEstoque(6);
		produtoEstoque.adicionarEstoque(-43);
		produtoEstoque.removerEstoque(3);
		
		System.out.println("\n=== ATIVIDADE 9 ===");
		System.out.printf("Produto: %s -> Quantidade final: %d\n", produtoEstoque.getNome(), produtoEstoque.getQuantidade());
	}
	
	public static void atividadeDez() {
		Temperatura temperatura = new Temperatura(30);
		
		System.out.println("\n=== ATIVIDADE 10 ===");
		System.out.printf("Temperatura em celsius: %.2f -> Temperatura em Fahrenheit: %.2f -> Temperatura em Kelvin: %.2f", temperatura.getCelsius(), temperatura.paraFahrenheit(), temperatura.paraKelvin());
	}
}