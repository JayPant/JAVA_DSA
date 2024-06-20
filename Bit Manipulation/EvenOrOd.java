import java.util.Scanner;

/**
 * EvenOrOd
 */
public class EvenOrOd {

    static boolean isEven(int n)
    {
        int bitmask =1;

        if((n & bitmask) == 0) return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = s.nextInt();

        if(isEven(n)){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }

        s.close();
    }
}