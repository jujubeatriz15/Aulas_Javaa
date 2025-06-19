package exercicio02;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		int x = 1;
		double soma =0, media =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos da sala: ");
		int alunos = input.nextInt();
		while(x<= alunos){
			System.out.println("digite a nota do aluno: ");
			soma += input.nextDouble();
			x++;
		}
	media = soma/alunos;
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
