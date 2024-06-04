import  java.util.*;
public class RemoveOccurencesInString {

    static String removeOccur(String str, int idx , char t)
    {
        if(idx == str.length() )
            return "";

        if(str.charAt(idx) != t) {
          return str.charAt(idx) + removeOccur(str,idx+1,t);
        }else
        {
            return removeOccur(str,idx+1,t);
        }


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter String: ");
        String str = s.next();

        System.out.println("enter character to remove: ");
         char c = s.next().charAt(0);
        System.out.println(removeOccur(str,0,c));
    }
}
