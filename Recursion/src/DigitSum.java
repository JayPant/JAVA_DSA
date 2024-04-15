import java.util.Scanner;

public class DigitSum {
    static int findSum(int n)
    {

        if(n==0)
        {
            return 0;
        }
//        int lst_dig = n%10;

        return   n%10  +findSum(n/10) ;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int digit= s.nextInt();
        s.close();
        System.out.println("Sum is: "+ findSum(digit));
    }
}
