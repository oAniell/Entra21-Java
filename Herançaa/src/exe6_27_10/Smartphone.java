package exe6_27_10;

public class Smartphone extends Computador {
	
	private int operadora;
	private boolean camerafront;
	
	public Smartphone(String modelo, double ram, double armazenamento, int operadora,boolean camerafront) {
		super(modelo, ram, armazenamento);
		setOperadora(operadora);
		setCamerafront(camerafront);
	}
	@Override
	public boolean rodarApp(String aux) {
		if (aux.endsWith(".apk")) {
			return true;
		} else {
			return false;
		}
	}
	public boolean tirarSelfie() {
		if (!camerafront) {
			return false;
		} else {
			return true;
		}
	}
	public boolean ligar(int aux) {
		String numero = ""+aux;
		String aux2 = ""+operadora;
		if (numero.startsWith(aux2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getOperadora() {
		return operadora;
	}
	public void setOperadora(int operadora) {
		this.operadora = operadora;
	}
	public boolean isCamerafront() {
		return camerafront;
	}
	public void setCamerafront(boolean camerafront) {
		this.camerafront = camerafront;
	}
	

}
