package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();

        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);
        System.out.println( "ArrayList Before : "+ l);

//        Collections.sort(l);
        l.sort(Collections.reverseOrder());
        System.out.println( "ArrayList After Sort: "+ l);


        ArrayList<String> str = new ArrayList<>();
        str.add("You");
        str.add("Can");
        str.add("Do");
        str.add("It");
        str.add("Keep it");
        str.add("Up");

        System.out.println( "ArrayList String Before : "+ str);

//        Collections.sort(l);
        Collections.sort(str, Collections.reverseOrder());
        System.out.println( "ArrayList String After Sort: "+ str);
    }
}
