package CollectionsDemo.VectorsDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {


    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("amol");
        v.add("Ashish");
        v.add("amol");
        v.add("Jicky");
        v.add("Kavita");
        v.add("Nutesh");

        System.out.println("====== Printing using for loop ======");

        for (int i=0;i<v.size();i++)
            System.out.println(v.get(i));

        System.out.println("====== Printing using for each loop ======");

        for (String x:v)
            System.out.println(x);

        System.out.println("====== Printing using Iterator ======");

        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("====== Printing using Enumeration ======");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());


    }
}
