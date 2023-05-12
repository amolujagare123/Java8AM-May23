package loops;

public class incrementPrePost {

    public static void main(String[] args) {

        int a = 10;

        System.out.println(a); // 10
        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++a); // 12
        System.out.println(a); // 12

/*a++ / a- - (post increment or decrement operators)
        First statement is executed then increment or decrement happens.

++a / - -a (pre increment or decrement operators)
        First increment or decrement happens then statement is executed.
*/
    }
}
