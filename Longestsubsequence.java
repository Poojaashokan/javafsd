
 public class Longestsubsequence{
   static int incre_subseq(int arr[], int arr_len){
      int longseq_arr[] = new int[arr_len];
      int i, j, max = 0;
      for (i = 0; i < arr_len; i++)
      {
         longseq_arr[i] = 1;
      }
      for (i = 1; i < arr_len; i++) {  
      for (j = 0; j < i; j++)
      {
      if (arr[i] > arr[j] && longseq_arr[i] < longseq_arr[j] + 1)
      longseq_arr[i] = longseq_arr[j] + 1;
      }
      }
      for (i = 0; i < arr_len; i++)
      {
      if (max < longseq_arr[i]) {
      max = longseq_arr[i];
   
      }
      }
	return max;
   }
   public static void main(String args[]){
      int arr[] = { 21,1,30,6,43,45,2,76,67 };
      int arr_len = arr.length;
      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(arr, arr_len));
     
   }
}
