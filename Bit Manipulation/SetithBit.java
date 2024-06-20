import java.util.Scanner;

public class SetithBit {

        static int setIth(int n, int i)
        {
            int bitmask= 1<<i;

            return n|bitmask;
        }
         public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter any number: ");
            int n = s.nextInt();

            System.out.println("Enter ith place:  ");
            int i = s.nextInt();

            System.out.println(setIth(n, i));

            s.close();
    }
}
