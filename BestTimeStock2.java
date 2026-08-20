public class BestTimeStock2 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int nums1[] = { 7, 1, 5, 3, 6, 4 };
        // int m = 7;
        // int[] nums2 = {3,6,7,8};
        // int n = 4;
        BestTime obj = new BestTime();
        System.out.println(obj.maxProfit(nums1));
    }
}
