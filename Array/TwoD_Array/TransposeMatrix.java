package TwoD_Array;

import java.util.Scanner;

public class TransposeMatrix {

    static void printArray(int[][] arr)
    {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void matrixTranspose(int[][] arr, int r, int c)
    {
        int[][] transpose= new int[c][r];
        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                transpose[i][j]= arr[j][i];
            }
        }

        printArray(transpose);
    }

    static void inplaceTranspose(int[][] arr, int r, int c)
    {
        for(int i=0;i<r;i++)
        {
            for (int j=i;j<c;j++)
            {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
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

        System.out.println("Matrix without transpose: ");
        printArray(arr);

        System.out.println("Matrix after transpose: ");
        inplaceTranspose(arr,r,c);
        printArray(arr);

    }
}
