package Inheritance;

public class Employee {
    int salary = 28000;
    void empWork()
    {
        System.out.println("empWork");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.salary);
        e.empWork();

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();
        System.out.println(p.salary);
        p.empWork();

    }
}

class Demo
{

}

class Programmer extends Employee/*,Demo */{
    int bonus = 8000;
    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    /*public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.salary);
        e.empWork();

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();
        System.out.println(p.salary);
        p.empWork();

    }*/

    void testAnimal()
    {
        Animal a = new Animal();
        a.eat();


    }
}
