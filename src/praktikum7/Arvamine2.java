package praktikum7;

import lib.TextIO;

public class Arvamine2 {
	
	public static int randomNumber( int min, int max ){
		int number = (int)(Math.random() * max);
	 return number;
	}
	public static int kasutajaSisestus(int min, int max){
		int kasutajaArv = TextIO.getInt();
		while(true){
		if(kasutajaArv > max || kasutajaArv < min){
			System.out.println("Arv ei sobi");
		}return kasutajaArv;
		}	
	}

	public static void main(String[] args) {
		int arvutiArv = randomNumber(1, 100);
		while (true){
			System.out.println("Arva ära arv 1-100");
			int kasutajaArv = kasutajaSisestus(1, 100);
			if (kasutajaArv == arvutiArv){
				System.out.println("Arvasid ära!");
				break;
			}
			else if (kasutajaArv > arvutiArv){
				System.out.println("Arvuti arv on väiksem");
			}
			else{
				System.out.println("Arvuti arv on suurem");
			}
		}
		
	}

}
