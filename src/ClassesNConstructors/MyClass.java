package ClassesNConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

    /*    int x ;
        x = 111 ;
        System.out.println(x);*/

        MyClass ob = new MyClass();
        ob.a = 10 ;
        ob.d = 10.34 ;
        ob.c = 'd' ;
        ob.str = "Text" ;
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 23 ;
        ob2.d = 67.34 ;
        ob2.c = 'i' ;
        ob2.str = "laptop" ;
        ob2.display();

    }

}
