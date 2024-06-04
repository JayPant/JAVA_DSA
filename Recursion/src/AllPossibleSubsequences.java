import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AllPossibleSubsequences {


    static ArrayList<String> subsequence(String str)
    {
        ArrayList<String> st = new ArrayList<>();

        if(str.isEmpty())
        {
             st.add("");
             return st;
        }
        char curr = str.charAt(0);
        ArrayList<String> substring= subsequence(str.substring(1));

        for(String s : substring)
        {
            st.add(s);
            st.add(curr+s);
        }

        return st;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter String: ");
        String str = s.next();

        ArrayList <String> result = subsequence(str);

        for( String st : result)
        {
            System.out.println(st);
        }
    }
}
