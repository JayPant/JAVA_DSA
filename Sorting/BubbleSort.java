import java.util.Scanner;

public class BubbleSort {
    
    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swap= false;
            for(int j=0;j<arr.length-1-i;j++)
            { 
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swap =true;
                }
            }
            if(!swap)
                {
                    break;
                }
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
