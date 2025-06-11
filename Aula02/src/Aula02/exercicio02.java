package Aula02;
import java.util.Scanner;
public class exercicio02 {

	public static void main(String[] args) {
	
		Scanner num = new Scanner(System.in);
		int n1;
		System.out.println("Digite um número para saber a semana: ");
		n1 = num.nextInt();
		
		switch(n1) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			
		}
		
		
		

	}

}
