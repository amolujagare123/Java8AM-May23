package ClassesNConstructors;

public class ParamConstructorWithThis {

    int a;
    double d;
    char c;
    String str;

    /*MyClass2() // Empty Constructor
    {
        // no-body
    }*/
    ParamConstructorWithThis(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParamConstructorWithThis ob = new ParamConstructorWithThis(12,45.78,'o',"String");
        ob.display();
    }

}
