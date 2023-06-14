package entities;

public class DadosPessoais {
	
	private double altura;
	private char gen;

	
	public DadosPessoais(double altura, char gen) {
		this.altura = altura;
		this.gen = gen;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public char getGen() {
		return gen;
	}

}
