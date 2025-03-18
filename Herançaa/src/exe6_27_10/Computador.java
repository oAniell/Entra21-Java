package exe6_27_10;

public abstract class Computador {
	private String modelo;
	private double ram;
	private double armazenamento;
	
	
	public Computador(String modelo, double ram, double armazenamento) {
		
		setModelo(modelo);
		setRam(ram);
		setArmazenamento(armazenamento);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(double armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	public String ligDesl(boolean aux) {
		if (!aux) {
			return "Desligando";
		} else {
			return "Ligando";
		}
	}
	public abstract boolean rodarApp(String aux);
}
