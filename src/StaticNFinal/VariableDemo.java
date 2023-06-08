package StaticNFinal;

public class VariableDemo {

    final int speed  = 100;

    void change()
    {
       // speed = 200;
    }

    public static void main(String[] args) {
        VariableDemo ob = new VariableDemo();
        ob.change();
        System.out.println(ob.speed);
    }
}
