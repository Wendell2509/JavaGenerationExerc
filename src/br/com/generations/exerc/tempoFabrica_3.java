package br.com.generations.exerc;

import java.util.Scanner;

public class tempoFabrica_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int horas,minutos,segundos,segundosTotal;
		
		System.out.println("Digite o tempo de duração do evento: ");
		segundosTotal = leia.nextInt();
		System.out.println("Segundos Total: " + segundosTotal);
		
		horas = segundosTotal/3600;
		System.out.println("Horas: " + horas);
		
		minutos = (segundosTotal/3600)/60;
		System.out.println("Minutos: " + minutos);
		
		segundos = (segundosTotal/3600)%60;
		System.out.println("Segundos: " + segundos);		
				
		leia.close();
	}
	
}
