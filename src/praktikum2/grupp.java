package praktikum2;

import lib.TextIO;

public class grupp {

	public static void main(String[] args) {

		
		System.out.println("Sisesta inimeste arv");
		int a = TextIO.getlnInt();// inimeste arv
		System.out.println("Sisesta grupi suurus");
		int b = TextIO.getlnInt();// grupi suurus

		// arvude jagamine
		int c = a / b;

		// väljastame
		System.out.println("Saab moodustada " + c + " gruppi");
	
		int j22k = a % b;
		System.out.println("Üle jääb " + j22k + " inimest");

	}

}
