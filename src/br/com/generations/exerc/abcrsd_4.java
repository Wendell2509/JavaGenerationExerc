package br.com.generations.exerc;

import java.util.Scanner;

public class abcrsd_4 {

	public static void main(String[] args) {
		
		double a,b,c,r = 0.0,s=0.0,d=0.0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite A:");
		a = leia.nextDouble();
		
		System.out.print("Digite B:");
		b = leia.nextDouble();
		
		System.out.print("Digite C:");
		c = leia.nextDouble();
		
		r = Math.pow(a+b, 2);
		System.out.println("R: " + r);
		
		s = Math.pow(b+c, 2);
		System.out.println("S: " + s);
		
		d = (r + s)/2;
		System.out.println("D: " + d);

		
		leia.close();
	}

}
