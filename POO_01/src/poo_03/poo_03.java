package poo_03;
public class poo_03 {
	public static void main(String[] args) {
		
		
		Caneta3 c1 = new Caneta3();
		c1.setModelo("BIC");
		c1.setCor("Vermelho");
		c1.setPonta(0.5f);
		c1.setCarga(90);
		c1.setTampada(true);
		
		c1.status();
		
		System.out.println("\n");
		
		Caneta3 c2 = new Caneta3();
		
		c2.status();
		
		
		
		
	}

}
