import java.util.Scanner;

public class KRotationInArray {

    static void swap(int[] arr, int l ,int r)
    {
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }

    static void reverse(int[] arr, int l , int r)
    {
        int left =l, right =r;
        while(left<right)
        {
            swap(arr, left, right);
            left++;
            right--;
        }
    
    }
    static void rotateArray(int[] arr, int k)
    {

        int n = arr.length;
        k = k% n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);


    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = s.nextInt();
        rotateArray(arr,k);
        for(int i : arr)
        {
            System.out.println(i+" ");
        }
    }
}
