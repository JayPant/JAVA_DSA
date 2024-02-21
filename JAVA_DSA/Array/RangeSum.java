import java.util.Scanner;

public class RangeSum {
//    static int returnSum(int l , int r , int[] arr)
//    {
//        int sum=0;
//        while(l<=r)
//        {
//            sum+= arr[l];
//            l++;
//        }
//        return sum;
//    }

    static int[] prefixSum(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            arr[i]= arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int n = s.nextInt();

        int[] arr = new int[n+1];
        System.out.println("enter the element in array: ");
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the number of queries: ");
        int query = s.nextInt();
        int ans;
         int[] pf_s = prefixSum(arr);
        while(query-- >0)
        {
            ans =0;
            System.out.println("Enter left range: ");
            int left = s.nextInt();
            System.out.println("Enter right range: ");
            int right = s.nextInt();
            ans = pf_s[right] - pf_s[left-1];
            System.out.println("Sum of the range is: "+ ans);
        }

    }
}

