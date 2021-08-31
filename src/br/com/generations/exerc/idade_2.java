package br.com.generations.exerc;

import java.util.Scanner;

public class idade_2 {

	public static void main(String[] args) {
		
		int idadeDias,anos,meses,dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias:");
		idadeDias = leia.nextInt();
		
		anos = idadeDias/365;
		System.out.println("Anos:"+ anos);
		
		meses = (idadeDias%365)/30;
		System.out.println("Meses:"+ meses);
		
		dias = (idadeDias%365)%30;
		System.out.println("Dias:"+ dias);	
		
		
		leia.close();
	}

}
