package exemplo;
//classe pai 
public class veiculo {
	
	//private o filho precisa de get e set
	private	String modelo;
	//protected o filho ainda consegue usar sem encapsular
	private double peso;
	private	double comprimento;
	private	double vmax;
	private	int passageiros;
	
	public veiculo(String modelo, double peso, double comprimento, double vmax, int passageiros) {
		super();
		this.modelo = modelo;
		this.peso = peso;
		this.comprimento = comprimento;
		this.vmax = vmax;
		this.passageiros = passageiros;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso () {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getVmax() {
		return vmax;
	}

	public void setVmax(double vmax) {
		this.vmax = vmax;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	/*Crie um String metodo que recebe com 
	parametro um quantidade de passageiros 
	e verifica se é mais ou menos que o limite,
	retorno se é mais ou menos que o limite*/
	
	public String verifLim (int qntpass) {
		if (qntpass > passageiros) {
			return "Não esta dentro do permitido";
		}else {
				return "Esta dentro do permitido";
			}	
		}
	
			
}
