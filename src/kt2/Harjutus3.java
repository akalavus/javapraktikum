package kt2;



public class Harjutus3 {

	   public static void main (String[] args) {
		      int[] res = veeruMaxid (new int[][] { {1,2,6}, {4,5,3} }); // {4, 5, 6}
		      
		   }

		   public static int[] veeruMaxid (int[][] m) {
			   int[] vastus = new int[m.length];
			   
               for (int l = 0; l < m.length; l++) {

                       vastus[l] = m[l][0];
                       for (int i = 0; i < m[l].length; i++) {
                               if (vastus[l] < m[l][i]) {
                                       vastus[l] = m[l][i];
                               }
                       }
               }
               return vastus;
		   }

		}

