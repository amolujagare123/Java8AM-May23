package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Amol");
        al.add("Ashish");
        al.add("Raju");
        al.add("Jicky");
        al.add("Kavita");
        al.add("Nutesh");

        System.out.println(al);

      // remove all the elements whose size is less than 5
        al.removeIf(str -> str.length()<5);

        System.out.println(al);

    }
}
