package encapsulamento;

public class testepessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("jurisclieson");
		System.out.println(p1.getNome());
		
		Pessoa idade = new Pessoa();
		idade.setIdade(1000);
		System.out.println(idade.getIdade());

	}

}
