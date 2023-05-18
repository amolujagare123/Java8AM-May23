package Arrays.TwoDimentionalArray;

public class TwoDIntArrayAnother {

    public static void main(String[] args) {

       /* int[][] a = new int[4][3];

        a[0][0]=12;
        a[0][1]=14;
        a[0][2]=16;

        a[1][0]=32;
        a[1][1]=34;
        a[1][2]=36;

        a[2][0]=52;
        a[2][1]=54;
        a[2][2]=56;

        a[3][0]=72;
        a[3][1]=74;
        a[3][2]=76;*/


        int[][] a = {
                {12,14,16},
                {32,34,36},
                {52,54,56},
                {72,74,76},
                {92,94,96}
        };

      /*  int[][] a = {
                {12,14,16,11},
                {32,34,3},

        };
*/
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
