package package1;
import java.util.Scanner;
public class Arithmeticcalculator {
	public static void main(String []args) {
		double input1,input2;
		double output=0;
		char operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first input:");
		input1=sc.nextDouble();
		System.out.println("enter the second input:");
		input2=sc.nextDouble();
		System.out.println("enter the operator +,-,* or /:");
		operator=sc.next().charAt(0);
		switch(operator) {
		case '+':
			output=input1+input2;
			break;
		case'-':
			output=input1-input2;
			break;
		case '*':
			output=input1*input2;
			break;
		case'/':
			output=input1/input2;
			break;
		default:
			System.out.println("you have entered invalid input");
	    break;
	    
			
		}
		System.out.println("The result of the operations is:\n");
		System.out.println(input1 + " " + operator + " " + input2 + "=" + output);
		
		
		
		
		
	}
	
}

