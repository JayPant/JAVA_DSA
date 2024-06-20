package TwoD_Array;

import java.util.Scanner;

public class Main {
    static void MatrixMultiplication(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2)
    {
        if(r1!=c2)
        {
            System.out.println("Can't Mutiply");
        }

        int[][] mult = new int [r2][c1];

        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c1;j++)
            {
                for(int k=0;k<c2;k++)
                {
                    mult[i][j] = arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int[] m : mult)
        {
            for(int n : m)
            {
                System.out.print(n+" ");
            }
        }
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
