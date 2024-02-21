import java.util.Scanner;

public class KRotationInArray {
    static void rotateArray(int[] arr)
    {
//        int temp = arr[0];
//        for(int i=0;i<arr.length-1; i++)
//        {
//            arr[i]=arr[i+1];
//        }
//        arr[arr.length-1]= temp;
        int n = arr.length-1;
        int i = n;
        int temp = arr[n];
         while(i>0)
         {
             arr[i]=arr[i-1];
             i--;
         }
         arr[i]= temp;

    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = s.nextInt();
        k = k % arr.length;

        while(k>0) {
            rotateArray(arr);
            k--;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
