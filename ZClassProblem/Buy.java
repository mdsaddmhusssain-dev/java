package ZClassProblem;
public class Buy {
    

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;
        int  n =prices.length;

        for (int i = 1; i <n; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 10, 1, 3, 6,9, 2};

        System.out.println(maxProfit(prices)); // Output: 5
    }
}
    

