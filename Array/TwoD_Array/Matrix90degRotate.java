package TwoD_Array;

import java.util.Scanner;

public class Matrix90degRotate {

    static void printArray(int[][] arr)
    {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void swap(int[][] arr,int i1,int j1,int i2,int j2)
    {
        int temp = arr[i1][j1];
        arr[i1][j1]=arr[i2][j2];
        arr[i2][j2]= temp;
    }

    static void revrseArray(int[] arr)
    {
        int l =0, r= arr.length-1;
        while(l<r)
        {
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            l++;
            r--;
        }
    }
    static void transpose(int[][] arr, int r , int c)
    {
        for(int i =0;i<r;i++)
        {
            for (int j=i; j<c; j++)
            {
                swap(arr, i,j,j,i);
            }
        }
    }

    static void rotate90deg(int[][] arr,int r,int c)
    {
        transpose(arr,r,c);
        for (int i=0;i<r;i++)
        {
            revrseArray(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of rows you want to enter: ");
        int r = s.nextInt();

        System.out.println("Enter the value of columns you want to enter: ");
        int c = s.nextInt();
        

        if(r!= c)
        {
            System.out.println("Rows need to be equal to Columns");
            return;
        }
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter " + (i + 1) + " row " + (j + 1) + " value: ");
                arr[i][j] = s.nextInt();
            }
        }
        s.close();


        System.out.println("Array before rotation: ");
        printArray(arr);
        rotate90deg(arr,r,c);
        System.out.println("Array after rotation: ");
        printArray(arr);

    }
}
