import java.util.Scanner;

public class LastOccurenceArray {
     static int lastOccurrence(int[] arr, int x)
     {
         int lastIndex =-1;
         for(int i = 0; i < arr.length; i++)
         {
             if(arr[i]==x)
             {
                 lastIndex = i;
             }
         }
         return lastIndex;
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

        System.out.println(lastOccurrence(arr,x));
    }
}
