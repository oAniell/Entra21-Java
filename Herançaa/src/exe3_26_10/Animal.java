package exe3_26_10;

public abstract class Animal {
	private String especie;
	private boolean estimaçao;
	private double peso;
	
	public abstract String Som(); 

	public Animal(String especie, boolean estimaçao, double peso) {
		setEspecie(especie);
		setEstimaçao(estimaçao);
		setPeso(peso);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isEstimaçao() {
		return estimaçao;
	}

	public void setEstimaçao(boolean estimaçao) {
		this.estimaçao = estimaçao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "[especie=" + especie + ", estimaçao=" + estimaçao + ", peso=" + peso + "]";
	}

}
