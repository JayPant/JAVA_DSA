import java.util.Scanner;

public class IsSumSubArray {
    static int[] prefixSum(int[] arr)
    {
        for(int i =1 ; i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    static boolean isPartition(int[] arr)
    {
//        int check =0;
        for (int j : arr) {
//            check = 0;
//            check = ;
            if ((arr[arr.length - 1] - j) == j) {
                return true;
            }
        }
       return  false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element in array: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = s.nextInt();
        }
       int[] p_sum= prefixSum(arr);

        System.out.println("Array can be partitioned?- "+ isPartition(p_sum));
        for (int i : arr)
        {
            System.out.print(i+ " ");
        }

    }
}
