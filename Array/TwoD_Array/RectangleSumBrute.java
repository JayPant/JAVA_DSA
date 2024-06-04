package TwoD_Array;

import java.util.Scanner;

public class RectangleSumBrute {
    static void SumOfRectangle(int[][] arr, int l1, int r1, int l2,int r2)
    {
        int sum=0;
        for(int i= l1; i<=l2; i++)
        {
            for(int j= r1; j<=r2;j++)
            {
                sum+= arr[i][j];
            }
        }
        System.out.println("Sum of the rectangle is : "+ sum);
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

        System.out.println("Enter the value of l2 and r2 : ");
        int l2 = s.nextInt();
        int r2 = s.nextInt();

        SumOfRectangle(arr,l1,r1,l2,r2);
        s.close();

    }
}
