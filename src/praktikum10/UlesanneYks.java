package praktikum10;

public class UlesanneYks {

	public static void main(String[] args) {
		int massiiv[] = {1, 3, 6, 7, 8, 3, 5, 7, 21, 3};
		getSuurim(massiiv);
		
	}
		
		int getSuurim(int[] massiiv) {
			int suurim = Integer.MIN_VALUE;
			for (int i = 0; i < massiiv.length; i++) {
				if (suurim < massiiv[i]) {
					suurim = massiiv[i];
					System.out.println(suurim);

				}
			}
			return suurim;
	}
	

}
