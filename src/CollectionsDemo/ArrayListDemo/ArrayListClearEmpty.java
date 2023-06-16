package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClearEmpty {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("empty->"+al.isEmpty());//true

        al.add(12);
        al.add(34);
        al.add(13);
        al.add(33);
        al.add(42);
        al.add(31);
        al.add(92);
        System.out.println("empty->"+al.isEmpty()); // false
       System.out.println(al);

        al.clear();

        System.out.println(al);


    }
}
