package exe7_27_10;

import java.time.LocalDate;
import java.util.List;

import exe5_27_10.Endereço;

public class Gerente extends Funcionario{
	private String idGerente;

	public Gerente(String id, Endereço endereco, LocalDate dataNascimento, String nome, double salario,
			LocalDate dataIngresso, List<String> habilidades, String idGerente) {
		super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);
		setIdGerente(idGerente);
	}

	public String getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(String idGerente) {
		this.idGerente = idGerente;
	}
public void demitirEmpreg(empregado aux) {
	if (aux.getGerenteemp().getId().equals(this.getId())) {
		aux.setIdSindc("Demitido");
	}else {
		throw new IllegalArgumentException("Voce nao tem autorização para demitir este empregado");
	}
}

@Override
public String toString() {
	return super.toString()+"Gerente [idGerente=" + idGerente + "]";
}
}
