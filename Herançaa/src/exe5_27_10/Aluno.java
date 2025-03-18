package exe5_27_10;

public class Aluno extends Pessoa {
	
	private String tipoDeAssociaçao;
	private boolean pagamentoematraso;
	
	public String getTipoDeAssociaçao() {
		return tipoDeAssociaçao;
	}
	public void setTipoDeAssociaçao(String tipoDeAssociaçao) {
		this.tipoDeAssociaçao = tipoDeAssociaçao;
	}
	public boolean isPagamentoematraso() {
		return pagamentoematraso;
	}
	public void setPagamentoematraso(boolean pagamentoematraso) {
		this.pagamentoematraso = pagamentoematraso;
	}
	
	public Aluno(String nome, String tel, Endereço endereco, String email, 
			String tipoDeAssociaçao, boolean pagamentoematraso) {
		super(nome, tel, endereco, email);
		setTipoDeAssociaçao(tipoDeAssociaçao);
		setPagamentoematraso(pagamentoematraso);
	}
	public void pagar() {
		setPagamentoematraso(false);
	}
}
