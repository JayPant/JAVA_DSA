import java.util.Scanner;

public class QuickSort {

    public static void sort(int[] arr, int start, int end) {
        if(start>=end) return;

        int pivotIndex = paritition(arr,start,end);
        sort(arr, start, pivotIndex-1);
        sort(arr, pivotIndex+1, end);
    }

    public static int paritition(int[] arr, int start, int end){

        int i = start-1;
        int pivot = arr[end];
        for(int j=start;j<end;j++){
            if(arr[j] <= pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[end]=arr[i];
        arr[i] = temp;

        return i;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();

        System.out.println("Enter " + size + " elements in the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        sort(arr, 0, arr.length - 1);
        print(arr);
    }
}
