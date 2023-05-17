package Arrays;

public class InCharDemo {

    public static void main(String[] args) {

        int[] ch = new int[6];

        ch[0] = 'h';
        ch[1] = 'k';
        ch[2] = 'j';
        ch[3] = 'l';
        ch[4] = 'm';
        ch[5] = 'd';

        System.out.println("length="+ch.length);

        for (int i=0;i<ch.length;i++)
           System.out.println(ch[i]);
    }
}
