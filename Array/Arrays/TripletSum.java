import java.util.Scanner;

public class TripletSum {

    static int countTriplets(int[] arr, int x)
    {
        int count =0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++ )
            {
                for(int k = i+2; k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]== x)
                    {
                        count++;
                    }
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
        System.out.println(countTriplets(arr,x));
    }
}

