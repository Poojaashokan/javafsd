import java.util.Scanner;
public class ArraySum {
     public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	          int sum = 0, n;
	        System.out.println("Enter the limit of the array:");
	        n = sc.nextInt();
	        System.out.println("Enter the elements of the array:");
	        
	        int arr[] =new int[n];
			for (int i = 0; i < n; i++) 
			{
	            arr[i] = sc.nextInt();
	        }
	        
	        for (int num: arr)
	        {
	            sum = sum + num;
	        }
	        System.out.println("Sum of the elements in the array:" + sum);
	    }
         
}
