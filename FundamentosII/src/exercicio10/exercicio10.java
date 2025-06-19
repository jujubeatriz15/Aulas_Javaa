package exercicio10;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	int A[] = new int[4];
	int B[] = new int[4];
	int C[] = new int[4];
	int D[] = new int[4];
	
	for(int i=0; i<A.length; i++){
		 System.out.printf("Digite o %d do Array A: ", i+1);
		 B[i] = input.nextInt();
		 System.out.printf("Digite o %d do Array B: ", i+1);
		 C[i] = input.nextInt();
		 System.out.printf("Digite o %d do Array C: ", i+1);
		 D[i] = input.nextInt();
		 System.out.printf("Digite o %d do Array D: ", i+1);
		 
	}
System.out.println(Arrays.toString(A));
System.out.println(Arrays.toString(B));
System.out.println(Arrays.toString(C));
System.out.println(Arrays.toString(D));
}}
