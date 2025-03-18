package exe1_24_10;

public class Aves extends animais{
	private String cordpenas;
	private String alimentaçao;
	
	public String getCordpenas() {
		return cordpenas;
	}
	public void setCordpenas(String cordpenas) {
		this.cordpenas = cordpenas;
	}
	public String getAlimentaçao() {
		return alimentaçao;
	}
	public void setAlimentaçao(String alimentaçao) {
		this.alimentaçao = alimentaçao;
	}
	public Aves(String raça, String nomeident, String porte, String habitat, String paisorig, String cordpenas, String alimentaçao) {
		super(raça, nomeident, porte, habitat, paisorig);
		setCordpenas(cordpenas);
		setAlimentaçao(alimentaçao);
	}
}
