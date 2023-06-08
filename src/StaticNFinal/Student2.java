package StaticNFinal;

public class Student2 {
    public int rno;
    public String name ;
    public static String college = "ITC";

    public void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");
      //  System.out.println("rno="+rno); // non static - not allowed
      //  System.out.println("name="+name); // non static - not allowed
        System.out.println("college="+college);// static -  allowed
        staticMethod2();//  static -  allowed
      //  nonStaticMethod();// non static - not allowed
    }
    public static void staticMethod2()
    {
        int a =10;
        System.out.println("staticMethod2");
    }

    public void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
        System.out.println("rno="+rno); // non static - not allowed
        System.out.println("name="+name); // non static - not allowed
        System.out.println("college="+college);// static -  allowed
        staticMethod2();//  static -  allowed
        nonStaticMethod();// non static - not allowed
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2();
        s1.rno = 1;
        s1.name ="Shashi";
        Student2.college = "Pune college";

        s1.staticMethod1();
        s1.staticMethod2();

        Student2.staticMethod1(); // static method can be called with class name
        Student2.staticMethod2();

        staticMethod1(); // inside the main (same class ) we even dont need class name to call static methods

        s1.display();

    }
}
