package CollectionsDemo.MapsDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHasMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(102,"sam");
        lhm.put(342,"peter");
        lhm.put(111,"tom");
        lhm.put(222,"harry");
        lhm.put(136,"jonson");

        System.out.println("hm="+lhm);



    }
}
