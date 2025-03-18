package trabalho;

import java.time.LocalDate;
import java.util.ArrayList;

public class Basquete extends Clube {
	private int NumeroCamisa;
	private int PontosMarcados;
	private int PartidasJogadas;

	public Basquete(LocalDate dataFimContrato, ArrayList<String> hablilidades, String patrocinio, double salario,
			int titulos, Pessoa dadosPessoais, int NumeroCamisa, int PontosMarcados, int PartidasJogadas) {
		super(dataFimContrato, hablilidades, patrocinio, salario, titulos, dadosPessoais);
		setNumeroCamisa(NumeroCamisa);
		setPontosMarcados(PontosMarcados);
		setPartidasJogadas(PartidasJogadas);
		
	}
	
	public void addPontos(int aux) {
		setPontosMarcados(getPontosMarcados()+ aux);
	}
	public void addPartidas(int aux) {
		setPartidasJogadas(getPartidasJogadas() + aux );
	}

	public int getNumeroCamisa() {
		return NumeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		if (numeroCamisa > 0) {
			NumeroCamisa = numeroCamisa;
		} else {
			throw new IllegalArgumentException("Numero de camisa invalido");
		}
	}

	public int getPontosMarcados() {
		return PontosMarcados;
	}

	public void setPontosMarcados(int pontosMarcados) {
		if (pontosMarcados >= 0) {
			PontosMarcados = pontosMarcados;
		} else {
			throw new IllegalArgumentException("Pontos marcados invalidos");
		}
		
	}

	public int getPartidasJogadas() {
		return PartidasJogadas;
	}

	public void setPartidasJogadas(int partidasJogadas) {
		if (partidasJogadas >= 0) {
			PartidasJogadas = partidasJogadas;
		} else {
			throw new IllegalArgumentException("Numero de partidas invalido");
		}
		
	}


	@Override
	public String ProrrogarContratoUmAno() {
		if (PartidasJogadas > 20) {
			setDataFimContrato(getDataFimContrato().plusYears(1));
			return "Contrato prorrogado ate "+ getDataFimContrato();
		} else {
			return  "Condiçoes impedem o contrato de ser prorrogado!";
		}
	}

}
