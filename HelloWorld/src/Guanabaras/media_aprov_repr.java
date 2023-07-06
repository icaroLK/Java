package Guanabaras;

import java.util.Scanner;

public class media_aprov_repr {

	public static void main(String[] args) {
		Scanner reed = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String nome = reed.nextLine();
		
		System.out.print("Nota 1: ");
		float n1 = reed.nextFloat();
		
		System.out.print("Nota 2: ");
		float n2 = reed.nextFloat();
		
		float m = (n1 + n2) / 2;
		
		String c = (m>7)?"Aprovado":"Reprovado";
		
		System.out.print("\n--------------------------");
		System.out.printf("\n Aluno:\t\t%s", nome);
		System.out.printf("\n Situação:\t%s", c);
		System.out.printf("\n Média final:\t%.1f", m);
		System.out.print("\n--------------------------");
		
		
	}

}
