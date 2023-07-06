package poo_03;
public class Caneta3 {
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	
	public Caneta3() { //método construtor
		this.modelo = "Genérico";
		this.cor = "Preta";
		this.ponta = 0.5f;
		this.carga = 100;
		this.tampar();
	}
	
	
	
 	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String inputa) {
		this.modelo = inputa;
	}
	
	
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String inputa) {
		this.cor = inputa;
	}
	
	
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float inputa) {
		this.ponta = inputa;
	}
	
	
	
	public int getCarga() {
		return this.carga;
	}
	public void setCarga(int inputa) {
		this.carga = inputa;
	}
	
	
	
	public boolean getTampada() {
		return this.tampada;
	}
	public void setTampada(boolean inputa) {
		this.tampada = inputa;
	}
	

	
	public void status() {
		System.out.printf("Modelo: %s", this.getModelo());
		System.out.printf("\nCor: %s", this.getCor());
		System.out.printf("\nPonta: %.1f", this.getPonta());
		System.out.printf("\nCarga: %d", this.getCarga());
		System.out.printf("\nTampado? %b\n", this.getTampada());
	}
	
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Não consigo rabiscar com a tampa fechada");
		} else {
			System.out.println("RABISCOS BISCOS BISCOS BISCOS");
		}
		
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}

}
