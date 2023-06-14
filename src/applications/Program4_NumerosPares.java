package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.NumerosPares;

public class Program4_NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números deseja digitar? ");
		int n = sc.nextInt();
		
		NumerosPares[] vect = new NumerosPares[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			int num = sc.nextInt();
			vect[i] = new NumerosPares(num);
		}
		
		
		int qp = 0; 
		System.out.println("NÚMEROS PARES:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNum()%2==0) {
				System.out.print(vect[i].getNum()+" ");
				qp += 1;
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES: " + qp);
		sc.close();
		

	}

}
