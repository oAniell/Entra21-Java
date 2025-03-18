package exercicio;

public class circulo {
	private String cor;
	private double raio;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double CalcArea() {
		double pi= Math.PI;
		return pi * (raio * raio);
	}
	public circulo(String cor, double raio) {
		super();
		setCor(cor);
		setRaio(raio);
	}
	@Override
	public String toString() {
		return "circulo [cor=" + cor + ", raio=" + raio + "]";
	}
	
}
