package Inheritance.TestPackage2;


import Inheritance.TestPackage2.pack1.Animal;
import Inheritance.TestPackage2.pack2.Dog;
import Inheritance.TestPackage2.pack3.BabyDog;

public class TestMultilevelInheritanceInPackage {

    public static void main(String[] args) {


      /*  Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.barks();
        d.eat();*/

        BabyDog bd = new BabyDog();

        bd.weeps();
        bd.barks();
        bd.eat();

    }
}
