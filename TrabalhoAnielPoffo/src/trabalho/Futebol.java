package trabalho;

import java.time.LocalDate;
import java.util.ArrayList;

public class Futebol extends Clube {
	
	private int numeroCamisa;
	private int golsMarcados;
	private String posiçao;
	private String categoria;
	private int partidasJogadas;
	
	public Futebol(LocalDate dataFimContrato, ArrayList<String> hablilidades, String patrocinio, double salario,
			int titulos, Pessoa dadosPessoais, int numeroCamisa,
			int golsMarcados, String posiçao, String categoria, int partidasJogadas) {
		super(dataFimContrato, hablilidades, patrocinio, salario, titulos, dadosPessoais);
		setNumeroCamisa(numeroCamisa);
		setGolsMarcados(golsMarcados);
		setPosiçao(posiçao);
		setCategoria(categoria);
		setPartidasJogadas(partidasJogadas);
	}
	
	public int getNumeroCamisa() {
		return numeroCamisa;
	}
	public void setNumeroCamisa(int numeroCamisa) {
		if (numeroCamisa >0) {
			this.numeroCamisa = numeroCamisa;
		} else {
			throw new IllegalArgumentException("Numero da camisa invalido");
		}
	}
	public int getGolsMarcados() {
		return golsMarcados;
	}
	public void setGolsMarcados(int golsMarcados) {
		if (golsMarcados >=0) {
			this.golsMarcados = golsMarcados;
		} else {
			throw new IllegalArgumentException("Numero de gols invalido");
		}
	}
	public String getPosiçao() {
		return posiçao;
	}
	public void setPosiçao(String posiçao) {
		if (!posiçao.isBlank() && posiçao != null) {
			this.posiçao = posiçao;
		} else {
			throw new IllegalArgumentException("Posição invalida");
		}
	
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		if (!categoria.isBlank() && categoria != null && (categoria.equalsIgnoreCase("Base") || categoria.equalsIgnoreCase("Profissional"))) {
				this.categoria = categoria;
		} else {
			throw new IllegalArgumentException("Categoria invalida");
		}
	}
	public int getPartidasJogadas() {
		return partidasJogadas;
	}
	public void setPartidasJogadas(int partidasJogadas) {
		if (partidasJogadas >=0) {
			this.partidasJogadas = partidasJogadas;
		} else {
			throw new IllegalArgumentException("Numero de partidas invalido");
		}
		
	}
	@Override
	public String ProrrogarContratoUmAno() {
		if (partidasJogadas > 15) {
			setDataFimContrato(getDataFimContrato().plusYears(1));
			return "Contrato prorrogado ate "+ getDataFimContrato();
		} else {
			return  "Condiçoes impedem o contrato de ser prorrogado!";
		}
		
	}
	public void PromoverDaBase() {
		setCategoria("Profisional");
	}
	public void RetornarAtleta() {
		setCategoria("Base");
	}
	public void addGols(int aux) {
		setGolsMarcados(getGolsMarcados() + aux);
	}
	public void addPartidas(int aux) {
		setPartidasJogadas(getPartidasJogadas() + aux);
	}

	@Override
	public String toString() {
		return super.toString() + " com o numero da camisa " + numeroCamisa + ", tendo um total de "+ golsMarcados +" gols marcados, atuando na posiçao de " + posiçao
				+ ", na categoria " + categoria + ", em " + partidasJogadas + " partidas disputadas.";
	}
	
}
