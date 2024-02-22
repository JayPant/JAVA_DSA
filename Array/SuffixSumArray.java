public class SuffixSumArray {
    static void doSuffix(int[] arr)
    {
        int n = arr.length;
        for (int i = n-2; i>=0; i--) {
            arr[i]= arr[i+1]+arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr ={ 2,5,6,1,3};
    doSuffix(arr);
    for (int k : arr)
    {
        System.out.print(k + " ");
    }
    }
}
