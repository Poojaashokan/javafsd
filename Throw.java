
public class Throw {
	
        public static void main(String[] args)
        {

            int a=2,b=0,result;

            try
            {
                if(b==0) 
                	// creating a method arihmetic exception and giving it in throw block
                    throw(new ArithmeticException("Can't divide by zero"));
                else
                {
                    result = a / b;
                    System.out.print("The result is : " + result);
                }
            }
            catch(ArithmeticException e)
            {
                System.out.print("\n\tError : " + e.getMessage());//getMessage to get the exception
            }

           
        }

				}
    


