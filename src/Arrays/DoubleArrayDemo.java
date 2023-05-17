package Arrays;

public class DoubleArrayDemo {

    public static void main(String[] args) {

        double[] d = new double[6];

        d[0] = 1.3;
        d[1] = 5.6;
        d[2] = 4.5;
        d[3] = 1.1;
        d[4] = 3.4;
        d[5] = 7.8;

        System.out.println("length="+d.length);

        for (int i=0;i<d.length;i++)
           System.out.println(d[i]);
    }
}
