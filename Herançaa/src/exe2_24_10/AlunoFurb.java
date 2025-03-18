package exe2_24_10;

public class AlunoFurb extends Aluno {

	private char formaIngresso;
	private String curso;
	private String atletica;

	public char getFormaIngresso() {
		return formaIngresso;
	}

	public void setFormaIngresso(char formaIngresso) {
		if (formaIngresso == 'V' ||formaIngresso == 'E' ||formaIngresso == 'S' ||formaIngresso == 'T' ||formaIngresso == 'I' ) {
			this.formaIngresso = formaIngresso;
		} else {
			throw new IllegalArgumentException("Forma de ingresso invalida!");
		}
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		if (curso != null && !curso.isBlank()) {
			this.curso = curso;
		} else {
			throw new IllegalArgumentException("curso invalido");
		}
	}

	public String getAtletica() {
		return atletica;
	}

	public void setAtletica(String atletica) {
		if (atletica != null && !atletica.isBlank()) {
			this.atletica = atletica;
		} else {
			throw new IllegalArgumentException("atletica invalida");
		}
	}

	public AlunoFurb(String nome, int idade, char formaIngresso, String curso, String atletica) {
		super(nome, idade);
		setFormaIngresso(formaIngresso);
		setCurso(curso);
		setAtletica(atletica);
	}
	public void trancarCurso() {
		curso = null;
	}

}
