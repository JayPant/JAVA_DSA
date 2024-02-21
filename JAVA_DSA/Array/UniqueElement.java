import java.util.Scanner;

public class UniqueElement {

    static  int returnUnique(int[] arr)
    {
        int unique=-1;
        for (int j : arr) {
            for (int k : arr) {
                if (j == k) {
                    break;
                } else {
                    unique = j;
                }
            }
        }
        return unique;
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

        System.out.println("Unique element is: "+returnUnique(arr));
    }
}
