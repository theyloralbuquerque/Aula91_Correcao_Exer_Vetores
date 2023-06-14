/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 

*/
package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.SomaVetor;

public class Program2_SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos números deseja digitar: ");
		int n = sc.nextInt();
		
		SomaVetor[] vect = new SomaVetor[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			double num = sc.nextDouble();
			vect[i] = new SomaVetor(num);
		}
		
		System.out.print("VALORES: ");
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i].getNum());
		}
		System.out.println();
		
		double soma = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getNum();
		}
		System.out.printf("SOMA: %.2f\n", soma);
		
		System.out.printf("MÉDIA: %.2f", soma/vect.length);
		
		sc.close();

	}

}
