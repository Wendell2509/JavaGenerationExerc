package br.com.generations.exerc;

import java.util.Scanner;

public class idade_1 {
	
	public static void main(String args[]) { 
	
		int anos,meses,dias,diasTotais;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos anos voc� tem?");
		anos = leia.nextInt();
		
		System.out.println("Quantos meses de vida voc� tem?");
		meses = leia.nextInt();
		
		System.out.println("Quantos dias de vida voc� tem?");
		dias = leia.nextInt();
		
		diasTotais = (anos * 365) + (meses * 30) + dias;
		System.out.println("Quantidade de dias: " + diasTotais);
		
		leia.close();		
	}
	
	
}
