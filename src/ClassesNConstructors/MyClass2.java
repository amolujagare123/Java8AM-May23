package ClassesNConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str;

    /*MyClass2() // Empty Constructor
    {
        // no-body
    }*/
    MyClass2()
    {
       a = 99;
       d = 99.99;
       c ='z';
       str = "aaaa";
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();
        ob.display();
    }

}
