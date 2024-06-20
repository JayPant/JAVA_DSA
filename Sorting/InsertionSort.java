import java.util.Scanner;

public class InsertionSort {


    static void sort(int[] arr){
        for(int i=1;i<arr.length;i++)
        {
            int curr =arr[i];
            int prev =i-1;


            while(prev >=0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }

        print(arr);
    }

    static void print(int[] arr)
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
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
        s.close();
    }
}
