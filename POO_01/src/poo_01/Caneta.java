package poo_01;
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.printf("Modelo: %s", modelo);
		System.out.printf("\nCor: %s", cor);
		System.out.printf("\nPonta: %.1f", ponta);
		System.out.printf("\nCarga: %d", carga);
		System.out.printf("\nTampado?: %b", tampada);
	}
	
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Não consigo rabiscar com a tampa fechada");
		} else {
			System.out.println("RABISCOS BISCOS BISCOS BISCOS");
		}
		
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}

}
