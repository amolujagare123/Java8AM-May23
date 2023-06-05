package Methods;

public class MethodReturningValues {

    int calc()
    {
        // statements
        int a =10 ;
        return a;
    }

    char getMyChar(int asc)
    {
        char ch = (char) asc;
        return ch;
    }

    String printSecondHalfOfTheString(String str)
    {
        int halfIndex = str.length() /2;
        String strResult =   str.substring(halfIndex);

        return  strResult;
    }

    boolean checkNumber(int i) // check number is between 1-10 or not
    {
        if(i<=10 && i>=1)
            return true;
        else
            return false;
    }

    boolean checkNumber2(int i) // check number is between 1-10 or not
    {
        boolean result = false;

        if(i<=10 && i>=1)
            result = true;

        return result;
    }

    void sample()
    {

    }
    public static void main(String[] args) {
        MethodReturningValues ob = new MethodReturningValues();

        int x = ob.calc();
        System.out.println("x="+x);
        System.out.println("ob.calc()="+ob.calc());

        char c = ob.getMyChar(97);
        System.out.println("c="+c);


        if(ob.checkNumber(5))
            System.out.println("correct");
        else
            System.out.println("incorrect");

        String newString = ob.printSecondHalfOfTheString("My Name is Amol");
        System.out.println("newString="+newString);
    }
}
