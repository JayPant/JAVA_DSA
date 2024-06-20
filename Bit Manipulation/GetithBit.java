import java.util.Scanner;

public class GetithBit {

     static int getIth(int n, int p)
     {
        int bitmask = 1<<p;

         if((n & bitmask )== 0)
          {return 0;}
         else
         {return 1;}
     }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = s.nextInt();

        System.out.println("Enter ith place:  ");
        int i = s.nextInt();

        System.out.println(n+" "+ i+"th bit " +"is "+ getIth(n, i));

        s.close();
    }
}
