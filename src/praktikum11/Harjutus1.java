package praktikum11;

public class Harjutus1 {

	public static void main(String[] args) {
		System.out.println(astenda(3, 4));

	}

	public static int astenda(int arv, int aste) {
		if (aste == 1) {
			return arv;
		} 
			return arv * astenda(arv, aste - 1);
		
	}

}
