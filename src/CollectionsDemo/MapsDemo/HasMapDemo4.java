package CollectionsDemo.MapsDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HasMapDemo4 {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(102,"sam");
        hm.put(342,"peter");
        hm.put(111,"tom");
        hm.put(222,"harry");
        hm.put(136,"jonson");

        System.out.println("hm="+hm);

        Set s = hm.keySet();
        Collection c = hm.values();
        Set entrySet = hm.entrySet();

        System.out.println("keySet="+s);
        System.out.println("values="+c);
        System.out.println("entrySet="+entrySet);


    }
}
