package exercicio;

public class cilindro extends circulo{
 
private double altura;

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}
	public cilindro(String cor, double raio, double altura) {
		super(cor, raio);
		setAltura(altura);
	}
//area * altura
 public double CalcVol() {
	return CalcArea()* altura;
}

@Override
public String toString() {
	return "cilindro [altura=" + altura + ", cor=" + getCor() + ", raio=" + getRaio() +"]";
}
 
}
