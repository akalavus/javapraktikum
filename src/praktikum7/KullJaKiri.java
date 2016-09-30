package praktikum7;

import lib.TextIO;

public class KullJaKiri {
	
	public static int panus(int min, int max){
	System.out.println("Sisesta panus " +  min + " kuni " +  max);
	int panus = TextIO.getInt();
	while(true){
		if(panus < min || panus > max){
			System.out.println("Panus ei sobi! panustada saab 1-25");
			
		}
		else{
			System.out.println("Sinu panus on: " + panus);
			return panus;
		}
	
	}
	}
	public static int kullKiri(){
		// 0 - kull, 1 - kiri
		int myndiVise = Math.random() > 0.5 ? 1 : 0;
		System.out.print("Kull(0) või kiri(1)? -  " );
		int kasutajaArvamus = TextIO.getInt();
		System.out.println("Kasutaja sisestas: " + kasutajaArvamus);
		System.out.println("Arvuti myndivise: " + myndiVise);
	
			
		
		
		return myndiVise;
	}
	

	

			

	public static void main(String[] args) {
		System.out.println("Kull ja kiri");
		int kasutajaRaha = 100;
		
		while (kasutajaRaha > 0) {
			System.out.println("Kasutaja raha: " + kasutajaRaha);
			int maxPanus = Math.min(25, kasutajaRaha);
			int panus = panus(1, maxPanus);
			kasutajaRaha -= panus;
			int kullKiri = kullKiri();
			if (1 == kullKiri) {
				System.out.println("Tuli kiri, saad panuse topelt tagasi");
				kasutajaRaha += panus * 2;
			} else {
				System.out.println("tuli kull, ei saa midagi");
			} 
		}
		System.out.println("Raha otsas, mang labi lol, better luck next time");
		
		
		
			
		

	}

}
