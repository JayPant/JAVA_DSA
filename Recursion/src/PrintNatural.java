import java.util.Scanner;

public class PrintNatural {
    static void printN(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }

        printN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n= s.nextInt();
        printN(n);
    }
}


