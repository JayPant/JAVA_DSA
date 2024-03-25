package TwoD_Array;

import java.util.Scanner;

public class RectangleSumColumnPrefixSum {
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

//        columns wise sum
        for(int j=0; j<c;j++)
        {
            for(int i=1;i<r;i++)
            {
                arr[i][j]+= arr[i-1][j];
            }
        }
    }

    static void rectangleSum(int[][] arr , int l1,int r1, int l2, int r2)
    {
        prefixSum2D(arr);
        int sum = 0;
        int up=0,left=0,leftup=0;
        int ans=0;

        sum= arr[l2][r2];
        if(l1>0)
        {
            up= arr[l1-1][r2];

        }
        if(r1>0)
        {
            left= arr[l2][r1-1];
        }

        if(l1>0 && r1 >0)
        {
            leftup= arr[l1-1][r1-1];
        }

        ans = sum-up-left-leftup;


        System.out.println("Sum is: "+ ans);
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
