package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPessoais;

public class Program11_DadosPessoais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		DadosPessoais[] vect = new DadosPessoais[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Altura da %d° pessoa: ", i+1);
			double altura = sc.nextDouble();
			System.out.printf("Gênero da %d° pessoa: ", i+1);
			char gen = sc.next().charAt(0);
			vect[i] = new DadosPessoais(altura, gen);
			System.out.println();
		}
		double menorAlt = vect[0].getAltura();
		double maiorAlt = vect[0].getAltura();
		double medAltF = 0.0;
		int numF = 0;
		int numM = 0;
		
		for (int i=0; i<vect.length; i++) {
			
			if(vect[i].getAltura()<menorAlt) {
				menorAlt = vect[i].getAltura();
			} if (vect[i].getAltura()>maiorAlt) {
				maiorAlt = vect[i].getAltura();
			}
			
			if (vect[i].getGen() == 'F') {
				medAltF += vect[i].getAltura();
				numF++;
			} if (vect[i].getGen() == 'M') {
				numM++;
			}
		}
		
		System.out.println();
		System.out.printf("MENOR ALTURA: %.2f \n", menorAlt);
		System.out.printf("MAIOR ALTURA: %.2f \n", maiorAlt);
		System.out.printf("MÉDIA DE ALTURA DAS MULHERES: %.2f \n", medAltF/numF);	
		System.out.printf("NÚMERO DE HOMENS: %d", numM);
		
		sc.close();
	}

}
