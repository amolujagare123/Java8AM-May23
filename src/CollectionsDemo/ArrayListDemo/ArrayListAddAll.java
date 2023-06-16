package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListAddAll {

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
        System.out.println("al2="+al2);

        al2.addAll(al);
        System.out.println("al2="+al2);
    }
}
