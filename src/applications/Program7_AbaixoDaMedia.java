package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.AbaixoDaMedia;

public class Program7_AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos terá o vetor? ");
		int n = sc.nextInt();
		
		AbaixoDaMedia[] vect = new AbaixoDaMedia[n];
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			double num = sc.nextDouble();
			vect[i] = new AbaixoDaMedia(num);
			soma += vect[i].getNum(); 
		}
		
		double media = soma/vect.length;
		
		System.out.println();
		System.out.printf("MÉDIA DO VETOR: %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNum()<media) {
				System.out.println(vect[i].getNum());
			}
		}
		
		sc.close();

	}

}


















/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
* mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
* os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
*/