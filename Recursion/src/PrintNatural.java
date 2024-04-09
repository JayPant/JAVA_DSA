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
        int n=5;
        printN(n);
    }
}


