package Aula02;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
	
		Scanner perg = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Digite o primeiro número");
		n1 = perg.nextInt();
		System.out.println("Digite o segundo número");
		n2 = perg.nextInt();
		System.out.println("Digite o terceiro número");
		n3 = perg.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.printf("O maior numero é %d",n1);
		}
		else if(n2>n3 && n2>n3) {
			System.out.printf("O maior numero é %d",n2);
		}
		else {
			System.out.printf("O maior numero é %d",n3);
		}
	}

}

