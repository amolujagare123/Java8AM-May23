package CollectionsDemo.MapsDemo;

import java.util.HashMap;

public class HasMapDemo2 {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(102,"sam");
        hm.put(342,"peter");
        hm.put(111,"tom");
        hm.put(222,"harry");
        hm.put(136,"jonson");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm2 = new HashMap<>();
        System.out.println("hm2="+hm2);

        hm2.putAll(hm);
        System.out.println("hm2="+hm2);


    }
}
