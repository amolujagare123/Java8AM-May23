package Abstraction;

public interface AnotherInterface {

    void start();
    void run();
    void display();
}

interface Interface2
{
    void display();
}

class ChildInterface2 implements AnotherInterface,Interface2
{

    @Override
    public void start() {

    }

    @Override
    public void run() {

    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
