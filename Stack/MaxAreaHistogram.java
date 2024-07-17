import java.util.Stack;

/**
 * MaxAreaHistogram
 */
public class MaxAreaHistogram {

    public static int findMaxArea(int[] arr) {
        int n = arr.length;
        int[] nsl = new int[n];
        int[] nsr = new int[n];
        int currArea = 0, maxArea = 0;

        Stack<Integer> s = new Stack<>();

        // next smaller right
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] =n;
            } else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();
        // next smaller left
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] =-1;
            } else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<n;i++){
            currArea = arr[i] * (nsr[i]-nsl[i]-1);
            maxArea = Math.max(currArea,maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        int area = findMaxArea(heights);
        System.out.println("Maximum area is: "+ area);
    }

}