package exercicios;

public class ex02_dias_cada_mes {

	public static void main(String[] args) {
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
				"Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

		byte dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		for(int c = 0; c<mes.length; c++) {
			System.out.printf("%s tem %d dias\n", mes[c], dias[c]);
			
			
			
		}
		
		
		
		
		
		
	}

}
