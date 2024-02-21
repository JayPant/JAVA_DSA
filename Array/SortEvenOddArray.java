public class SortEvenOddArray {
    static  void swap(int[] arr,int i,int j)
    {
        arr[i]=arr[i] + arr[j];
        arr[j]= arr[i]-arr[j];
        arr[i]= arr[i]-arr[j];
    }
    static void returnSortArray(int[] arr)
    {
        int left =0,right = arr.length-1;
        while(left<right)
        {
            if((arr[left]%2==1)&&(arr[right]%2==0))
            {
                swap(arr,left,right);
                left++;
                right--;
            } else if(arr[left]%2==0)
            {
                left++;
            }else if(arr[right]%2==                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     1)
            {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,35,32,1,2,43,55,6,74};
        returnSortArray(arr);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}
