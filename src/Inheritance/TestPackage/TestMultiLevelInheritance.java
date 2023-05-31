package Inheritance.TestPackage;

public class TestMultiLevelInheritance {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.barks();
        d.eat();

        BabyDog bd = new BabyDog();
        bd.weeps();
        bd.eat();
        bd.eat();
    }
}
