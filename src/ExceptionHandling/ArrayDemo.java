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
        catch (ArithmeticException e)
        {
            System.out.println("inside catch ArithmeticException");
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (RuntimeException e)
        {
            System.out.println("inside catch RuntimeException");
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("inside catch Exception");
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("length="+a.length);

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
