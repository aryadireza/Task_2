/* IF-38-09
1. Reza Aryadi (1301144179)
2. Fitrah Bima Nusantara (1301140295)
*/

import MinimumArray;
   public static void main(String[] args){
    MimimumArray m = new MinimumArray();
     
    int[] A = { 1, 3, 2, 1 };
    int[] B = { 4, 2, 5, 3, 2 };
	
     int result = m.checkMinimum( A, B );
	System.out.println("Minimal value : "+result);
	System.out.println(A[1]);
	
   }
 }