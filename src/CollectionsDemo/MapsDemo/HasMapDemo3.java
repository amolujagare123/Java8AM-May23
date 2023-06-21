package CollectionsDemo.MapsDemo;

import java.util.HashMap;

public class HasMapDemo3 {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        System.out.println(hm.isEmpty()); //true

        hm.put(102,"sam");
        hm.put(342,"peter");
        hm.put(111,"tom");
        hm.put(222,"harry");
        hm.put(136,"jonson");
        System.out.println(hm.isEmpty()); // false
        System.out.println("hm="+hm);
        System.out.println("size="+hm.size());



        System.out.println(hm.get(136));

        hm.remove(111);
        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(111));

        System.out.println(hm.containsValue("harry"));

        hm.clear();

        System.out.println("=After clear=");
        System.out.println("hm="+hm);


    }
}
