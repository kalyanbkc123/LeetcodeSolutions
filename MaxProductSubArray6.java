public class MaxProductSubArray6 {

    //1. Brute Force Approach
    // Time Complexity :: O(N^3)..
    // Space Complexity :: O(1)..

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i < n-1; i++)
        {

            for(int j = i+1; j < n; j++)
            {
                int prod =1;
                for(int k=i; k <= j; k++) {
                        prod *= nums[k];
                        maxi = Math.max(prod, maxi);
                }
            }
        }
        return maxi;
    }

    //2. Better Approach
    // Time complexity : O(n^2)
    // Space Complexity : O(1)
    public static int maxProduct1(int[] nums)
    {
        int n = nums.length;
        int res = nums[0];

        for(int i=0; i < n-1; i++)
        {
            int p = nums[i];
            for(int j = i+1; j < n; j++)
            {
                res = Math.max(res,p);
                p *= nums[j];
            }
            res = Math.max(res,p);
        }
        return res;
    }

    // Optimal Approach
    // Time Complexity : O(N)
    // Space Complexity : O(1)

    public static int maxProduct3(int[] nums)
    {
        int pre =1, suff =1;
        int n = nums.length;

        int ans = Integer.MIN_VALUE;

        for(int i=0; i < n; i++)
        {
            if(pre == 0) pre =1;
            if(suff == 0 ) suff =1;

            pre *= nums[i];
            suff *= nums[n-i-1];

            ans = Math.max(ans, Math.max(pre,suff));
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {2,5,6,-1,-9,-5,-4};
        int res = maxProduct3(arr);
        System.out.println(res);
    }
}
