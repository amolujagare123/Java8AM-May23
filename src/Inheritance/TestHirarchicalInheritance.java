package Inheritance;


class Bird
{
    void fly()
    {
        System.out.println("fly");
    }

}

class Crow extends Bird
{
    void crowColor()
    {
        System.out.println("crowColor");
    }
}


class Sparrow extends Bird
{
    void sparrowColor()
    {
        System.out.println("sparrowColor");
    }
}


public class TestHirarchicalInheritance {
    public static void main(String[] args) {

        Bird b = new Bird();
        b.fly();

        Crow c = new Crow();
        c.crowColor();
        c.fly();

        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();
    }

}
