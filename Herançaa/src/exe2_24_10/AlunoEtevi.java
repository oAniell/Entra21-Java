package exe2_24_10;

public class AlunoEtevi extends Aluno {
	private int ano;

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano <= 3) {
			this.ano = ano;
		} else {
			throw new IllegalArgumentException("Ano invalido!");
		}
	}

	public AlunoEtevi(String nome, int idade, int ano) {
		super(nome, idade);
		setAno(ano);
	}
}
