import java.util.Scanner;

public class CheckArraySorted {
    static boolean checkSorted(int[] arr)
    {
        boolean flag = true;
        for(int i = 1;i< arr.length;i++)
        {
            if(arr[i]< arr[i-1])
            {
                flag = false;
                break;
            }
        }
    return flag;
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

//        System.out.println("Enter Target");
//        int x = s.nextInt();
         if(checkSorted(arr)){
             System.out.println("Sorted");

         }else{
             System.out.println("not Sorted");

         }
    }
}
