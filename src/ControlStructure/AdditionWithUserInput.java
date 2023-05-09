package ControlStructure;

import java.util.Scanner;

public class AdditionWithUserInput {

    public static void main(String[] args) {

        int a;
        int b ;
        int c ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a=");
        a = sc.nextInt();

        System.out.println("Enter the value of b=");
        b = sc.nextInt();

        c = a + b;
        System.out.println("Addition="+c);

    }
}
