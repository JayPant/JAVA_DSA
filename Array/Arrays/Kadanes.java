import java.util.Scanner;

class Kadanes {

    static void kadane(int[] num) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < num.length; i++) {
            cs += num[i];
            if (cs > ms) {
                ms = cs;
            }
            if (cs < 0) {
                cs = 0;
            }
        }

        System.out.println("Maximum subarray sum is: " + ms);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = s.nextInt();

        System.out.println("Enter " + size + " elements in the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        kadane(arr);
        s.close();
    }
}
