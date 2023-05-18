package Arrays.TwoDimentionalArray;

public class TwoDStringArray {

    public static void main(String[] args) {

        String[][] stArr = new String[4][3];


        stArr[0][0]="Anirban";
        stArr[0][1]="Annapurna";
        stArr[0][2]="Ashish";

        stArr[1][0]="Avinash";
        stArr[1][1]="Dnyneshwar";
        stArr[1][2]="Kavita";

        stArr[2][0]="Mahesh";
        stArr[2][1]="Nagma";
        stArr[2][2]="Nikhil";

        stArr[3][0]="Nutesh";
        stArr[3][1]="Pevendra";
        stArr[3][2]="Piyush";

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
