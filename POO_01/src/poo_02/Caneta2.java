package poo_02;
public class Caneta2 {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.printf("Modelo: %s", modelo);
		System.out.printf("\nCor: %s", cor);
		System.out.printf("\nPonta: %.1f", ponta);
		System.out.printf("\nCarga: %d", carga);
		System.out.printf("\nTampado?: %b\n", tampada);
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
