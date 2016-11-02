package kt2;

public class Harjutus2 {

	// Koostage Java meetod, mis genereerib parameetrina
	// etteantud n järgi niisuguse n korda n täisarvumaatriksi,
	// mille iga elemendi väärtuseks on selle elemendi
	// reaindeksi ja veeruindeksi summa ruut (indeksid algavad nullist).

	public static void main(String[] args) {
		int[][] res = muster(9);
	}

	public static int[][] muster(int n) {
		
		int suurus = n;
		for (int i = 0; i < suurus; i++) {
			for (int j = 0; j < suurus; j++) {

				System.out.print(" " + (i+j)*(i+j) + " ");
			}

			System.out.println();

		}

		return null; // TODO!!! Your code here
	}

}
