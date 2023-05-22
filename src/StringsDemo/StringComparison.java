package StringsDemo;

public class StringComparison {

    public static void main(String[] args) {

        String str1 = "Kavita";
        String str2 = "Kavita";
        String str3 = "kavita";
        String str4 = "abcd";

        /*int a = 20 ;
        int b = 20 ;

        System.out.println(a==b);
*/
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str4));

    }
}
