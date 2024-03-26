package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    static  void ReverseList(ArrayList <Integer>l1)
    {
        int i=0,j= l1.size()-1;

        while(i<j)
        {
           Integer temp = l1.get(i);
           l1.set(i,l1.get(j));
           l1.set(j,temp);
           i++;
           j--;
        }
    }
    public static void main(String[] args) {

        ArrayList <Integer> l = new ArrayList<>();

        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);
        System.out.println( "ArrayList Before : "+ l);
//        ReverseList(l);

        Collections.reverse(l);//using Collections reverse method
        System.out.println( "ArrayList After : "+ l);

    }
}
