package Greedy;

public class IndianCoins {
    public static void main(String[] args) {
        int[] coins = {1,5,10,20,50,100,500,2000,};
        int value =540;
        int count = 0;

        for(int i=coins.length-1;i>=0;i--){
            if(coins[i] <= value){
                while(coins[i] <= value){
                    count++;
                    value-=coins[i];
                }
            }
        }

        System.out.println(count);
    }
}
