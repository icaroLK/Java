package exercicio_cadastro;

public class Pessoa {
	private String nome;
	private int idade;
	private float peso;
	private int cpf;
	private String prof;
	private String pais;
	
	
	public Pessoa(String nome, int idade, float peso, int cpf, String prof, String pais) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.cpf = cpf;
		this.prof = prof;
		this.pais = pais;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getProf() {
		return prof;
	}


	public void setProf(String prof) {
		this.prof = prof;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	public void status() {
		System.out.print("\n---------------------------");
		System.out.printf("\n   \t  %s", this.getNome());
		System.out.printf("\n  Idade:\t%d", this.getIdade());
		System.out.printf("\n  Peso:\t\t%.1f Kg", this.getPeso());
		System.out.printf("\n  CPF:\t\t%d", this.getCpf());
		System.out.printf("\n  Profissão:\t%s", this.getProf());
		System.out.printf("\n  Origem:\t%s", this.getPais());
		System.out.print("\n---------------------------\n");
	}
	
	
	
	
	
	
	
	

}
