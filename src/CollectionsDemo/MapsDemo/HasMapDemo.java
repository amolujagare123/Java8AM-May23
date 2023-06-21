package CollectionsDemo.MapsDemo;

import java.util.HashMap;

public class HasMapDemo {

    public static void main(String[] args) {
        HashMap hm = new HashMap<>();

        hm.put(102,"sam");
        hm.put(342,"peter");
        hm.put(111,"tom");
        hm.put(222,"harry");
        hm.put(136,"jonson");
        hm.put('c',"sam");
        hm.put('f',true);
        hm.put(12.89,12);
        hm.put('c',"sameer");
        hm.put('d',"sameer");
        hm.put(null,null);
        hm.put(11,null);
        hm.put(22,null);
        hm.put(null,"amol");


        System.out.println(hm);

    }
}
