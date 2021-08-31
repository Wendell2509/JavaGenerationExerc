package br.com.generations.exerc;

import java.util.Scanner;

public class mediaPonderada_5 {
	
	public static void main(String[] args) {
		
		int nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite nota 1: ");
		nota1 = leia.nextInt();
		
		System.out.print("Digite nota 2: ");
		nota2 = leia.nextInt();
		
		System.out.print("Digite nota 3: ");
		nota3 = leia.nextInt();
		
		media = ((nota1 * 2)+(nota2*3)+(nota3*5))/10;
		System.out.print("Media: " + media);
				
		leia.close();
	}

}
