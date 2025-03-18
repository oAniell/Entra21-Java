package prova;

import java.util.ArrayList;
import java.util.List;

public class Patio {

	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	private int ano;
	private double preço;
	private int loc;
	public static List<Patio> listacarros = new ArrayList<>();
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		} else {
			throw new IllegalArgumentException("Modelo invalido");
		}
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		} else {
			throw new IllegalArgumentException("Marca invalida");
		}
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if (placa != null && !placa.isBlank()) {
			this.placa = placa;
		} else {
			throw new IllegalArgumentException("Placa invalida");
		}
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		if (cor != null && !cor.isBlank()) {
			this.cor = cor;
		} else {
			throw new IllegalArgumentException("Cor invalida");
		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
			if (ano <= 2023 && ano > 0) {
				this.ano = ano;
			} else {
				throw new IllegalArgumentException("Ano invalido");
			}
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		if (preço > 0) {
			this.preço = preço;
		} else {
			throw new IllegalArgumentException("Preço invalido");
		}
	}
	public int getLoc() {
		return loc;
	}
	public void setLoc(int loc) {
		if (loc > 0) {
			this.loc = loc;
		} else {
			throw new IllegalArgumentException("Localização invalida");
		}
		
	}
	public Patio(String modelo, String marca, String placa, String cor, int ano, double preço, int loc) {
		setModelo(modelo);
		setMarca(marca);
		setPlaca(placa);
		setCor(cor);
		setAno(ano);
		setPreço(preço);
		setLoc(loc);
		listacarros.add(this);
	}/* Faça também um método para calcular a depreciação do preço de um carro usando o ano de 2023, carros produzidos
	 * antes de 2010 tem uma depreciação de 7% ao ano, carros feitos de 2010 em diante tem uma depreciação de 5% ao ano.*/
	public String depreciaçao() {
		double deprec = 0;
		double preco = getPreço();
		if (ano < 2010) {
			deprec = 0.07;
		}else {deprec = 0.05;}
		for (int i = ano; i < 2023; i++) {
			preco = preco - (preco * deprec);
		}return " O carro " + modelo + " com a depreciação des de "+ ano + " tera o preço de "+ preco + " em 2023";
	}
	
	
	
	
	@Override
	public String toString() {
		return "o carro de modelo " + getModelo() + " da marca " + getMarca() + ", placa " + getPlaca() +" de cor "+ getCor() + " com fabricação no ano de "+
	getAno() + ", com valor de R$" + getPreço() + ", localizado na vaga "+ getLoc();
	}
	
	
	
	
}
