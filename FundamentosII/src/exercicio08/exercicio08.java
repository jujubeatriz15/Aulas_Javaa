package exercicio08;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		int qtd = 0;
		double soma = 0, media = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos da sala: ");
		qtd = input.nextInt();
		for(int i = 1; i< qtd; i++) { 
			soma += input.nextDouble();
			System.out.println(i%2!=0 ? i:" ");
		}
	media = soma/qtd;
		System.out.printf("A média da turma foi %.2f", media);
	if (media>=7){
		System.out.println(" Aprovado");
		
	}
	else if(media<=4) {
		System.out.println(" Reprovado");
	}
	else{System.out.println(" Recuperação");}
	}

	}

