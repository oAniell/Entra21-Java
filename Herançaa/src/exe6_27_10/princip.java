package exe6_27_10;

public class princip {

	public static void main(String[] args) {
		Notebook n1 = new Notebook("pichau gamer", 32, 1000, 1.5);
		Smartphone s1 = new Smartphone("samsungo", 8, 128, 1, true);
		
		System.out.println(s1.isCamerafront());
		System.out.println(s1.ligar(123456789));
		System.out.println(s1.ligar(23456789));
		System.out.println(s1.ligDesl(false));
		System.out.println(s1.tirarSelfie());
		
		System.out.println(n1.getRam());
		n1.aumentarRam(16);
		System.out.println(n1.getRam());
		System.out.println(n1.ligDesl(true));
		System.out.println(n1.rodarApp("aaaaa.exe"));
		System.out.println(n1.rodarApp("aaaa"));
		

	}

}
