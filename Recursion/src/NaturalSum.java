import java.util.Scanner;

public class NaturalSum {
     static int findSum(int num)
     {
         if(num == 0) {
             return 0;
         }

         return findSum(num-1) + num;

     }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();
        s.close();

        System.out.println(findSum(num));
    }
}
