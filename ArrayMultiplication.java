import java.util.Scanner;

public class ArrayMultiplication {
	
	   // To print Matrix 
	    static void printMatrix(int M[][], int rowSize, int colSize) 
	    { 
	        for (int i = 0; i < rowSize; i++) 
	        { 
	            for (int j = 0; j < colSize; j++) 
	            {
	                System.out.print(M[i][j] + " "); 
	            }
	  
	            System.out.println(); 
	        } 
	    }   
	    // To multiply two matrices a[][] and b[][] 
	    static void multiplyMatrix(int r1,int c1, int a[][], int r2, int c2, int b[][]) 
	    { 
	        int i, j, k;   
	        // Print the matrices A and B 
	        System.out.println("First Matrix:");
	        printMatrix(a, r1, c1); 
	        System.out.println("Second Matrix:");
	        printMatrix(b, r2, c2);   
	        // Check if multiplication is Possible 
	        if (r2 != c1) 
	        { 
	            System.out.println("Multiplication Not Possible"); 
	            return; 
	        }   
	        // Matrix to store the result 
	        int c[][] = new int[r2][c2]; 
	  
	        // Multiply the two matrices 
	        for (i = 0; i < r1; i++) 
	        { 
	            for (j = 0; j < c2; j++) 
	            { 
	                for (k = 0; k < c1; k++) 
	                    c[i][j] =c[i][j]+ a[i][k] * b[k][j]; 
	            } 
	        }   
	        // Print the result 
	        System.out.println("\nResultant Matrix:"); 
	        printMatrix(c, c1, r2); 
	    }  

public static void main(String[] args) 
{
    int r1, c1, r2, c2;    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows in the first matrix:");
    r1 = sc.nextInt();    
    System.out.print("Enter the number of columns in the first matrix:");
    c1 = sc.nextInt();   
    System.out.print("Enter the number of rows in the second matrix:");
    r2 = sc.nextInt();   
    System.out.print("Enter the number of columns in the second matrix:");
    c2 = sc.nextInt();   
    int a[][] = new int[r1][c1];   
    int b[][] = new int[r2][c2];    
        //Initialize the first Matrix
        System.out.println("Enter all the elements of first matrix:");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c1; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
              //Initialize the second matrix
        System.out.println("Enter all the elements of second matrix:");
        for (int i = 0; i < r2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                b[i][j] = sc.nextInt();
            }
        }            
        //To Multiply two matrices
         multiplyMatrix(r1 ,c1, a, r2, c2, b);    
}
}
