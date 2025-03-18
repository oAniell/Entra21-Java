package exe3_26_10;

public class Gatoo extends Animal {
	private boolean castrado;

	public Gatoo(String especie, boolean estimaçao, double peso, boolean castrado) {
		super(especie, estimaçao, peso);
		setCastrado(castrado);
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	@Override
	public String toString() {
		return "Gatoo "+ super.toString()+" [castrado=" + castrado + "]";
	}

	@Override
	public String Som() {
		
		return "miaaaaaaaaaaaaaaaau";
	}

}
