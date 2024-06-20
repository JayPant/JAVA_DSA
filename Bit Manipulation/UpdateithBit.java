import java.util.Scanner;

public class UpdateithBit {
    static int ClearIth(int n , int i)
    {
        int bitmask = ~(1<<i);

        return n & bitmask;
    }

    static int setIth(int n, int i)
        {
            int bitmask= 1<<i;

            return n|bitmask;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter any number: ");
            int n = s.nextInt();

            System.out.println("Enter ith bit ");
            int i = s.nextInt();

            System.out.println("Enter bit to set 0 or 1 ");
            int b = s.nextInt();

            if(b==0)
            {System.out.println(setIth(n, i));}

            if(b==1)
            {System.out.println(ClearIth(n, i));}
            s.close();
    }
}
