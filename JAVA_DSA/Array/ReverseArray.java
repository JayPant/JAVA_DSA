public class ReverseArray {

    static void reverseAnArray(int [] arr)
    {
        int i=0,j=arr.length-1;
         while(i<j)
         {
             arr[i] = arr[i] + arr[j];
             arr[j]=arr[i]-arr[j];
             arr[i]=arr[i]-arr[j];
             i++;
             j--;
         }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Array Before reversing: ");
        for(int k : arr)
        {
            System.out.print(k+ " ");
        }

//      using another array
//        int j=0;
//        int[] a_c= new int[arr.length];
//        for(int i= arr.length-1; i>=0;i--)
//        {
//            a_c[j++] = arr[i];
//        }



//      Using Two pointer
//
        reverseAnArray(arr);
        System.out.println("\nArray after reversing: ");
         for(int k : arr)
         {
             System.out.print(k+ " ");
         }
    }
}
