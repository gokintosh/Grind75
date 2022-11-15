package org.example.Week1;

public class BestTimeToSellStock {
    public static void main(String[] args) {

        int[] prices={7,6,4,3,1};
        int result=bestTimeToSellStock(prices);
        System.out.println(result);
    }

    public static int bestTimeToSellStock(int[] prices){

        int min=prices[0];
        int result=0;

        for(int i=1;i<prices.length;i++){
            result=Math.max(result,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return result;

    }
}
