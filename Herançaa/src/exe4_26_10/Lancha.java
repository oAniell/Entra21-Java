package exe4_26_10;

public class Lancha extends Embarcaçao {
	private double velmax;

	public Lancha(String id, String modelo, int qntpessoas, double capacidadecomb, double queimadecomb,
			int qntbotsalvavidas, double velmax) {
		super(id, modelo, qntpessoas, capacidadecomb, queimadecomb, qntbotsalvavidas);
		setVelmax(velmax);
	}

	@Override
	public String verificaseg() {
	if (getQntbotsalvavidas() > 0) {
		return "Botes OK";
	} else {
		return "ALERTA: embarcaçao precisa de mais botes!";
	}
	}

	public double getVelmax() {
		return velmax;
	}

	public void setVelmax(double velmax) {
		this.velmax = velmax;
	}
					
						//quantos km de viagem
	public double tempviagem(double aux) {
		double conta = aux / velmax;
		return conta;
	}
}
