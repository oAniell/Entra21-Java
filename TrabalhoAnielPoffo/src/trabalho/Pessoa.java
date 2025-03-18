package trabalho;

public class Pessoa {
	private String nome;
	private int idade;
	private String cidade;
	private double altura;
	private double peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (!nome.isBlank() && nome != null) {
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if (!cidade.isBlank() && cidade != null) {
			this.cidade = cidade;
	} else {
		throw new IllegalArgumentException("Cidade invalida");
	}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		} else {
			throw new IllegalArgumentException("Altura invalida");
		}
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		} else {
			throw new IllegalArgumentException("Peso invalido");
		}
	}
	
	public Pessoa(String nome, int idade, String cidade, double altura, double peso) {
		setNome(nome);
		setIdade(idade);
		setCidade(cidade);
		setAltura(altura);
		setPeso(peso);
	}
	@Override
	public String toString() {
		return "O atleta de nome " + nome + ", de " + idade + " anos, da cidade " + cidade + ", com " + altura + " metros de altura e com o peso de "
				+ peso;
	}
	
}
