import java.util.Scanner;

public class ElementPresentInArray {
    static boolean checkElement(int[] arr, int idx, int x) {
        if (idx == arr.length)
            return false;

        if(arr[idx]==x)
            return true;

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

        if(checkElement(arr,0, x)){
            System.out.println("Yes");

        }else{
            System.out.println("No");

        }
    }
}
