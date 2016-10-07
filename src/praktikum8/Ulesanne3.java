package praktikum8;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

public class Ulesanne3 {

	public static void main(String[] args) {
		
		ArrayList<String> nimed = new ArrayList<String>();
		nimed.add(TextIO.getlnString());
		
		
		
		for (String nimi : nimed) {
		    System.out.println(nimi);
		}

	}

}
