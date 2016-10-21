package praktikum10;

import java.util.ArrayList;

public class UlesanneKaks {

	public static void main(String[] args) {
		int[][] neo = { { 1, 3, 6, 7 }, 
				      { 2, 3, 3, 1 }, 
				      { 17, 4, 5, 0 }, 
				      { -20, 13, 16, 17 } 
				};
		ArrayList<Integer> suurimad = new ArrayList<Integer>();
		for (int i = 0; i < neo.length; i++) {
			suurimad.add(getSuurim(neo[i]));
		}
		//Arraylist to Massiiv
		int[] suurimadMasiiv = new int[suurimad.size()];
		for (int i = 0; i < suurimad.size(); i++) {
			suurimadMasiiv[i] = suurimad.get(i);
		}
		//VASTUS
		int suurim = getSuurim(suurimadMasiiv);
		System.out.println(suurim);

	}

	public static int getSuurim(int[] massiiv) {
		int suurim = Integer.MIN_VALUE;
		for (int i = 0; i < massiiv.length; i++) {
			if (suurim < massiiv[i]) {
				suurim = massiiv[i];

			}
		}
		return suurim;
	}

}
