import java.util.Scanner;

public class TraverseArray {
    static void traverseArray(int[] arr, int curr_indx)
    {
        if(curr_indx==arr.length)
        {
//            System.out.println(arr[arr.length-1]);
            return;
        }

        System.out.println(arr[curr_indx]);
        traverseArray(arr,curr_indx+1);
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

        traverseArray(arr, 0);
    }
}
