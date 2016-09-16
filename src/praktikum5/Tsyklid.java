package praktikum5;

public class Tsyklid {

	public static void main(String[] args) {
		
		if (true) {
			System.out.println("laused mis täidetakse kui tingimus on tõene");

		}
		int i = 10;
		while (true){//kasutame seal kus me ei tea mitukorda me tahame midagi teha
			System.out.println("laused mis täidetakse kui tingimus on tõene (while)");
			System.out.println(i);
			break;
		}
	
		for ( int j = 0 ; j < 11 ; j++){
			System.out.println(j);
		}
	
	
	}

}
