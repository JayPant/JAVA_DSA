public class SwapTwoValues {

    static void swapTemp(int a , int b)
    {
        System.out.println("Values before swap a: "+a+" b: "+b);
         int temp=a;
         a=b;
         b=temp;
        System.out.println("Values after swap a: "+a+" b: "+b);

    }

    static void swap(int a , int b)
    {
        System.out.println("Values before swap a: "+a+" b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values after swap a: "+a+" b: "+b);

    }
    public static void main(String[] args) {
    int[] arr= {1,2,3,4,5};
    int a=9,b=3;
    swapTemp(a,b);
    swap(a,b);

    }
}
