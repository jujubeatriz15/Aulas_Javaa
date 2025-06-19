package exercicio09;

public class exercicio09 {

	public static void main(String[] args) {
		int soma3 =0, soma5 =0, somatotal =0;
		for(int i = 1; i< 20; i++) {
		 	soma3 += i%3==0;
		 	soma5 += i%5==0;
		}
		somatotal= soma3 + soma5;
		System.out.println();

}}
