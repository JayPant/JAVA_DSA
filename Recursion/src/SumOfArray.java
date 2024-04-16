import java.util.Scanner;

public class SumOfArray {
    static int findSum(int[] arr, int idx)
    {
        if(idx == arr.length-1)
        {
            return arr[idx];
        }

        return arr[idx] + findSum(arr, idx+1);
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

        System.out.println(findSum(arr, 0));
    }
}
