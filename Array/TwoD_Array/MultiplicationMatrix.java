package TwoD_Array;

import java.util.Scanner;

public class MultiplicationMatrix {

    static void MatrixMultiplication(int[][] mat1, int r1,int c1, int[][] mat2, int r2, int c2)
    {
        if(c1!=r2)
        {
            System.out.println("Ensure the r1 and c2 is equal: ");
            return;
        }

        int[][] mul = new int[r1][c2];

        System.out.print("[ ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    mul[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for(int[] m : mul)
        {
            for(int n : m)
            {
                System.out.print(n+" ");
            }
        }

        System.out.print(" ]");


    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of rows you want to enter: ");
        int r = s.nextInt();

        System.out.println("Enter the value of columns you want to enter: ");
        int c = s.nextInt();

        int[][] arr1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter " + (i + 1) + " row " + (j + 1) + " value: ");
                arr1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the value of rows you want to enter: ");
        int r1 = s.nextInt();

        System.out.println("Enter the value of columns you want to enter: ");
        int c1 = s.nextInt();
        int[][] arr2 = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Enter " + (i + 1) + " row " + (j + 1) + " value: ");
                arr2[i][j] = s.nextInt();
            }
        }

        s.close();
        MatrixMultiplication(arr1,r,c,arr2,r1,c1);

    }
}
