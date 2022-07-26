package practice;

public class innerClassAssited2 {


private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	innerClassAssited2  ob=new innerClassAssited2 ();  
	ob.display();  
	}


}
