public class MaxOfArray{
    public static void main(String[] args) {
        int[] arr = {15,32,65,12,45};
        int ans=0;
        for (int j : arr) {
            if (ans < j) {
                ans = j;
            }
        }

        System.out.println(ans);
    }
}