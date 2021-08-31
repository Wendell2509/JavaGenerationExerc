package br.com.generations.exerc;

import java.util.Scanner;

public class porcentagem_8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double custoNovo,custoFabrica,percDistr=0.28,impostos = 0.45;
		System.out.println("Digite o custo de fábrica: ");
		custoFabrica = leia.nextDouble();
		
		custoNovo = custoFabrica + (custoFabrica * percDistr) + (custoFabrica * impostos);
		System.out.println(custoNovo);
		
		leia.close();
	}

}
