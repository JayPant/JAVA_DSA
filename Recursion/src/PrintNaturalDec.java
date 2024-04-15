import java.util.Scanner;

public class PrintNaturalDec {
    static void printDecreasing(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number: ");
        int n =s.nextInt();
        s.close();
        printDecreasing(n);
    }
}
