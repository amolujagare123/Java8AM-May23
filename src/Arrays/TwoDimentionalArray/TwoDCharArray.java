package Arrays.TwoDimentionalArray;

public class TwoDCharArray {

    public static void main(String[] args) {

        char[][] ch = new char[4][3];

        /*ch[0][0]=12;
        ch[0][1]=14;
        ch[0][2]=16;

        ch[1][0]=32;
        ch[1][1]=34;
        ch[1][2]=36;

        ch[2][0]=52;
        ch[2][1]=54;
        ch[2][2]=56;

        ch[3][0]=72;
        ch[3][1]=74;
        ch[3][2]=76;*/

        ch[0][0]='a';
        ch[0][1]='b';
        ch[0][2]='c';

        ch[1][0]='d';
        ch[1][1]='e';
        ch[1][2]='f';

        ch[2][0]='g';
        ch[2][1]='h';
        ch[2][2]='i';

        ch[3][0]='j';
        ch[3][1]='k';
        ch[3][2]='l';

        System.out.println("row="+ch.length);
        System.out.println("col="+ch[0].length);

         for (int i=0;i<ch.length;i++) // row = 4
         {
             for (int j=0;j<ch[0].length;j++) // col = 3
             {
                 System.out.print(ch[i][j]+"\t");
             }
             System.out.println();
         }


    }
}
