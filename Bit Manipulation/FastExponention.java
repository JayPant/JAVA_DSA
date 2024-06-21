import java.util.Scanner;

public class FastExponention {

    static int pow(int a, int n)
    {
        int ans =1;

        while(n>0)
        {
            if((n&1)!=0) ans =ans*a;

            a=a*a;
            n=n>>1;
        }

        return ans;
    }
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter base number: ");
            int a = s.nextInt();

            System.out.println("Enter power ");
            int n = s.nextInt();

            System.out.println(a+" pow "+n +" is "+pow(a, n));

    }   
          
}
