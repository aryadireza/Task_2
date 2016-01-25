/* IF-38-09
1. Reza Aryadi (1301144179)
2. Fitrah Bima Nusantara (1301140295)
*/

 public class MinimumArray{
 
   public int checkMinimum(int[] A, int[] B){
    // write your solution here
	int maxLength;
	if(A.length>=B.length) {
		maxLength=A.length;
	}
	else {
		maxLength=B.length;
	}
	int[] temp = new int[maxLength];
	int counter = 0;
	for(int i=0;i<A.length;i++) {
		for(int j=0;j<B.length;j++) {
			if(A[i]==B[j]) {
				temp[counter]=A[i];
				counter++;
			}
		}
	}
	int min = 6666666;
	for(int k=0;k<temp.length;k++) {
		if(temp[k] != 0) {
			if(temp[k] < min)  {
				min = temp[k];
			}
		}	
	}
	if(min == 6666666) {
		return -1;
	}
	else {
		return min;
	}
   }
     
   public static void main(String[] args){
    MinimumArray m = new MinimumArray();
     
    int[] A = { 1, 3, 2, 1 };
    int[] B = { 4, 2, 5, 3, 2 };
	
     int result = m.checkMinimum( A, B );
	System.out.println("Angka Terkecil : "+result);
	
   }
 }