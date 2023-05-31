package Inheritance.PolymorphismDemo;

public class Addition {
    int a;
    int b;
    void addition()
    {
        int c;
        c = a + b;
        System.out.println(c);
    }

    void addition(int x,int y)
    {
        int c;
        c = x + y;
        System.out.println(c);
    }
    void addition(int x,int y,int z)
    {
        int c;
        c = x + y +z;
        System.out.println(c);
    }

    void addition(double x,double y)
    {
        double c;
        c = x + y;
        System.out.println(c);
    }

    void addition(String x,String y)
    {
        String c;
        c = x + y;
        System.out.println(c);
    }
    public static void main(String[] args) {

        Addition add = new Addition();
        add.addition();
        add.addition(12,56);
        add.addition(12,56,45);
        add.addition(12.56,56.11);
        add.addition("String-1","String-2");


    }
}
