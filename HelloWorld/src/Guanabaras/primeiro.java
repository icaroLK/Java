package Guanabaras;

import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		Scanner scaneia = new Scanner(System.in);
		System.out.print("Insert your name: ");
		String nome = scaneia.nextLine();
		
		System.out.print("Insert your score: ");
		byte nota = scaneia.nextByte();
		
		System.out.printf("Grades of %s:\nScore 1: %d", nome, nota);
		
	

	}

}
