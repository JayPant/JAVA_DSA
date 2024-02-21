import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargestArray {
    static int[] returnArray(int[] arr, int k)
    {
        Arrays.sort(arr);
        int[] res_array = new int[2];
        res_array[0]= arr[k-1];
        res_array[1]= arr[arr.length-k];

        return  res_array;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();

        System.out.println("Enter "+ size +" elements in the array:");
        int[] arr = new int[size];
        for(int i= 0; i<size; i++)
        {
            arr[i]= s.nextInt();
        }

        System.out.println("Enter kth value");
        int k = s.nextInt();

        int[] result_arr= (returnArray(arr,k));
        System.out.print("[ ");

        for( int i : result_arr)
        {
            System.out.print(i+" ");

        }
        System.out.print(" ]");

    }
}
