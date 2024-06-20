import java.util.Scanner;

public class SelectionSort {


    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min] > arr[j])
                {
                    min=j;
                }
            }

        int temp=arr[min];
        arr[min]=arr[i];
        arr[i] = temp;

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