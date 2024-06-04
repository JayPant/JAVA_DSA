package TwoD_Array;

import java.util.Scanner;

public class PascalTriangle {

    static void printArray(int[][] arr)
    {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
         int n = s.nextInt();
         int[][] pascal = new int[n][];
         for(int i=0;i<n;i++)
         {
             pascal[i]= new int[i+1];
             pascal[i][0]= pascal[i][i]= 1;

             for(int j=1;j<i;j++)
             {

                 pascal[i][j]= pascal[i-1][j-1]+pascal[i-1][j];
             }
         }
        s.close();

         printArray(pascal);

    }
}
