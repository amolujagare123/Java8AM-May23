package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Amol");
        al.add("Ashish");
        al.add("Raju");
        al.add("Jicky");
        al.add("Kavita");
        al.add("Nutesh");

        System.out.println(al);

      // remove all the elements whose second Character is a
        al.removeIf(str -> str.charAt(1)=='a');
        
        System.out.println(al);

    }
}
