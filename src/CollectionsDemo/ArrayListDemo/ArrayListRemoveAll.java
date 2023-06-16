package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(34);
        al.add(13);
        al.add(33);
        al.add(42);
        al.add(31);
        al.add(92);

       System.out.println("al="+al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(121);
        al2.add(314);
        al2.add(113);
        al2.add(311);
        al2.add(921);
        al2.add(42);
        al2.add(31);
        al2.add(92);

        System.out.println("al2="+al2);


        al2.removeAll(al);
        System.out.println("al2="+al2);
    }
}
