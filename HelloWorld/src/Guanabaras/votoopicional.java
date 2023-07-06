package Guanabaras;

import java.util.Scanner;

public class votoopicional {

	public static void main(String[] args) {
		Scanner reed = new Scanner(System.in);
		
		System.out.print("Insira sua idade: ");
		byte idade = reed.nextByte();
		
		String sit = (idade>= 16 && idade <18) || (idade>60)?"Opcional":"Obrigatório";

		System.out.printf("Situação do voto: %s", sit);
		
		reed.close();
	}

}
