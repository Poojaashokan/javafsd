package proj;

public class Array {
	public static void main(String[] args) {

		//single-dimensional array
		int arr1[]= {1,12,15,19};
		for(int i=0;i<4;i++) {
		System.out.println("Elements of array arr1: "+arr1[i]);
		}


		//multidimensional array
		int arr2 [][]  = {
		            {3,9,12,15,18,21}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nLength of row 1: " + arr2[0].length);
		      }
}
