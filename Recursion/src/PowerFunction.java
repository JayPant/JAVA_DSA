import java.util.Scanner;

public class PowerFunction {
    static int pow(int p , int q)
    {
        if(q==0)
        {
            return 1;
        }

//        return pow(p,q-1) * p;       -> O(n)

        int smallpow= pow(p,q/2);
        if(q%2==0)
        {
            return smallpow*smallpow;
        }
                                                       
        return smallpow*smallpow*p;   // -> O(log n)

    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter Base: ");
        int base = s.nextInt();

        System.out.println("enter Exponential: ");
        int exp = s.nextInt();
        System.out.println("Power is "+ pow(base,exp));
    }
}
