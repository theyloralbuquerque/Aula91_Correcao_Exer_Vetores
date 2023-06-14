package applications;

import java.util.Locale;
import java.util.Scanner;


public class Program6_SomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] soma = new int[n];
		
		System.out.println();
		System.out.println("Digite os valores do vetor A:");
		for (int i=0; i<vectA.length; i++) {
			System.out.printf("%d° valor: ", i+1);
			vectA[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Digite os valores do vetor B:");
		for (int i=0; i<vectB.length; i++) {
			System.out.printf("%d° valor: ", i+1);
			vectB[i] = sc.nextInt();
		}
		

		System.out.println("VALOR RESULTANTE:");
		for (int i=0; i<vectA.length; i++) {
			soma[i] = vectA[i] + vectB[i];
			System.out.println(soma[i]);
		}
		
		sc.close();
	}

}


/*
* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
* terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
* o vetor C gerado. 
*/