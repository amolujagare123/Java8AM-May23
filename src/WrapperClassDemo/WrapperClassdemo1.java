package WrapperClassDemo;

public class WrapperClassdemo1 {

    public static void main(String[] args) {

        int i =5;
        System.out.println("i="+i); // 5

        Integer ii1 = new Integer(i);
        Integer ii2 = new Integer(5);

        System.out.println("ii1="+ii1); // 5
        System.out.println("ii2="+ii2); // 5 - wrapping / boxing

        Integer ii3 = 5;
        Integer ii4 = i;

        System.out.println("ii1="+ii3); // 5
        System.out.println("ii2="+ii4); // 5 auto wrapping / auto boxing
    }
}
