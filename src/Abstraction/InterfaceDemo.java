package Abstraction;

public interface InterfaceDemo {

    void start();
    void run();

      default void display()
      {
         System.out.println("display ");
      }

    static void display2()
    {
        System.out.println("display ");
    }

    private void display3()
        {
            System.out.println("display ");
        }

}

class ChildInterface implements InterfaceDemo
{

    @Override
   public void start() {
        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
