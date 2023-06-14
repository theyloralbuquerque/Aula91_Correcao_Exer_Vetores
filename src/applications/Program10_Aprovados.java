package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Aprovados;

public class Program10_Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		//String[] name = new String[n];
		//double[] n1 = new double[n];
		//double[] n2 = new double[n];
		//double[] media = new double[n];
		
		Aprovados[] vect = new Aprovados[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o nome do %d° aluno: ", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Digite a 1° nota de %s: ", name);
			double n1 = sc.nextDouble();
			System.out.printf("Digite a 2° nota de %s: ", name);
			double n2 = sc.nextDouble();
			System.out.println();
			vect[i] = new Aprovados(name, n1, n2);
		}
		
		System.out.println("APROVADOS:");
		for (int i=0; i<vect.length; i++) {
			if (((vect[i].getN1() + vect[i].getN2()) / 2) >=6.0) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}





/*
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
 * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
 * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
 * igual a 6.0 (seis). 
*/
