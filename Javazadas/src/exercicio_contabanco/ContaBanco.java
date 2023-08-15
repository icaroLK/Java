package exercicio_contabanco;

public class ContaBanco {

	public int numConta;
	protected char tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	
	public char getTipo() {
		return this.tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	

	public String getDono() {
		return this.dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	

	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	public void abrirConta(char letra) {
		if(letra=='C') {
			this.tipo = 'C';
			this.saldo = 50;
		}
		if(letra=='P') {
			this.tipo = 'P';
			this.saldo = 150;
		}
		this.setStatus(true);
	}
	
	
	public void fecharConta() {
		if(this.saldo > 0) {
			System.out.print("\nSua conta ainda tem dinheiro\nNão é possível fechar sua conta");
		}else if(this.saldo < 0) {
			System.out.print("\nSua conta está em débito\nNão é possível fechar a conta");
		}else {
			this.status = false;
			System.out.println("Conta fechada");
		}
	}
	
	
	public void depositar(float valor) {
		if(this.status == true) {
		//	this.saldo += valor; outro jeito em baixo
			setSaldo(getSaldo() + valor);
			
		}else {
			System.out.println("Voce ainda não abriu uma conta");
		}
		
	}
	
	
	public void sacar(float valor) {
		if(this.status && valor <= this.saldo) {
			setSaldo(getSaldo() - valor);
	//		this.saldo -= valor;
	//		System.out.println("Sacando");
		}else {
			System.out.println("Sua conta não está ativa ou o valor a ser sacado é maior que o valor disponível na conta");
		}
	}
	
	
	public void pagarMensal() {
		float parcela = 0;
		
		if(this.status == true) {
			if(this.getTipo() == 'C') {
				parcela = 12;
			} else if(this.getTipo() == 'P') {
				parcela = 20;
			}
			
			if(this.getSaldo() > parcela) {
				this.saldo -= parcela;
			}else {
				System.out.println("Saldo insuficiente pra pagar a parcela mensal");
			}
			
			
		}else {
			System.out.println("Conta não aberta");
		}
	}
	
	
	public void status() {
		System.out.print("\n------------------------");
		System.out.printf("\n  \t  %s", this.getDono());
		System.out.printf("\n  Tipo:\t\t%c", this.getTipo());
		System.out.printf("\n  Num:\t\t%d", this.getNumConta());
		System.out.printf("\n  Saldo:\t%.2f", this.getSaldo());
		System.out.printf("\n  Status:\t%b", this.getStatus());
		System.out.print("\n------------------------\n");
		
		
	}
	
	
	
	
	
	
	}
