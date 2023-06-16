package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListSet {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("Ashish");
        al.add("amol1");
        al.add("Jicky");
        al.add("Kavita");
        al.add("Nutesh");

        System.out.println(al);

        al.set(4,"xyz");
        System.out.println(al);

    }
}
