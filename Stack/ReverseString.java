import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static String revString(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }

        StringBuilder st = new StringBuilder();
        while(!s.isEmpty()){
            char value = s.pop();
            st.append(value);
        }

        return st.toString();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string to reverse");
        String str= s.next();
        s.close();

        System.out.println("String after reverse: "+revString(str));
    }
}
