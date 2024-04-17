import java.util.Scanner;

public class ReturnIndexIfElementIsPresent {
    static int checkElement(int[] arr, int idx, int x) {
        if (idx == arr.length-1)
            return arr[idx];

        if (arr[idx] == x)
            return idx;

        return checkElement(arr, idx + 1, x);
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

        System.out.println("Index of the Element is:  "+checkElement(arr,0, x));

    }
}
