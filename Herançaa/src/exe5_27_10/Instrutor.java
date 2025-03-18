package exe5_27_10;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {
	private String especializaçao;
	private List<Aluno> listaAlunos = new ArrayList<>();
	private List<String> listaespec = new ArrayList<>();

	public Instrutor(String nome, String tel, Endereço endereco, String email, 
			String especializaçao, List<Aluno> listaAlunos, List<String> listaespec) {
		super(nome, tel, endereco, email);
		setEspecializaçao(especializaçao);
		setListaAlunos(listaAlunos);
		setListaespec(listaespec);

	}

	public String getEspecializaçao() {
		return especializaçao;
	}

	public void setEspecializaçao(String especializaçao) {
		this.especializaçao = especializaçao;
	}


public List<Aluno> getListaAlunos() {
	return listaAlunos;
}

public void setListaAlunos(List<Aluno> listaAlunos) {
	this.listaAlunos = listaAlunos;
}

public List<String> getListaespec() {
	return listaespec;
}
public void setListaespec(List<String> listaespec) {
	this.listaespec = listaespec;
}

public void addespec(String aux) {
	listaespec.add(aux);
}

public void addAlunos(Aluno aux) {
	listaAlunos.add(aux);
}
}
