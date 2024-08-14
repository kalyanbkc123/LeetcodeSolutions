public class MaximumSubArray5 {

    //1. Brute Force Approach
    // Time Complexity :: O(N^3)
    // Space Complexity :: O(1)

    public static int maxSubArray1(int[] nums)
    {
        int n = nums.length;

        int max = Integer.MIN_VALUE;

        for(int i=0; i < n; i++)
        {
            for(int j = i; i < n; j++)
            {
                int sum = 0;
                for(int k = i; k <=j; k++)
                {
                    sum += nums[i];

                    max = Math.max(max,sum);

                }
            }
        }

        return max;
    }
}
