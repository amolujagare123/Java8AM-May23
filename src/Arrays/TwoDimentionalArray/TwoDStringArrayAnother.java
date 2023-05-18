package Arrays.TwoDimentionalArray;

public class TwoDStringArrayAnother {

    public static void main(String[] args) {

        String[][] stArr = {
                {"Priya","Radhey","Ravi"},
                {"Saba","Satish","Shashi"},
                {"Sundarmala","Venkat","Amol"},
                {"Rohit","Rahul","Vaibhav"},
                {"Vaishali","Sneha","Pranali"}
        };


        System.out.println("row="+stArr.length);
        System.out.println("col="+stArr[0].length);

         for (int i=0;i<stArr.length;i++) // row = 4
         {
             for (int j=0;j<stArr[0].length;j++) // col = 3
             {
                 System.out.print(stArr[i][j]+"\t");
             }
             System.out.println();
         }


    }
}
