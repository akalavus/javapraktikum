package praktikum8;

public class Ulesanne2 {

	public static void main(String[] args) {
		// Kuulujutt
		mehed();
		tegu();
		naised();
	}

	public static void mehed() {
		String[] mehed = { "Peeter", "Ants", "Tõnis" };
		int i = (int) (Math.random() * 3);
		System.out.print(mehed[i]);
	}

	public static void naised() {
		String[] naised = { "Anni", "Juta", "Mari" };
		int i = (int) (Math.random() * 3);
		System.out.print(naised[i] + "ga");
	}

	public static void tegu() {
		String[] tegu = { " nahistas ", " käis kohvikus ", " jalutas " };
		int i = (int) (Math.random() * 3);
		System.out.print(tegu[i]);

	}

}
