public class TwoSum {
    public static int findSumPairs(int[] arr, int target) {
        int count = 0;
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                count++;
                left++;
                right--;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {-5, -3, -1, 2, 4, 5, 7, 9, 11, 13};
        int target = 6;
        System.out.println(findSumPairs(arr, target)); 

        
    }
}
