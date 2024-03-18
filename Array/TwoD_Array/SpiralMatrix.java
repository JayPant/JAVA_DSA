package TwoD_Array;

import java.util.Scanner;

public class SpiralMatrix {

    static void printArray(int[][] arr)
    {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static  void printSpiralorder(int[][] arr, int r, int c)
    {
        int topRow= 0, bottomRow= r-1;
        int leftCol=0, rightCol= c-1, elements=0;
        while(elements < r*c)
        {
//            topRow -> lc to rc
            for(int j= leftCol; j<=rightCol;j++)
            {
                System.out.print(arr[topRow][j]+" ");
                elements++;
            }
            topRow++;

//            rightCol -> tR to bR
             for (int i = topRow; i<=bottomRow;i++)
             {
                 System.out.print(arr[i][rightCol]+" ");
                 elements++;
             }
             rightCol--;

//             bottomRow -> rC to lC
            for (int j = rightCol; j >= leftCol; j--) {
                System.out.print(arr[bottomRow][j]+" ");
                elements++;
            }
            bottomRow--;


//            leftCol -> bR to tR
            for (int i = bottomRow; i >= topRow; i--) {
                System.out.print(arr[i][leftCol]+" ");
                elements++;
            }
            leftCol++;


        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of rows you want to enter: ");
        int r = s.nextInt();

        System.out.println("Enter the value of columns you want to enter: ");
        int c = s.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter " + (i + 1) + " row " + (j + 1) + " value: ");
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("Your Array is: ");
        printArray(arr);

        System.out.println("Spiral order of matrix is: ");
        printSpiralorder(arr,r,c);
    }
}
