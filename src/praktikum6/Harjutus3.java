package praktikum6;

import lib.TextIO;

public class Harjutus3 {
	
	public static void kasutajaSisestus( int min, int max){
	TextIO.putln("Kull v6i kiri?(1 või 2)");
	int kull = TextIO.getInt();
		if(kull == 1){
			System.out.println("Kasutaja valis kull");
		}
	}
	int kiri = TextIO.getInt(){
		if(kiri == 1){
			System.out.println("kasutaja valis kiri");
		}
	
	
	
	public static void kullKiri(){
int suva;
		
		// Genereerime random numbri, 0 kuni 1
		suva = (int)(Math.random() * 2);
		
		if( suva == 0 ) {
			System.out.println("Kiri");
		}
		else {
			System.out.println("Kull");
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println("Let's play a game..");
		kasutajaSisestus(1, 2);
		kullKiri();
		

	}

}
