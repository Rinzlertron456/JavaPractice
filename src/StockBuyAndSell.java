public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int maxProfit=0, profit=0, min=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>min) profit=prices[i]-min;
        }
        System.out.println(maxProfit);
    }
}
