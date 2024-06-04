public class TrappingRainwater {

    public static void main(String[] args) {
        int[] height ={4,2,0,6,3,2,5};
        int n= height.length-1;

        

        int[] maxLeft = new int[n+1];
        int[] maxRight = new int[n+1];

        maxLeft[0]= height[0];
        for(int i=1;i<=n;i++)
        {
            maxLeft[i]= Math.max(maxLeft[i-1],height[i]);
        }


        maxRight[n]=height[n];
        for(int i=n-1;i>=0;i--)
        {
            maxRight[i]= Math.max(maxRight[i+1],height[i]);

        }

        int vol = 0;

        for(int i=0;i<=n;i++)
        {
            vol+= Math.min(maxLeft[i],maxRight[i]) - height[i];
        }

        System.out.println("Total water trapped is "+ vol);

    }
}
