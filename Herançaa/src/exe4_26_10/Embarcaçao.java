package exe4_26_10;

public abstract class Embarcaçao {
	private String id;
	private String modelo;
	private int qntpessoas;
	private double capacidadecomb;
	private double queimadecomb;
	private int qntbotsalvavidas;
	
								//em metros
	public boolean planejarviagem(double aux) {
		double conta = queimadecomb * capacidadecomb ;
		if ( aux <= conta ) {
			return true;
		} else {
			return false;
		}
		
	}
	public abstract String verificaseg();


	public Embarcaçao(String id, String modelo, int qntpessoas, double capacidadecomb, double queimadecomb,
			int qntbotsalvavidas) {
		setId(id);
		setModelo(modelo);
		setQntpessoas(qntpessoas);
		setCapacidadecomb(capacidadecomb);
		setQueimadecomb(queimadecomb);
		setQntbotsalvavidas(qntbotsalvavidas);
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getQntpessoas() {
		return qntpessoas;
	}


	public void setQntpessoas(int qntpessoas) {
		this.qntpessoas = qntpessoas;
	}


	public double getCapacidadecomb() {
		return capacidadecomb;
	}


	public void setCapacidadecomb(double capacidadecomb) {
		this.capacidadecomb = capacidadecomb;
	}


	public double getQueimadecomb() {
		return queimadecomb;
	}


	public void setQueimadecomb(double queimadecomb) {
		this.queimadecomb = queimadecomb;
	}


	public int getQntbotsalvavidas() {
		return qntbotsalvavidas;
	}


	public void setQntbotsalvavidas(int qntbotsalvavidas) {
		this.qntbotsalvavidas = qntbotsalvavidas;
	}
	
}
