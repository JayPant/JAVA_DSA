public class Fibbonaci {
    static int findNth(int n)
    {
        if(n==0 || n==1) return n;
                                                      
        return findNth(n-1)+findNth(n-2);

    }

    public static void main(String[] args) {
        System.out.println(findNth(6));
    }
}
