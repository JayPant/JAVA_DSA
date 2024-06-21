import java.util.Scanner;

public class ClearRangeBits {

    static int clearRange(int n ,int i, int j)
    {
        int a = (~0) << j+1;
        int b = 1<<i-1;

        int bitmask= a|b;

        return n&bitmask;
    }
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter any number: ");
            int n = s.nextInt();

            System.out.println("Enter start range bit ");
            int i = s.nextInt();

            System.out.println("Enter end range bit ");
            int j = s.nextInt();

            System.out.println(clearRange(n,i,j));
            s.close();
    }
}
