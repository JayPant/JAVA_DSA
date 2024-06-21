import java.util.Scanner;

/**
 * ClearLastiBits
 */
public class ClearLastiBits {
    static int LastIbit(int n,int i)
    {
        int bitmask= (~0) << i;

        return n & bitmask;
    }
     public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter any number: ");
            int n = s.nextInt();

            System.out.println("Enter ith place:  ");
            int i = s.nextInt();

            System.out.println(LastIbit(n, i));

            s.close();
    }
}