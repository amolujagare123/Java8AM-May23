package Inheritance.PolymorphismDemo;

public class Casting {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        double c = (double) a/b;

        // if you want to store one type of value into another type
        // then we need to type cast it
        // use the datatype in bracket in front of the value to be stored
        // into another type of variable

        System.out.println("c="+c);
    }
}
