package TwoD_Array;

import java.util.Scanner;

public class RectangleSumPrefixSum {
    static void prefixSum2D(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++)
        {
            for(int j=1; j< c; j++)
            {
                arr[i][j]+= arr[i][j-1];
            }
        }
    }

    static void rectangleSum(int[][] arr , int l1,int r1, int l2, int r2)
    {
        prefixSum2D(arr);
        int sum = 0;
         for(int i= l1; i<=l2; i++)
         {
             if(r1>=1) {
                 sum += arr[i][r2] - arr[i][r1 - 1];
             }else{
                 sum += arr[i][r2];
             }
         }
        System.out.println("Sum is: "+ sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of rows you want to enter: ");
        int r = s.nextInt();

        System.out.println("Enter the value of columns you want to enter: ");
        int c = s.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i <  r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter " + (i + 1) + " row " + (j + 1) + " value: ");
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the value of l1 and r1 : ");
        int l1 = s.nextInt();
        int r1 = s.nextInt();

        System.out.println("Enter the value of l2 and r2: ");
        int l2 = s.nextInt();
        int r2 = s.nextInt();

        rectangleSum(arr, l1,r1,l2,r2);


    }
}

