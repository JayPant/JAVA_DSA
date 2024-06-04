public class FirstValueRepeated {
    static int returnFirstRepeat(int[] arr)
    {
//        int repeat;
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("First Value Repeating is: "+ returnFirstRepeat(new int[] {1,5,1,5,3,4,6,4}));
    }
}
