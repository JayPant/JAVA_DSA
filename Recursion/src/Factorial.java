import java.util.Scanner;

public class Factorial {
    static int findFactorial(int n)
    {
        if(n==0)
        {
            return 1;
        }

        return n * findFactorial(n-1);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        s.close();
        System.out.println(findFactorial(n));
    }
}
