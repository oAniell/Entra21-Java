package exe3_26_10;

public class Ave extends Animal {
	private String cor;

	public Ave(String especie, boolean estimaçao, double peso, String cor) {
		super(especie, estimaçao, peso);
		setCor(cor);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Ave " + super.toString()+ " [cor=" + cor + "]";
	}

	@Override
	public String Som() {
		// TODO Auto-generated method stub
		return "wiiiii";
	}

}
