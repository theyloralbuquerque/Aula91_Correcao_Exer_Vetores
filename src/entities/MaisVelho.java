package entities;

public class MaisVelho {
	
	private String nome;
	private int idade;
	
	public MaisVelho (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

}
