import java.util.Scanner;

public class MinCostFrogJump {

    static int minCost(int[] height, int idx)
    {
        if(idx == height.length - 1) return 0;
        int op1= Math.abs(height[idx]-height[idx+1]) + minCost(height,idx+1);

        if(idx == height.length - 2) return op1;
        int op2= Math.abs(height[idx]-height[idx+2]) + minCost(height,idx+2);


        return Math.min(op1,op2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();

        System.out.println("Enter "+ size +" elements in the array:");
        int[] height = new int[size];
        for(int i= 0; i<size; i++)
        {
            height[i]= s.nextInt();
        }

        System.out.println(("Minimum code to jump for frog: "+minCost(height,0)));

    }
}
