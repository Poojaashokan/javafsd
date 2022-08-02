import java.util.Scanner;
public class RightRotateArray 
{
    void rotate(int a[], int n, int r)
    {
        int i;
        System.out.println("Original Array:     ");
        
        for(i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        
        for (int j=1;j<=r;j++)
        {
            //store last element in a temporary variable
            int temp = a[n-1];
            for(i=n-1;i>0;i--)
            {
                
                a[i] = a[i-1];
            }
            
            //shifting of last element to the first position
            a[0] = temp;
        }
        System.out.println(" ");
        System.out.println("Right Rotated Array: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the number of times the array needs to be rotated right");
        int r = sc.nextInt();
        System.out.println("Enter elements in array");
        for(int j=0;j<n;j++)
        {
            A[j] = sc.nextInt();
        }
        RightRotateArray rra = new RightRotateArray();
        rra.rotate(A, n, r);
    }
}