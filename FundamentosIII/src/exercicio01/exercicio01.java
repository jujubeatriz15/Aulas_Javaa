package exercicio01;

public class exercicio01 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s2.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul"); 
		System.out.printf(b1, b2, b3, b4);

	}

}
