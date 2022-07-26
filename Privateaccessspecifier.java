package Specifier;

	public class Privateaccessspecifier 
	{ 
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

   class accessSpecifiers2 {

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			Privateaccessspecifier  obj = new Privateaccessspecifier(); 
	        //trying to access private method of another class 
	        //obj.display();

		}

	

}
