package Resolucao;

import java.util.Scanner;

public class SomarDoisNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		System.out.println("Soma = " + soma);
		
		sc.close();
		
	}
	
}


