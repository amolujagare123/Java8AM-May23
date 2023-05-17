package Arrays;

public class StringArrDemo {

    public static void main(String[] args) {

        String[] stArr = new String[6];

        stArr[0] = "amol";
        stArr[1] = "Nikhil";
        stArr[2] = "Radhey";
        stArr[3] = "Ashish";
        stArr[4] = "Avinash";
        stArr[5] = "Jicky";

        System.out.println("length="+stArr.length);

        for (int i=0;i<stArr.length;i++)
           System.out.println(stArr[i]);
    }
}
