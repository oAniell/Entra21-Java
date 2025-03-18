package exe1_24_10;

public class Gatos extends animais{
	
	private String pelagem;
	private String tipomanchas;
	
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getTipomanchas() {
		return tipomanchas;
	}
	public void setTipomanchas(String tipomanchas) {
		this.tipomanchas = tipomanchas;
	}
	
	public Gatos(String raça, String nomeident, String porte, String habitat, String paisorig, String pelagem, String tipomanchas) {
		super(raça, nomeident, porte, habitat, paisorig);
		setTipomanchas(tipomanchas);
		setPelagem(pelagem);
	}
}
