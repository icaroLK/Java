package exercicios;

import java.util.Scanner;

public class ex01_calculadora {

	public static void main(String[] args) {
		Scanner reed = new Scanner(System.in);
		
		byte term = 0;
		
		System.out.println("--------------------------–");
		System.out.println("\tCALCULADORA");
		System.out.println("--------------------------–");
		
		while(term == 0) {
		
		
		
		System.out.print("Insira um número: ");
		float n1 = reed.nextFloat();
		
		System.out.print("Insira mais um número: ");
		float n2 = reed.nextFloat();
		
		System.out.println("--------------------");
		System.out.println(" 1 - Soma");
		System.out.println(" 2 - Subtração");
		System.out.println(" 3 - Multiplicação");
		System.out.println(" 4 - Divisão");
		System.out.println(" 5 - Potência");
		System.out.println(" 6 - Sair");
		System.out.println("--------------------");
		
		float res = 0;
		byte op = 0;
		byte foi = 0;
		
		while(foi == 0) {
		
		
		System.out.print("R: ");
		op = reed.nextByte();
		
		switch(op) {
			case 1:
				res = n1 + n2;
				foi = 1;
				break;
			case 2:
				res = n1 - n2;
				foi = 1;
				break;
			case 3:
				res = n1 * n2;
				foi = 1;
				break;
			case 4:
				res = n1 / n2;
				foi = 1;
				break;
			case 5:
				res = (float) Math.pow(n1, n2);
				foi = 1;
				break;
			case 6:
				System.out.println("\nSaindo...");
				foi = 1;
				term = 1;
				break;
			default:
				System.out.println("Valor inválido");
				break;
	
		} // fecha switch
		} // fecha while do switch
		if(term == 1) {break;}
		
		System.out.printf("Resultado: %.2f\n\n", res);
		
		
		} // fecha while principal
		
		System.out.println("Obrigado");

		
		reed.close();
	}

}
