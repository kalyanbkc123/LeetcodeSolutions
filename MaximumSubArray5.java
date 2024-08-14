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

    // Better approach
    // Time Complexity :: O(N^2)
    // Space Complexity :: O(1)

    public static int maxSubArray2(int[] nums)
    {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i < n; i++)
        {
            int sum = 0;
            for(int j = i; j <= i; j++)
            {
                sum += nums[i];

                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    // Optimal Approach
    public static int maxSubArray3(int[] nums)
    {
        int n = nums.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i <n; i++)
        {
           sum += nums[i];
            if(sum > maxi)
            {
                maxi = sum;
            }
            if(sum <  0)
            {
                sum = 0;
            }
        }
        return maxi;
    }
}
