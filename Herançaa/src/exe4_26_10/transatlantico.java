package exe4_26_10;

public class transatlantico extends Embarcaçao {
	private int anobatismo;
	private int capaciBot;

	public transatlantico(String id, String modelo, int qntpessoas, double capacidadecomb, double queimadecomb,
			int qntbotsalvavidas, int anobatismo, int capaciBot) {
		super(id, modelo, qntpessoas, capacidadecomb, queimadecomb, qntbotsalvavidas);
		setAnobatismo(anobatismo);
		setCapaciBot(capaciBot);
	}

	@Override
	public String verificaseg() {
		int aux = capaciBot * getQntbotsalvavidas();
		if (aux > getQntpessoas()) {
			return "Botes OK";
		} else {
			return "ALERTA: embarcaçao precisa de mais botes!";
		}
		
	}

	public int getAnobatismo() {
		return anobatismo;
	}

	public void setAnobatismo(int anobatismo) {
		this.anobatismo = anobatismo;
	}

	public int getCapaciBot() {
		return capaciBot;
	}

	public void setCapaciBot(int capaciBot) {
		this.capaciBot = capaciBot;
	}

	public void addbotes(int add) {
		setQntbotsalvavidas(getQntbotsalvavidas()+ add);
	}
}
