public class SearchElement {
    public int tellResult(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12,24,36,48,60,72,84,96,108,120};
        int target = 108;

        SearchElement se = new SearchElement();
        int result= se.tellResult(arr,target);
        System.out.println(result);
    }
}
