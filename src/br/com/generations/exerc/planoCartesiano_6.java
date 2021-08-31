package br.com.generations.exerc;

import java.util.Scanner;

public class planoCartesiano_6 {

	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		double x1,x2,y1,y2,d;
		
		System.out.print("Digite valor de X1: ");
		x1 = leia.nextDouble();
		
		System.out.print("Digite valor de X2: ");
		x2 = leia.nextDouble();
		
		System.out.print("Digite valor de Y1: ");
		y1 = leia.nextDouble();
		
		System.out.print("Digite valor de Y2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println("D: " + d);
		
		leia.close();
	}
	
}
