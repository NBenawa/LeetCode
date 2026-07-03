public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            if ((prices[i] - buyPrice) > maxProfit) {
                maxProfit = prices[i] - buyPrice;
            }
        }
        return maxProfit;
    }
}
