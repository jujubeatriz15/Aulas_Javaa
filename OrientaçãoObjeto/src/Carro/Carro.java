package Carro;

public class Carro {
	public String cor;
	public double preco;
	public String modelo;

	public Carro() {

	}

	public Carro(String modelo, double preco) {
		this.cor = "preto";
		this.modelo = modelo;
		this.preco = preco;
	}
	public Carro(String cor, String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
}}
