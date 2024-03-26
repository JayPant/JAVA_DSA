package ArrayList;

import java.util.ArrayList;

public class ArrayListImplementation {

    public static void main(String[] args) {
//  1.    creating ArrayList

        ArrayList <Integer> l1= new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        System.out.print("printing an element at index i(3): ");
        System.out.print(l1.get(3)+ "\n");

//  3.      traversing ArrayList
//        for(int i=0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));
//        }
//        or
//        for (Integer i : l1) {
//            System.out.println(i);
//        }



        System.out.print("printing arraylist directly: ");
        System.out.print(l1+ "\n");


//   5.
        System.out.print("adding element at some index i: ");
    l1.add(2,10);
        System.out.print(l1+ "\n");

//   6.
        System.out.print("modifying element at some index i: ");
        l1.set(2,20);
        System.out.print(l1+ "\n");

//   7.
        System.out.print("removing an element an any index i: ");
        l1.remove(2);
        System.out.print(l1+ "\n");


//   8.
        System.out.print("removing an element e: ");
        l1.remove(Integer.valueOf(5));
        System.out.print(l1+ "\n");


//   9.
        System.out.print("checking if 3 exists or not: ");
    boolean ans = l1.contains((3) );
        System.out.print(ans+ "\n" );



    }





}
