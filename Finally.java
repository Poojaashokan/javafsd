
public class Finally {
    
        public static void main(String[] args)
        {
            int a=10,b=0,res=0;
            try
            {
                res = a / b;
            }
            catch(ArithmeticException e)
            {
                System.out.print("Error : " + e.getMessage());
            }
            finally
            {
                System.out.print("The result is : " + res);
            }
        }

}
