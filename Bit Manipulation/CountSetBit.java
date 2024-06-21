import java.util.Scanner;

public class CountSetBit {

    static int countBit(int n)
    {
        int count=0;

        while(n>0)
        {
            if((n&1) !=0) count++;

            n=n>>1;
        }

        return count;

    }
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter any number: ");
            int n = s.nextInt();

            System.out.println("Number of Set bits in "+n+" is "+ countBit(n));
            s.close();
    }
}
