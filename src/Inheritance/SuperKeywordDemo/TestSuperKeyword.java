package Inheritance.SuperKeywordDemo;


class Employee {
    int salary = 20000; // 0
    int numberOfAllowedHolidays = 20; //0
    void empWork()
    {
        System.out.println("empWork");
    }

    void display()
    {
        System.out.println("Employee Display");
    }

    Employee()
    {
        System.out.println("inside employee constructor");
    }

    Employee(int a)
    {
        salary = a;
        System.out.println("inside employee constructor");
        System.out.println("salary="+salary);
    }

}

class Programmer extends Employee {
    int bonus = 30000;
    int numberOfAllowedHolidays=15;
    //  int numberOfAllowedHolidays = 20; // -- parent class member copy
    Programmer()
    {
        //super(15000);
        /*bonus = 30000;
        numberOfAllowedHolidays = 10;*/
        System.out.println("inside programmer constructor");
    }
    void display()
    {
        System.out.println("Programmer Display");
    }
    void programmerWork()
    {
        System.out.println("programmerWork");
        System.out.println("numberOfAllowedHolidays="+numberOfAllowedHolidays);
        System.out.println("numberOfAllowedHolidays="+super.numberOfAllowedHolidays);
        display();
        super.display();
    }

}
public class TestSuperKeyword {
    public static void main(String[] args) {

        Programmer p = new Programmer();

      //  p.programmerWork();




    }
}
