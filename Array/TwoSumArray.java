import java.util.Scanner;

public class TwoSumArray {

    static int returnNumOfPair(int[] arr, int x)
    {
        int count=0;
        for(int i =0 ; i<arr.length; i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]== x)
                {
                    count++;
                }
            }
        }
        return count;
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

        System.out.println("Enter Target");
        int x = s.nextInt();
//
        System.out.println(returnNumOfPair(arr,x));
    }
}
