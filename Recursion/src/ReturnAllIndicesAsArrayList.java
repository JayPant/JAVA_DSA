import java.util.ArrayList;
import java.util.Scanner;

public class ReturnAllIndicesAsArrayList {
    static ArrayList<Integer> checkElement(int[] arr, int idx, int x) {

        ArrayList <Integer> list = new ArrayList<>();

        if (idx == arr.length)
            return new ArrayList<Integer>();

        if (arr[idx] == x)
            list.add(idx);

        ArrayList<Integer> list2 = checkElement(arr, idx + 1, x);

        list.addAll(list2);

        return  list;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();

        System.out.println("Enter "+ size +" elements in the array:");
        int[] arr = new int[size];
        for(int i= 0; i<size; i++)
        {
            arr[i]= s.nextInt();
        }

        System.out.println("Enter Target");
        int x = s.nextInt();

       ArrayList <Integer> ans = checkElement(arr,0, x);

       for (Integer i : ans)
       {
           System.out.println(i);
       }

    }
}
