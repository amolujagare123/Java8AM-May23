package StringsDemo;

public class SplitDemoWithEndswith {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        // print only the words that ends with 'y'

        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length ;i++)
        {
            String currentString = stArr[i];

            if (currentString.endsWith("y"))
                System.out.println(stArr[i]);
        }

    }
}
