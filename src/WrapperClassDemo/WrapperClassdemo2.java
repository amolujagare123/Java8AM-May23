package WrapperClassDemo;

public class WrapperClassdemo2 {

    public static void main(String[] args) {

        Integer ii1 = new Integer(5);
        Integer ii2 = 10;
        System.out.println("ii1="+ii1);

        int i1 = ii1.intValue(); // unwrapping /  unboxing
        System.out.println("i1="+i1);


        int i2 = ii1; // auto unwrapping /  auto unboxing
        System.out.println("i2="+i2);

    }
}
