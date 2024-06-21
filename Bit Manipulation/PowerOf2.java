import java.util.Scanner;

public class PowerOf2 {

    static boolean isPow2(int n)
    {
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter any number: ");
            int n = s.nextInt();

            System.out.println(n+ " is power of 2: "+ isPow2(n));

            s.close();
    }
}
