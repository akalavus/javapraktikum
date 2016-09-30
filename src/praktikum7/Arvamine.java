package praktikum7;

import lib.TextIO;

public class Arvamine {

	public static void main(String[] args) {
	System.out.println("Arva ära arv 1-100");
	vordlus();
	}
	public static int randomNumber( int min, int max ){
		int number = (int)(Math.random() * max);
					
	 return number;
	}
	public static void vordlus(){
		int arvutiArv = randomNumber(1, 100);
		int sisestus = TextIO.getlnInt();
		while(true){
			if(sisestus == arvutiArv){
				System.out.println("arvasid ara!");
				break;
			}
			else if(sisestus < arvutiArv){
				System.out.println("liiga vaike");
			
			}
			else{
				System.out.println("Liiga suur");
			}
			
			
		}
		
	}
	
}	
	

