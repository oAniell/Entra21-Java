package exe2_24_10;

public class principal {

	public static void main(String[] args) {
		AlunoFurb a1 = new AlunoFurb("Gui", 20, 'V', "ED. fisica", "futzinho");
		
		System.out.println(a1.getCurso());
		
		a1.trancarCurso();
		
		System.out.println(a1.getCurso()); 

	}

}
