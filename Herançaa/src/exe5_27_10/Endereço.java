package exe5_27_10;

public class Endereço {
	private String pais;
	private String estado;
	private String cidade;
	private String logradouro;
	private String numero;
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Endereço(String pais, String estado, String cidade, String logradouro, String numero) {
	
	setPais(pais);
	setEstado(estado);
	setCidade(cidade);
	setLogradouro(logradouro);
	setNumero(numero);
	}
	
}
