package Abstraction;

public abstract class AbstractClass {

    abstract void run();
    abstract void show();

    void display()
    {
        System.out.println("display");
    }
}

class ChildAbstract extends AbstractClass
{

    @Override
    void run() {
        System.out.println("run");
    }

    @Override
    void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {

        //AbstractClass ob = new AbstractClass();
        AbstractClass ob = new ChildAbstract();
        ob.run();
        ob.show();
        ob.display();
    }
}
