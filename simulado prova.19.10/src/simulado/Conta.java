package simulado;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private String nome;
	private String categoria;
	private int anocad;
	private double saldo;
	private String gerente;
	public static List<Conta> listacontas = new ArrayList<>(); 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}else {
			throw new IllegalArgumentException("Nome invalido");
		}
		
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		if (categoria != null && !categoria.isBlank()) {
			this.categoria = categoria;
		}else {
			throw new IllegalArgumentException("Categoria invalida");
		}
	}
	public int getAnocad() {
		return anocad;
	}
	public void setAnocad(int anocad) {
		if (anocad>= 0) {
			this.anocad = anocad;
		}else {
			throw new IllegalArgumentException("Ano invalido");
		}
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}else {
			throw new IllegalArgumentException("Saldo invalido");
		}
		
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		if (gerente != null && !gerente.isBlank()) {
			this.gerente = gerente;
		}else {
			throw new IllegalArgumentException("Gerente invalido");
		}
		
	}
	public Conta(String nome, String categoria, int anocad, double saldo, String gerente) {
		setNome(nome);
		setCategoria(categoria);
		setAnocad(anocad);
		setSaldo(saldo);
		setGerente(gerente);
		listacontas.add(this);
	}
	public double Rendimento(int anoprevisto) {
	//15% ao ano
		double saldoaux = getSaldo();
		for (int i = getAnocad(); i < anoprevisto; i++) {
			saldoaux = saldoaux + (saldoaux * 0.15);
		}return saldoaux;
	
	}
	
	@Override
	public String toString() {
		return "O cliente "+ getNome() + " da categoria " + getCategoria() + " com a conta criada no ano de " + getAnocad() +
				", com saldo de " + getSaldo() + ", sob a gertencia de " + getGerente();
	}
	

}
