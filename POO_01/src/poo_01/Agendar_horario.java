package poo_01;

import java.util.Scanner;

public class Agendar_horario {
	byte dia;
	byte mes;
	String hora;
	String local;
	boolean acompanhado;
	String nome;
	
	void marcar() {
		System.out.print("Insira seu nome: ");
		
		
	}
	
	
	void consultar() {
		System.out.printf("-----------------------");
		System.out.printf("\n \t%s", nome);
		System.out.printf("\n Data:\t\t%d\\%d", dia, mes);
		System.out.printf("\n Horário:\t%s", hora);
		System.out.printf("\n Acompanhado?\t%b", acompanhado);
		System.out.printf("\n-----------------------");
	
	}
	
}
