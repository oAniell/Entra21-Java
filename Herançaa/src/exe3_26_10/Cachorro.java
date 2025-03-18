package exe3_26_10;

public class Cachorro extends Animal {
	private String raça;

	public Cachorro(String especie, boolean estimaçao, double peso, String raça) {
		super(especie, estimaçao, peso);
		setRaça(raça);
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	@Override
	public String toString() {
		return "Cachorro "+ super.toString() + " ,raça=" + raça + "]";
	}

	@Override
	public String Som() {
		return "auau";
	}

}
