package TwoD_Array;

import java.util.Scanner;

public class UserInput2DArray {

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
        System.out.println("Enter the value of rows you want to enter: ");
        int r = s.nextInt();

        System.out.println("Enter the value of columns you want to enter: ");
        int c = s.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter "+(i+1)+" row "+(j+1) +" value: ");
                arr[i][j] = s.nextInt();
            }
        }

        printArray(arr);
    }
}
