import java.util.Objects;
import java.util.Scanner;

public class StringPalindrome {
    static String reverse(String str, int idx)
    {
        if(idx<0) return "";

        return str.charAt(idx) + reverse(str,idx-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter String: ");
        String str = s.next();

        if(Objects.equals(str, reverse(str, str.length() - 1))) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }

}
