package praktikum8;

import lib.TextIO;

public class Ulesanne1 {

	public static void main(String[] args) {
		arvud();

	}

	public static int[] arvud() {
		System.out.println("Sisesta 10 arvu");
		int[] arvud = new int[10];
		for (int a = 0; a < arvud.length; a++) {
			arvud[a] = TextIO.getlnInt();
		}
		for (int a = arvud.length - 1; a >= 0; a--)
			System.out.print(arvud[a] + " ");
		return arvud;

	}

}
