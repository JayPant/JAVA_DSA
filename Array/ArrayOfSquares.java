public class ArrayOfSquares {

    public static void main(String[] args) {
        int[] arr = {-10,-3,-2,1,4,5};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*arr[i];
        }

        int left=0,right = ans.length-1;
//
        int k= ans.length-1;
        while(left<=right)
        {
            if(arr[left]>arr[right])
            {
                ans[k--] =arr[left];
                left++;

            }else{
                ans[k--] =arr[right];
                right--;

            }
        }
        for(int m : ans)
        {
            System.out.print
                    (m+" ");
        }


    }
}
