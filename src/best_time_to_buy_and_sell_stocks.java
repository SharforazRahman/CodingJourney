public class best_time_to_buy_and_sell_stocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }

    public static void maxProfit(int[] arr) {
        int max = 0;
        int min = arr[0];

        for (int j : arr) {
            min = Math.min(min, j);
            int profit = j - min;
            max = Math.max(max, profit);
        }
        System.out.println(max);
    }
}