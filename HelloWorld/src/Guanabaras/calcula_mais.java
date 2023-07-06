package Guanabaras;

import java.util.Scanner;

public class calcula_mais {

	public static void main(String[] args) {
		Scanner reed = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = reed.nextLine();
		System.out.printf("Muito prazer, %s", nome);
		
		System.out.println("\nNúmero 1: ");
		int n1 = reed.nextInt();
		
		System.out.println("\nNúmero 2: ");
		int n2 = reed.nextInt();
		
		int s = n1 + n2;
		
		System.out.printf("\n%d + %d = %d", n1, n2, s);
		
		
		reed.close();
		
		
	}

}
