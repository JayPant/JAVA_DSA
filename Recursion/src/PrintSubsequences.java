import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsequences {

    static void printSubsequences(String str , String currAns )
    {
        if(str.isEmpty())
        {
            System.out.print(currAns+" ");
            return;
        }
     char curr =  str.charAt(0);
     String rem_str = str.substring(1);
     printSubsequences(rem_str, currAns+curr);
     printSubsequences(rem_str, currAns);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter String: ");
        String str = s.next();

        printSubsequences(str, " ");


    }

}
