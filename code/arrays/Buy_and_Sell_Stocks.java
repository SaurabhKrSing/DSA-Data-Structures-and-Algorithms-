package code.arrays;

public class Buy_and_Sell_Stocks {
  public static int stock(int[] prices) {
    int buyprice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (buyprice < prices[i]) {
        int profit = prices[i] - buyprice;
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyprice = prices[i];
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println("Maximum Profit: " + stock(prices)); // Output: Maximum Profit: 5
  }
}
