package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.MaiorPos;

public class Program5_MaiorPos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores deseja digitar? ");
		int n = sc.nextInt();
		
		MaiorPos[] vect = new MaiorPos[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o valor da %d� posi��o: ", i+1);
			double v = sc.nextDouble();
			vect[i] = new MaiorPos(v);
		}
		
		double maiorV = 0.0;
		int pos = 0;
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumber()>maiorV) {
				maiorV = vect[i].getNumber();
				pos = i;
			}
		}
		
		System.out.printf("MAIOR VALOR: %.2f.\n", maiorV);
		System.out.printf("POSI��O DO MAIOR VALOR: %d.", pos+1);
		
		sc.close();
	}

}

/*
 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em seguida, mostrar na tela
 * o maior n�mero do vetor (supor n�o haver empates). Mostrar tamb�m a posi��o do maior elemento,
 * considerando a primeira posi��o como 0 (zero). 
*/