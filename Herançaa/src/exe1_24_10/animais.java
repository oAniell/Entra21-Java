package exe1_24_10;

public class animais {
	private String raça;
	private String nomeident;
	private String porte;
	private String habitat;
	private String paisorig;
	
	public animais(String raça, String nomeident, String porte, String habitat, String paisorig) {
	
		setRaça(raça);
	setNomeident(nomeident);
		setPorte(porte);
		setHabitat(habitat);
		setPaisorig(paisorig);
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public String getNomeident() {
		return nomeident;
	}
	public void setNomeident(String nomeident) {
		this.nomeident = nomeident;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getPaisorig() {
		return paisorig;
	}
	public void setPaisorig(String paisorig) {
		this.paisorig = paisorig;
	}
	
}
