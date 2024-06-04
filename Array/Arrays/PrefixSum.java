public class PrefixSum {
    public static void main(String[] args) {
        int[] arr= {2,1,3,4,5};
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        for(int j : arr)
        {
            System.out.print(j+" ");
        }
    }
}
