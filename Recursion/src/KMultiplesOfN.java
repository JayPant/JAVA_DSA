import java.util.Scanner;

public class KMultiplesOfN {

    static void findMultiples(int num , int k)
    {
        if(k==1){
            System.out.println(num);
            return;
        }

        findMultiples(num,k-1);
        System.out.println(num*k);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = s.nextInt();

        System.out.println("enter the multiple");
        int multi= s.nextInt();
        findMultiples(num,multi);
    }
}
