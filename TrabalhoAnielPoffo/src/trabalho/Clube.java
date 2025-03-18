package trabalho;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Clube {
	private LocalDate dataFimContrato;
	private ArrayList<String> Hablilidades;
	private String patrocinio;
	private double salario;
	private int titulos;
	private Pessoa dadosPessoais;
	
	public LocalDate getDataFimContrato() {
		return dataFimContrato;
	}
	public void setDataFimContrato(LocalDate dataFimContrato) {
		if (dataFimContrato != null) {
				this.dataFimContrato = dataFimContrato;
		} else {
			//throw new IllegalArgumentException("Data invalida");
		}
	}
	public ArrayList<String> getHablilidades() {
		return Hablilidades;
	}
	public void setHablilidades(ArrayList<String> hablilidades) {
		Hablilidades = hablilidades;
	}
	public String getPatrocinio() {
		return patrocinio;
	}
	public void setPatrocinio(String patrocinio) {
		if (!patrocinio.isBlank()) {
			this.patrocinio = patrocinio;
		} else {
			throw new IllegalArgumentException("Patrocinio invalido");
		}
		
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		} else {
			throw new IllegalArgumentException("Salario invalido");
		}
	}
	public int getTitulos() {
		return titulos;
	}
	public void setTitulos(int titulos) {
		if (titulos >= 0) {
			this.titulos = titulos;
		} else {
			throw new IllegalArgumentException("Numero de titulos invalido");
		}
	}
	public Pessoa getDadosPessoais() {
		return dadosPessoais;
	}
	public void setDadosPessoais(Pessoa dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	public Clube(LocalDate dataFimContrato, ArrayList<String> hablilidades, String patrocinio, double salario,
			int titulos, Pessoa dadosPessoais) {
		setDataFimContrato(dataFimContrato);
		setHablilidades(hablilidades);
		setPatrocinio(patrocinio);
		setSalario(salario);
		setTitulos(titulos);
		setDadosPessoais(dadosPessoais);
	}

	public String VerificarIMC(){
		double IMC = dadosPessoais.getPeso() / (dadosPessoais.getAltura()*dadosPessoais.getAltura());
		  
		  if (IMC <= 18.5){
		  
			 return "Abaixo do peso recomendado";	  }
		  
		  else if (IMC >= 18.6 && IMC <= 24.9) {
			  return "Peso normal";}
		  
		  else if (IMC >= 25 && IMC <= 29.9) {
			  return "Acima do peso (sobrepeso) -  é necessário aprimorar o condicionamento físico";}
			  
		  else if (IMC >= 30 && IMC <= 34.9) {
			  return "Obesidade I - é muito necessário aprimorar o condicionamento físico";}
		  
		  else if (IMC >= 35 && IMC <= 39.9) {
			  return "Obesidade II - é impreterível aprimorar o condicionamento físico";}
		  
		  else{
			  return "Obesidade III - é necessário aprimorar o condicionamento físico com urgência!!!";}
		  
		  }
	 public void addTitulosConquistados(int novosTitulos) {
		  
		  setTitulos(getTitulos()+ novosTitulos);;
	  }
	 
	  public void addHabilidade(String parametro) {
			Hablilidades.add(parametro);
			}
	  public abstract String ProrrogarContratoUmAno();
	@Override
	public String toString() {
		return dadosPessoais.toString() + " com o fim de contato em " + dataFimContrato + ", Hablilidades como " + Hablilidades + ", patrocinado por "
				+ patrocinio + ", com salario no valor de " + salario + " reais, com um total de "+ titulos + " titulos";
	} 
	  
	  
}
