package praktikum6;

import lib.TextIO;

public class Harjutus2 {
	
	

	
	
	public static int kasutajaSisestus(int min, int max){
		System.out.println("Sisesta arv vahemikus " + min + " kuni " + max);
		while (true){
			int sisestus = TextIO.getInt();
			if (sisestus >= min && sisestus <= max)
			return sisestus;{
			}
			TextIO.putln("Arv ei sobi, sisesta uuesti.");
			
		}
		
	}
	

	public static void main(String[] args) {
		
		kasutajaSisestus(0,10);
		TextIO.putln("Sobib!");

	}

}
