package praktikum7;

import lib.TextIO;

public class tagurpidiNimi {

	public static void main(String[] args) {
		System.out.println("mis su nimi on");
		String nimi =TextIO.getlnString();
		char[] digit = nimi.toCharArray();
		for(int i = digit.length - 1; i >= 0; i--)
			System.out.print(digit[i]);
		System.out.println();

	}

}
