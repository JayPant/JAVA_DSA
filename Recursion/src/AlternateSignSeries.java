import java.util.Scanner;

public class AlternateSignSeries {

    static int findResult(int num)
    {
        if(num==0) return 0;

        if(num%2==0) return findResult(num-1) - num;

        else return findResult(num-1) + num;

    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();
        s.close();
        System.out.println(findResult(num ));
    }
}
