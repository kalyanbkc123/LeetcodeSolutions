public class BestTimeToBuyAndSellStock5 {

    public static int bestTime(int[] prices,int n)
    {
        int max = 0;
        int mini = prices[0];

        for(int i=1; i < n; i++)
        {
            int currProfit = prices[i] - mini;
            max = Math.max(max,currProfit);
            mini = Math.min(mini,prices[i]);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {10,1,5,6,7};

        int max =  bestTime(nums,nums.length);

        System.out.println("The maximum profit value is "+max);
    }
}
