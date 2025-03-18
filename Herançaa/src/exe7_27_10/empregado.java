package exe7_27_10;

import java.time.LocalDate;
import java.util.List;

import exe5_27_10.Endereço;

public class empregado extends Funcionario {
	private String idSindc;
	private Gerente gerenteemp;
	
	public empregado(String id, Endereço endereco, LocalDate dataNascimento, String nome, double salario,
			LocalDate dataIngresso, List<String> habilidades, String idSindc, Gerente gerenteemp) {
		super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);
		setIdSindc(idSindc);
		setGerenteemp(gerenteemp);
	}

	public String getIdSindc() {
		return idSindc;
	}

	public void setIdSindc(String idSindc) {
		this.idSindc = idSindc;
	}

	public Gerente getGerenteemp() {
		return gerenteemp;
	}

	public void setGerenteemp(Gerente gerenteemp) {
		this.gerenteemp = gerenteemp;
	}

	public void SairDoSindc() {
		this.idSindc = null;
	}
	public void Comissao(double aux) {
		double comissao = aux * 0.05;
		setSalario(getSalario() + (getSalario() * comissao));
	}

	@Override
	public String toString() {
		return super.toString()+ "empregado [idSindc=" + idSindc + ", gerenteemp=" + gerenteemp + "]";
	}
	
}
