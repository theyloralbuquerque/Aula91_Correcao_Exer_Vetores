package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.MediaPares;

public class Program8_MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do vetor? ");
		int n = sc.nextInt();
		
		MediaPares[] vect = new MediaPares[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
			int num = sc.nextInt();
			vect[i] = new MediaPares(num);
		}
	
		int somaPares = 0, numPares = 0;
		
		for (int i=0; i<vect.length; i++) {
			if(vect[i].getNum()%2==0) {
				somaPares += vect[i].getNum();
				numPares += 1;
			}	
		}

		double mediaPares = 0.0;
		
		if (numPares == 0) {
			System.out.println("NENHUM N�MERO PAR");
		} else {
			mediaPares = (double)somaPares/numPares;
			System.out.printf("M�DIA DOS PARES: %.1f", mediaPares);
		}
			
		sc.close();
		
	}

}











/*
 * Fazer um programa para ler um vetor de N n�meros inteiros. Em seguida, mostrar na tela a m�dia
 * aritm�tica somente dos n�meros pares lidos, com uma casa decimal. Se nenhum n�mero par for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
 */




