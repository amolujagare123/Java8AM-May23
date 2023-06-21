package CollectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        
        ts.add("Jicky");
        ts.add("Kavita");
        ts.add("Satish");
        ts.add("Anirban");
        ts.add("Amol");
        System.out.println(ts.add("Amol"));

        System.out.println(ts);
    }
}
