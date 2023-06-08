package StaticNFinal;

public final class Employee {
    int salary = 28000;
    void empWork()
    {
        System.out.println("empWork");
    }

    final void display()
    {
        System.out.println("Employee Display");
    }

}


class Programmer /*extends Employee*/{
    int bonus = 8000;
    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    void display()
    {
        System.out.println("Programmer Display");
    }


}
