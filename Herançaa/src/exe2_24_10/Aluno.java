package exe2_24_10;

public class Aluno {
	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Nome invalido");
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		} else {
			throw new IllegalArgumentException("Idade invalida");
		}
	}
	
	

	
}
