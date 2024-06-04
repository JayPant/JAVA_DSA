import java.util.Scanner;

public class UniqueElement {

    static  int returnUnique(int[] arr)
    {
        int unique=-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i+1;j< arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        for(int i : arr)
        {
            if(i>0)
            {
                unique =i;
            }
        }
        return unique;
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

        System.out.println("Unique element is: "+returnUnique(arr));
    }
}
