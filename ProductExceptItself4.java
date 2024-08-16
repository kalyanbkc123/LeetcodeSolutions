import java.util.Arrays;

class ProductExceptItself4 {

    // Approach
    // Time Complexity : O(N)
    // space Complexity : O(N)
    public static int[] productExceptItself(int[] nums)
    {
        int[] ans = new int[nums.length];
        int n = nums.length;
        Arrays.fill(ans, 1);

        int curr = 1;

        for(int i=0; i < n; i++)
        {
            ans[i] *= curr;
            curr *= nums[i];
        }

        curr = 1;
        for(int i= n-1; i>=0; i--)
        {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,9};

        int[] res = productExceptItself(nums);

        for(int i=0; i <res.length; i++)
        {
            System.out.print(res[i]+ " ");
        }

    }
}
