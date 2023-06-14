package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class Program3_Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas ser�o digitadas? ");
		int n = sc.nextInt();
		
		Alturas[] vect = new Alturas[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Dados da %d� pessoa: \n", i+1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Alturas(nome, idade, altura);
			System.out.println();
		}

		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getAltura();
		}
		
		double mediaAl = soma/vect.length;
		System.out.printf("A m�dia de altura das pessoas digitadas � %.2f.\n", mediaAl);
		
		double pM16 = 0.0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getIdade()<16) {
				pM16 += 1.0;
			}
		}
		
		pM16 = (100/vect.length) * pM16;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%.\n", pM16); // "%%" ap�s o indicador da vari�vel dentro de um printf faz imprimir o s�mbolo de procentagem colado no n�mero.
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getIdade()<16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();

	}

}


/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura m�dia das pessoas, e mostrar tamb�m a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver. 
*/
