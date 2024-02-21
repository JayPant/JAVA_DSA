public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {12,32,43,34,54,45};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+= arr[i];
        }

        System.out.println(sum);
    }
}
