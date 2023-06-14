package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.AbaixoDaMedia;

public class Program7_AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos ter� o vetor? ");
		int n = sc.nextInt();
		
		AbaixoDaMedia[] vect = new AbaixoDaMedia[n];
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
			double num = sc.nextDouble();
			vect[i] = new AbaixoDaMedia(num);
			soma += vect[i].getNum(); 
		}
		
		double media = soma/vect.length;
		
		System.out.println();
		System.out.printf("M�DIA DO VETOR: %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA M�DIA: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNum()<media) {
				System.out.println(vect[i].getNum());
			}
		}
		
		sc.close();

	}

}


















/*Fazer um programa para ler um n�mero inteiro N e depois um vetor de N n�meros reais. Em seguida,
* mostrar na tela a m�dia aritm�tica de todos elementos com tr�s casas decimais. Depois mostrar todos
* os elementos do vetor que estejam abaixo da m�dia, com uma casa decimal cada. 
*/