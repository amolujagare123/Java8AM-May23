package CollectionsDemo.SetDemo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Jicky");
        hs.add("Kavita");
        hs.add("Satish");
        hs.add("Anirban");
        hs.add("Amol");
        System.out.println(hs.add("Amol"));

        System.out.println(hs);
    }
}
