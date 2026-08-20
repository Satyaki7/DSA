public class BestTime {
    
    public int maxProfit(int[] prices) {
        int bp = prices[0], p, profit = 0;
        for (int i = 0; i < prices.length; i++) {
            p = prices[i];
            if (bp > p) { //buying price > current price
                bp = p; //buying price = current price
                System.out.println(bp);
            }
            profit = (profit > p - bp) ? profit : p-bp;
        }
        return  profit;
    }
    

    public static void main(String[] args) {
        int nums1[] = {3,2,6,5,0,3};
        // int m = 7; 
        // int[] nums2 = {3,6,7,8}; 
        // int n = 4;
        BestTime obj = new BestTime();
        System.out.println(obj.maxProfit(nums1));
    }
}
