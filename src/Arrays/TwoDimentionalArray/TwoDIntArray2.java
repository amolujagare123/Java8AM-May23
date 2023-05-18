package Arrays.TwoDimentionalArray;

public class TwoDIntArray2 {

    public static void main(String[] args) {

        int[][] a = new int[2][4];

        a[0][0]=12;
        a[0][1]=14;
        a[0][2]=16;
        a[0][3]=17;



        System.out.println("row="+a.length);
        System.out.println("col="+a[0].length);

         for (int i=0;i<a.length;i++) // row = 4
         {
             for (int j=0;j<a[0].length;j++) // col = 3
             {
                 System.out.print(a[i][j]+"\t");
             }
             System.out.println();
         }


    }
}
