package aula01;

import java.util.Scanner;

public class desafio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double valor = entrada.nextDouble();
		System.out.println(valor);
		
		System.out.println(valor == 0 ? "neutro" : valor > 0 ? "positivo" : "negativo");
		
		
		

		
		
	}

}
