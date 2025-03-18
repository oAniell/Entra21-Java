package exe3_26_10;

public class Hamister extends Animal {
	private boolean manchas;

	public Hamister(String especie, boolean estimaçao, double peso, boolean manchas) {
		super(especie, estimaçao, peso);
		setManchas(manchas);
	}

	public boolean isManchas() {
		return manchas;
	}

	public void setManchas(boolean manchas) {
		this.manchas = manchas;
	}

	@Override
	public String toString() {
		return "Hamister "+ super.toString()+ " [manchas=" + manchas + "]";
	}

	@Override
	public String Som() {
		// TODO Auto-generated method stub
		return "misca musca mickey mouse";
	}

}
