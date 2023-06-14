package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.MaisVelho;

public class Program9_MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		
		MaisVelho[] vect = new MaisVelho[n];
		//String[] nome = new String[n];
		//int[] idade = new int[n];
		
		int maiorIdade = 0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o nome da %d° pessoa: ", i+1);
			String nome = sc.next();
			System.out.printf("Digite a idade de %s: ", nome);
			int idade = sc.nextInt();
			vect[i] = new MaisVelho(nome, idade); 
		}
		
		maiorIdade = vect[0].getIdade();
		int posicaoMaior = 0;  // Variável que receberá a posição da pessoa mais velha.
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getIdade()>maiorIdade) {
				maiorIdade = vect[i].getIdade();
				posicaoMaior = i;  // A variável posicaoMaior irá receber o valor de i quando o vetor idade[i] for maior que variável maiorIdade.
			}
		}
		
		System.out.println("MAIS VELHO: " + vect[posicaoMaior].getNome()); // Aqui será exibido o vetor nome no valor de posicaoMaior.
		
		
		
		sc.close();
	}

}
