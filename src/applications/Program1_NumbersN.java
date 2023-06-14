
package applications;

import java.util.Scanner;

import entities.NumbersN;

public class Program1_NumbersN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos números deseja digitar: ");
		int n = sc.nextInt();
		
		NumbersN[] vect = new NumbersN[n];
		
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			int num = sc.nextInt();
			vect[i] = new NumbersN(num); // Aqui ocorre a instanciação da classe, passando como parâmetro "num".
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumbers()<0) {
				System.out.println(vect[i].getNumbers());
			}
		}

		sc.close();
	}

}




/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
*/
