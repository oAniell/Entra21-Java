package exe7_27_10;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import exe5_27_10.Endereço;

public abstract class Funcionario {
	private String id;
	private Endereço endereco;
	private LocalDate dataNascimento;
	private String nome;
	private double salario;
	private LocalDate dataIngresso;
	private List<String> habilidades = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Endereço getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	public Funcionario(String id, Endereço endereco, LocalDate dataNascimento, String nome, double salario,
			LocalDate dataIngresso, List<String> habilidades) {
		setId(id);
		setEndereco(endereco);
		setDataNascimento(dataNascimento);
		setNome(nome);
		setSalario(salario);
		setDataIngresso(dataIngresso);
		setHabilidades(habilidades);
	}
	public long idade() {
		LocalDate data = dataNascimento;
		LocalDate aux = LocalDate.now();
		long idadeaux = ChronoUnit.YEARS.between(data, aux);
		
		return idadeaux;
	}
	public double calcSalario() {
		return salario * 12;
	}
	public void addHab(String aux) {
		habilidades.add(aux);
	}
	public long calAnosEmpresa() {
		LocalDate data = dataIngresso;
		LocalDate aux = LocalDate.now();
		long idadeaux = ChronoUnit.YEARS.between(data, aux);
		return idadeaux;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", nome="
				+ nome + ", salario=" + salario + ", dataIngresso=" + dataIngresso + ", habilidades=" + habilidades
				+ "]";
	}

}
