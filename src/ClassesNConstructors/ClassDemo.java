package ClassesNConstructors;

public class ClassDemo {

    public int a;
    public double d;
    public  char c;
    public String str;

    public void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ClassDemo ob = new ClassDemo();


        ob.a = 10 ;
        ob.d = 10.34 ;
        ob.c = 'd' ;
        ob.str = "Text" ;
        ob.display();

    }

}
