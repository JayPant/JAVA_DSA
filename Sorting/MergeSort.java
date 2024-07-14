import java.util.Scanner;

/**
 * MergeSort
 */
public class MergeSort {

    public static void  sort(int[] arr, int start, int end){

        if(start>=end) return;

        int mid = start + (end-start)/2;

        sort(arr, start, mid);
        sort(arr, mid+1,end);
        merge(arr,start,mid,end);
 
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0; 
    
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
    
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
    
        while (j <= end) {
            temp[k++] = arr[j++];
        }
    
        for (i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }
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

        sort(arr,0,arr.length-1);
        print(arr);
    }
}
