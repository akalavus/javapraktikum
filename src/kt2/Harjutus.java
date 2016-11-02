package kt2;

public class Harjutus {
	// Koostage Java meetod, mis leiab etteantud
	// reaalarvude massiivi d põhjal niisuguste
	// elementide arvu, mis on rangelt suuremad
	// kõigi elementide aritmeetilisest keskmisest
	// (aritmeetiline keskmine = summa / elementide_arv).
	public static void main(String[] args) {
		System.out.println(keskmisestParemaid(new double[] { 0., 5., 12.,13.  }));
		// YOUR TESTS HERE
	}
	
	

	public static int keskmisestParemaid(double[] d) {
		
		double summa = 0;
	      double keskmine;
	      int arv = 0;
	 
	      for (int i = 0; i < d.length; i++) {
	         summa += d[i];
	      }
	 
	      keskmine = summa / d.length;
	 
	      for (int j = 0; j < d.length; j++) {
	         if (d[j] > keskmine) {
	            arv++;
	         }
	      }
	      return arv;    
		
		
		
		
		
	}

}