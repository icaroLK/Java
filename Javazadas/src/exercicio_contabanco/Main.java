package exercicio_contabanco;

public class Main {

	public static void main(String[] args) {
		
		ContaBanco conta1 = new ContaBanco();
		
		conta1.setDono("Ícaro");
		conta1.setNumConta(928475);
		
		
		conta1.abrirConta('C');
		
		conta1.depositar(200);
		

		
		conta1.sacar(50);
		
		conta1.status();
	}

}
