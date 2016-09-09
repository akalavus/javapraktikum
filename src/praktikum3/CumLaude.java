package praktikum3;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {
		System.out.println("Cum-Laude detektor");
		System.out.println("Sisesta l6putöö hinne");
		int l6putoo = TextIO.getlnInt();
		if (l6putoo < 0 || l6putoo > 0){
			System.out.println("Vigane sisestus");
			return;
		}
		System.out.println("Sisesta keskmine hinne");
		double keskmine = TextIO.getlnDouble();
	
		System.out.println(keskmine);
		

		// !-eitus
		//||-loogiline ei
		if (keskmine > 5 && l6putoo > 5) {
			System.out.println("error1");
		}
		else if (keskmine < 0 && l6putoo < 0){
			System.out.println("Erooor2");
		}
		else if (keskmine >= 4.5 && l6putoo == 5){
			System.out.println("saad cumlaude");
		}
		
		else {
			System.out.println("Ei saa :(");
		}
	}

}
