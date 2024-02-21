public class ArrayOfSquares {

    public static void main(String[] args) {
        int[] arr = {-10,-3,-2,1,4,5};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*arr[i];
        }

        int left=0,right = ans.length-1;
//
        int k=0;
        while(left<=right)
        {
            if(arr[left]>arr[right])
            {
                ans[k++] =arr[left];
                left++;

            }else{
                ans[k++] =arr[right];
                right--;

            }
        }

        for (int j : ans)
        {
            System.out.print(j+ " ");
        }
    }
}
