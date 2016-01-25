/* IF-38-09
1. Reza Aryadi (1301144179)
2. Fitrah Bima Nusantara (1301140295)
*/
 public class OddOccurences{
   
   public int checkOddOccurences( int[] A ){
    // write your solution here
    int[] temp = new int[A.length];
		for (int a=0; a<A.length; a++) {
			temp[a] = 0;
		}
		for (int b=0; b<A.length; b++){
			if (temp[b]==0) {
				for (int c=b+1; c<A.length; c++){
					if (A[b]==A[c]){
						temp[b] = 1;
						temp[b] = 1;
					}
				}
			}
		}
		for (int d=0; d<=A.length; d++) {
			if (temp[d]==0){
				return(A[d]);
			}
		}
  return 0;
   }
   
   public static void main(String[] args){
     OddOccurences odd = new OddOccurences();
     
     int[] A = { 9, 3, 9, 3, 9, 7, 9 };
     
     int result = odd.checkOddOccurences( A );
	System.out.println("Angka yang tidak punya pasangan adalah = " + result);
     
   }
   
 }