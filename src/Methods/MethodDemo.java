package Methods;

import ClassesNConstructors.ClassDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodDemo {

    void addition(int a)
    {
        int c;
        c = 10 + a;
        System.out.println("c="+c);
    }

    void subtraction(int a,int b)
    {
        int c;
        c = a - b;
        System.out.println("c="+c);
    }

    void differentParameters(int a,int b,double d)
    {
        double c;
        c = a - b + d;
        System.out.println("c="+c);
    }

    void differentParameters2(int a,int b,double d,String msg)
    {
        double c;
        c = a - b + d;
        System.out.println(msg + c);
    }

    void printMyArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    void printMyTwoDArray(String[][] stArr)
    {
        for (int i=0;i<stArr.length;i++) // row = 4
        {
            for (int j=0;j<stArr[0].length;j++) // col = 3
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void convertDate(Date date)
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("The converted Date="+sd.format(date));
    }

    void classObjectArgument(ClassDemo obj)
    {
            obj.a =10;
            obj.d = 23.45;
            obj.c = 'g';
            obj.str = "abc";
    }


    public static void main(String[] args) {

        MethodDemo ob  = new MethodDemo();
       /* ob.addition(19);
        ob.subtraction(34,9);
        ob.differentParameters(34,12,67.90);
        ob.differentParameters2(34,12,67.90,"calculation=");

        int[] x = {4,56,2,1,55,34,679,90};

        ob.printMyArray(x);

        String[][] st = {
                {"Priya","Radhey","Ravi"},
                {"Saba","Satish","Shashi"},
                {"Sundarmala","Venkat","Amol"},
                {"Rohit","Rahul","Vaibhav"},
                {"Vaishali","Sneha","Pranali"}
        };

        ob.printMyTwoDArray(st);

        Date date = new Date();

        ob.convertDate(date);
        ob.convertDate(new Date());
*/

        ClassDemo classDemo = new ClassDemo();

        ob.classObjectArgument(classDemo);

        classDemo.display(); // a,d,c,str


    }
}
