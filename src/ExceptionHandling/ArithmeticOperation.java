package ExceptionHandling;

public class ArithmeticOperation {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c=0;

        try {
            c = a / b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("inside catch ArithmeticException");
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        catch (RuntimeException e)
        {
            System.out.println("inside catch RuntimeException");
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("inside catch Exception");
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("c="+c);
        System.out.println("End of the program");
    }
}
