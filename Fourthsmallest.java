import java.util.Arrays;

class Fourthsmallest {
    
    public static int kthSmallest(int arr[],
                                  int k)
    {
        
          Arrays.sort(arr);
        // the sorted array
        return arr[k - 1];
    }
 
    // driver program
    public static void main(String[] args)
    {
        int arr[] = new int [] { 12, 3, 5, 7, 19,21,43,2 };
        int k = 4;
        System.out.print("Kth smallest element is " + kthSmallest(arr, k));
    }
}

