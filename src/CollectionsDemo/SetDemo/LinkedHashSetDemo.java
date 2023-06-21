package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        lhs.add("Jicky");
        lhs.add("Kavita");
        lhs.add("Satish");
        lhs.add("Anirban");
        lhs.add("Amol");
        System.out.println(lhs.add("Amol"));

        System.out.println(lhs);
    }
}
