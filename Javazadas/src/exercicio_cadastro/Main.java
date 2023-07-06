package exercicio_cadastro;


public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Ícaro", 22, 82, 671968, "Engenheiro", "Brasil");
		
		Pessoa p2 = new Pessoa("Ana", 22, 58, 000000, "Estudante", "Brasil");
		
		Pessoa p3 = new Pessoa("Lucas", 21, 67, 000000, "Caixa", "Brasil");
		
		Pessoa p4 = new Pessoa("Nicole", 24, 67, 000000, "Uber", "Espanha");
		
		Pessoa p5 = new Pessoa("Rodrigues", 22, 92, 000000, "Médico", "Dinamarca");
		
		p1.status();
		p2.status();
		p3.status();
		p4.status();
		p5.status();
		
		

	}

}
