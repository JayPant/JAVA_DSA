import java.util.Scanner;

public class SumOfAllSubsets {
    static void subsetSum(int[] arr, int idx, int currsum)
    {
        if(idx >=arr.length)
        {
            System.out.println(currsum);
            return;
        }

        subsetSum(arr, idx+1, currsum+arr[idx]);
        subsetSum(arr, idx+1, currsum);

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
        subsetSum(arr,0,0);
    }
}
