package ExceptionHandling;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 13;
            a[1] = 56;
            a[2] = 45;
            a[3] = 11;
            a[4] = 34;
            a[5] = 78;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
        }

        System.out.println("length="+a.length);

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
