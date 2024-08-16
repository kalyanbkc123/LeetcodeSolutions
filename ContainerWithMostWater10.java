public class ContainerWithMostWater10 {

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public static int maxArea(int[] nums)
    {
        int left=0, right = nums.length -1;

        int maxArea = 0;

        while(left < right)
        {
            int currentArea = Math.min(nums[left],nums[right])*(right-left);
            maxArea = Math.max(maxArea,currentArea);

            if(nums[left] < nums[right]) left++;
            else right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
