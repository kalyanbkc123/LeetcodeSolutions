// Buy and Sell Stock for maximum profit...

// time Complexity: O(N)
// space complexity : O(1)..
    class BuyAndSell
    {
        public static int maximumProfit(int[] arr)
        {
            int maxProfit = 0;
            int mini = arr[0];

            for(int i=1; i < arr.length; i++)
            {
                int currProf = arr[i] - mini;
                maxProfit = Math.max(currProf, maxProfit);
                mini = Math.min(arr[i],mini);
            }
            return maxProfit;
        }
        public static void main(String[] args)
        {
            int[] arr = {7,1,5,3,6,4};

            System.out.println("The maximum profit by selling the stock is :"
                    +maximumProfit(arr));

        }
    }

