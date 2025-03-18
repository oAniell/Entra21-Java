package exemplo;
//classe filho que herda a classe pai
public class aviao extends veiculo {
	
	
	int numMotores;
	int numAsas;
	
	public aviao(String modelo, double peso, double comprimento, double vmax, int passageiros) {
		super(modelo, peso, comprimento, vmax, passageiros);
		
	}
	
	
	
}
