package praktikum10;

import java.util.ArrayList;

import lib.TextIO;

public class UlesanneKolm {

	public static void main(String[] args) {
		ArrayList<Integer> numbrid = new ArrayList<Integer>();
		int test;

		do {
			System.out.println("Sisesta numbreid, 0 l6petab.");
			test = TextIO.getInt();
			if (test > 0) {
				numbrid.add(test);
			}

		} while (test != 0);

		int j = 0;
		for (j = 0; j < numbrid.size(); j++) {
			int nr = numbrid.get(j);
			System.out.printf("%2d %s\n", nr, genereeriIksid(nr));// %2d-kahekohaline
																	// nr,
																	// %s-tulebstring,
																	// \n-uus
																	// rida

		}
	}

	public static String genereeriIksid(int nr) {
		String iksid = "";
		for (int i = 0; i < nr; i++) {
			iksid = iksid + "X";

		}
		return iksid;
	}

}
