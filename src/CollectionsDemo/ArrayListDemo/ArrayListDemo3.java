package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(34);
        al.add(13);
        al.add(33);
        al.add(42);
        al.add(31);
        al.add(92);

       System.out.println(al);
        System.out.println("size="+al.size());
        System.out.println(al.get(4));

        System.out.println("====== Printing using for loop ======");

        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("====== Printing using for each loop ======");

        for (int x:al)
            System.out.println(x);

        System.out.println("====== Printing using Iterator ======");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
