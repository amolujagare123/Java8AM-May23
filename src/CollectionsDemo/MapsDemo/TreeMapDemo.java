package CollectionsDemo.MapsDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(102,"sam");
        tm.put(342,"peter");
        tm.put(111,"tom");
        tm.put(222,"harry");
        tm.put(136,"jonson");

        System.out.println("hm="+tm);



    }
}
