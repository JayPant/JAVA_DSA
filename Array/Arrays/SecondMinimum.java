public class SecondMinimum {

    static int findMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i: arr)
        {
            if(i<min)
            {
                min =i;
            }
        }
        return min;
    }
    static int returnSecondMin(int[] arr)
    {
        int min= findMin(arr);
        for(int i = 0 ;i < arr.length; i++)
        {
            if(arr[i] == min)
            {
                arr[i]= Integer.MAX_VALUE;
            }
        }

        return findMin(arr);
    }

    public static void main(String[] args) {
        System.out.println("Second Minimum element is : "+ returnSecondMin(new int[] {12,12,13,1,4,15,18,17,19}));
    }
}
