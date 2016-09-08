package praktikum2;

import lib.TextIO;

public class Misnimi {

	public static void main(String[] args) {
		System.out.println("Mis su nimi on?");
		
		String nimi;
		nimi = TextIO.getln();
		int nimePikkus = nimi.length();
		System.out.println(nimePikkus);
	
	}

}
