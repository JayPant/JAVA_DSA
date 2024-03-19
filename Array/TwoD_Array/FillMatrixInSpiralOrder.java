package TwoD_Array;

import java.util.Scanner;

public class FillMatrixInSpiralOrder {

    static void printArray(int[][] arr)
    {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static  void fillInSpiralOrder(int[][] arr, int r, int c)
    {
        int topRow= 0, bottomRow= r-1;
        int leftCol=0, rightCol= c-1, elements=0;
        while(elements < r*c)
        {
//            topRow -> lc to rc
            for(int j= leftCol; j<=rightCol && elements <= (r*c) ;j++)
            {
                arr[topRow][j]= ++elements;
            }
            topRow++;

//            rightCol -> tR to bR
            for (int i = topRow; i<=bottomRow && elements <= r*c ;i++)
            {
                arr[i][rightCol]= ++elements;
            }
            rightCol--;

//             bottomRow -> rC to lC
            for (int j = rightCol; j >= leftCol && elements <= r*c ; j--) {
                arr[bottomRow][j]= ++elements;
            }
            bottomRow--;


//            leftCol -> bR to tR
            for (int i = bottomRow; i >= topRow && elements <= r*c ; i--) {
                arr[i][leftCol]= ++elements;
            }
            leftCol++;


        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n= s.nextInt();

        int[][] mat = new  int[n][n];
        fillInSpiralOrder(mat,n,n);

        System.out.println("Matrix after filling in spiral order: ");
        printArray(mat);


    }
}
