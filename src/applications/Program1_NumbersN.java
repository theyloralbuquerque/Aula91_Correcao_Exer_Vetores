
package applications;

import java.util.Scanner;

import entities.NumbersN;

public class Program1_NumbersN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos n�meros deseja digitar: ");
		int n = sc.nextInt();
		
		NumbersN[] vect = new NumbersN[n];
		
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
			int num = sc.nextInt();
			vect[i] = new NumbersN(num); // Aqui ocorre a instancia��o da classe, passando como par�metro "num".
		}
		
		System.out.println("N�MEROS NEGATIVOS: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumbers()<0) {
				System.out.println(vect[i].getNumbers());
			}
		}

		sc.close();
	}

}




/*
 * Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois N n�meros inteiros
 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os n�meros negativos lidos. 
*/
