import java.util.Scanner;

public class ReturnAllIndexOfElementPresent {
    static void checkElement(int[] arr, int idx, int x) {
        if (idx == arr.length)
            return ;

        if (arr[idx] == x)
            System.out.println(idx);

        checkElement(arr, idx + 1, x);
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

        checkElement(arr,0, x);

    }
}
