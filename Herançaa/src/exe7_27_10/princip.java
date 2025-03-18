package exe7_27_10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exe5_27_10.Endereço;

public class princip {

	public static void main(String[] args) {
	LocalDate dtE1 = LocalDate.of(2003, 9, 9);
	LocalDate DTE1 = LocalDate.of(2009, 10, 1);
	List<String > liste1 = new ArrayList<>();
	Endereço endE1 = new Endereço("Brasil", "SC", "Bnu", "Rua xxxx", "99, apto 101");
	Gerente ge1 = new Gerente("987654", endE1, dtE1, "lucas", 3000, DTE1, liste1, "1357");
	empregado e1 = new empregado("12345", endE1, dtE1, "Guilherme", 1800, DTE1, liste1,"333",  ge1);
	
	ge1.demitirEmpreg(e1);
	System.out.println();
	System.out.println(e1.toString());
	System.out.println(e1.idade());
	System.out.println(e1.calcSalario());
	e1.Comissao(1000);
	System.out.println(e1.toString());
	e1.addHab("correr");
	System.out.println(e1.toString());
	}

}
