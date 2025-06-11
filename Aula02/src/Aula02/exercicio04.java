package Aula02;
import java.util.Scanner;
public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner perg = new Scanner(System.in);
		char letras;
		System.out.print("Digite uma letra: ");
		letras = perg.next().charAt(0);
		System.out.println(letras == 'f' ? "Feminino" : "Masculino");
	}

}
