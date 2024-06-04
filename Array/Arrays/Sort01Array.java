import java.util.Scanner;

public class Sort01Array {

    static  void swap(int[] arr,int i,int j)
    {
        arr[i]=arr[i] + arr[j];
        arr[j]= arr[i]-arr[j];
        arr[i]= arr[i]-arr[j];
    }
    static void usingTwoPointerSort(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;

        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }else if(arr[left]==0)
            {
                left++;
            } else if (arr[right]==1) {
                right--;
            }

        }
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the 0's and 1's in array: ");
        for(int i =0 ;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        usingTwoPointerSort(arr);

//        int count=0;
//        for(int i : arr)
//        {
//            if(i>0)
//            {
//                count++;
//            }
//        }
//
//        for(int i=0;i<arr.length;i++)
//        {
//            if(i<count)
//            {
//                arr[i]=0;
//            }else{
//                arr[i]=1;
//            }
//        }

        for (int j : arr)
        {
            System.out.print(j+" ");
        }
    }
}
