package exe5_27_10;

public abstract class Pessoa {
	private String nome;
	private String tel;
	private Endereço endereco;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Endereço getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa(String nome, String tel, Endereço endereco, String email) {

		setNome(nome);
		setTel(tel);
		setEndereco(endereco);
		setEmail(email);
	}

}
