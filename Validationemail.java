package package1;
import java.util.Scanner;
public class Validationemail {
	public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				//Storing list of emailid in an array
				 String Arr[]= {"pravin0902@gmail.com",
						          "aarthiramachandran@gmailcom",
						          "pooja0610@gmail.com",
						           "abinaya23@Gmail",
						           "ashokanpj@20.com",
						            };
						
				 System.out.println("Enter the EmailId to search");
				//Get input from user to search emailid
			   String s=sc.next();
			   //Validating email
			      
			      for(int  i=0;i<Arr.length;i++)
			       {
			    	  
			       if(Arr[i].equals(s))
			       {
			       
			    	   System.out.println("valid email");
			       
			       }
			      else {
			    	  System.out.println("Invalid email");
			      }
			       }
			  }

}
