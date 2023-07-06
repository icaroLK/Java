package poo_01;
public class poo_01 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();  //isso aqui é instanciar
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		
		
	//	c1.rabiscar();
	//	c1.status();
		
		Agendar_horario h1 = new Agendar_horario();
		h1.dia = 15;
		h1.mes = 10;
		h1.hora = "14:30";
		h1.local = "Iguaçu 6969";
		h1.acompanhado = false;
		h1.nome = "Ícaro";
		
		h1.consultar();
		
	}
}
