public class FindFirstAndLastIndex {

    static int[] findFirstNdLast(int[] arr, int idx, int tar, int first, int last)
    {

        if(idx== arr.length)
            return new int[] {first,last};

        if(arr[idx] == tar)
        {
            if(first == -1) first =idx;

            last= idx;
        }

        return findFirstNdLast(arr,idx+1,tar, first,last);
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8, 8, 9, 6};
        int target = 6;
        int[] result = findFirstNdLast(arr, 0, target, -1, -1);
        System.out.println("First index: " + result[0]);
        System.out.println("Last index: " + result[1]);
    }
}
