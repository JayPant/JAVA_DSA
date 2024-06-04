package TwoD_Array;

import java.util.Scanner;

public class AdditionMatrix {
    static void printArray(int[][] arr)
    {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void add(int[][] arr1, int r1, int c1, int[][] arr2 , int r2, int c2)
    {
         if(r1!=r2 || c1!=c2)
         {
             System.out.println("Wrong input addition can't be possible ");
             return;
         }
        int[][] sum= new int[r1][c1];

         for(int i=0;i<sum.length;i++)
         {
             for (int j = 0; j < sum[i].length; j++) {
                 sum[i][j]= arr1[i][j]+arr1[i][j];
             }
         }
        System.out.println("Sum of the matrix 1 and 2: ");
         printArray(sum);
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

        add(arr1,r,c,arr2,r1,c1);
        s.close();

    }
}
