package Methods;

import ClassesNConstructors.ClassDemo;

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


    int[] getMyArray()
    {
        int[] a = {12,23,34,45,46,57,68};

        return a;
    }

    String[][] getTwoDArray()
    {
        String[][] stArr = {
                {"Priya","Radhey","Ravi"},
                {"Saba","Satish","Shashi"},
                {"Sundarmala","Venkat","Amol"},
                {"Rohit","Rahul","Vaibhav"},
                {"Vaishali","Sneha","Pranali"}
        };

        return stArr;
    }

    ClassDemo getMyClassObject()
    {
        ClassDemo classDemo = new ClassDemo();
        classDemo.a = 10;
        classDemo.d = 10.10;
        classDemo.c = 'a';
        classDemo.str = "aaaa";
        return  classDemo;
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


        int[] arr = ob.getMyArray();
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);


        String[][] st = ob.getTwoDArray();

        for (int i=0;i<st.length;i++)
        {
            for (int j=0;j<st[0].length;j++)
            {
                System.out.print(st[i][j]+"\t");
            }
            System.out.println();
        }


        ClassDemo cd = ob.getMyClassObject();
        cd.display();
    }
}
