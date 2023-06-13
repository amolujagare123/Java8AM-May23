package ExceptionHandling;

public class NumberDemo {

    void checkNumber(int i)
    {
        if(i<=10 && i>=1)
            System.out.println("We are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {

        NumberDemo ob = new NumberDemo();
        int a = 15;
        ob.checkNumber(a);

        System.out.println("a="+a);
        System.out.println("End of the program");

    }
}
