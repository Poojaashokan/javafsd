package practice;

public class innerClassAssisted3 {

public static void main(String[] args) {
	abstract class AnonymousInnerClass {
		   public abstract void display();
		}

		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }



}
