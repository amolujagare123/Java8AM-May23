package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove {

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

      //  al.remove(4);
      //  al.remove(31);
        al.remove(new Integer(31));

        System.out.println("al="+al);


    }
}
