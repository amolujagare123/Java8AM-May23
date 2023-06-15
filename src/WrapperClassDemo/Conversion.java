package WrapperClassDemo;

public class Conversion {

    public static void main(String[] args) {

        String s1= "11";
        String s2 = "22";
        System.out.println(s1+s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println(i1+i2);

        String s3= "11.56";
        String s4 = "45.22";
        System.out.println(s3+s4);

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);
        System.out.println(f1+f2);

        String s5 = "false";
        boolean result = Boolean.parseBoolean(s5);

        if(result)
            System.out.println("this is true");
        else
            System.out.println("this is false");

        String char1 = "a";
        char ch = char1.charAt(0);

        System.out.println("ch="+ch);



    }
}
