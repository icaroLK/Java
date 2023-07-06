package poo_02;
public class poo_02 {
	public static void main(String[] args) {
		Caneta2 c1 = new Caneta2();
		c1.modelo = "BIC";
		c1.cor = "Azul";
	//	c1.ponta = 0.5f;
		c1.carga = 90;
	//	c1.tampada = false;
		
		
		c1.tampar();
		
		c1.status();
		
		
		c1.rabiscar();
		

		
	}
}
