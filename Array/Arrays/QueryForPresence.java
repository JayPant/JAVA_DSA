import java.util.Scanner;

public class QueryForPresence  {
    static void checkFrequency(int[] arr, int v)
    {
      if(arr[v]>0)
      {
          System.out.println("Yes");
      }else{
          System.out.println("No");
      }
    }

    public static void main(String[] args) {
        int[] arr= {5,6,5,400,560,1000,400};
        int[] f_a = new int[100001];
        for (int j : arr) {
            f_a[j]++;
        }

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number of queries: ");
        int query= s.nextInt();
        int value;

        while(query>0)
        {
            System.out.println("Enter the value to check: ");
            value= s.nextInt();
            checkFrequency(f_a,value);
            query--;
        }

    }
}
