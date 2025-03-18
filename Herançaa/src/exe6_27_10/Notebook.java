package exe6_27_10;

public class Notebook extends Computador {

	private double peso;

	public Notebook(String modelo, double ram, double armazenamento, double peso) {
		super(modelo, ram, armazenamento);
		setPeso(peso);
	}
	@Override
	public boolean rodarApp(String aux) {
		if (aux.contains(".exe")) {
			return true;
		} else {
			return false;
		}
		
	}
	public void aumentarRam(double addram) {
		setRam(getRam()+ addram);
	}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
}
