package CollectionsDemo.VectorsDemo;

import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("size="+v.size()); // 0
        System.out.println("capacity="+v.capacity()); // 10

        v.add("amol");
        v.add("Ashish");
        v.add("amol");
        v.add("Jicky");
        v.add("Kavita");
        v.add("Nutesh");
        v.add("Ashish");
        v.add("amol");
        v.add("Jicky");
        v.add("Kavita");
        v.add("Kavita");
        v.add("amol");
        v.add("Jicky");
        v.add("Kavita");
        v.add("Nutesh");
        v.add("Ashish");
        v.add("amol");
        v.add("Jicky");
        v.add("Kavita");
        v.add("Kavita");
        v.add("Kavita");


        System.out.println("size="+v.size());// 21
        System.out.println("capacity="+v.capacity());// 40

        System.out.println(v);


    }
}
