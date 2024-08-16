
public class MinimumRotatedSortedArray7 {

    // Approach 1: Brute Force Approach
    // Time Complexity :: O(N).
    // space complexity :: O(1).

    public static int min(int[] nums)
    {
        int min = Integer.MAX_VALUE;

        for(int i=0; i < nums.length; i++)
        {
            min = Math.min(min,nums[i]);
        }

        return min;
    }

    // Approach-2 :
    // Time Complexity : O(logn)
    // Space Complexity : O(1)

    public static int min1(int[] nums)
    {   int low = 0, high = nums.length-1;
        int min = Integer.MAX_VALUE;

        while(low <= high)
        {
            int mid = (low+high) / 2;

            if(nums[low] <= nums[mid]) {

                min = Math.min(min, nums[low]);

                low = mid+1;
            }
            else // right is sorted
            {
                min = Math.min(min, nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }

    //Approach-3
    // Time Complexity : O(logN)
    // Space Complexity : O(1)
    public static int min3(int[] nums)
    {
        int min = Integer.MAX_VALUE;

        int low = 0, high = nums.length-1;

        while(low <= high)
        {
            int mid = (low+high)/2;

            if(nums[low] <= nums[high]) // Array is already sorted
            {   min = Math.min(min, nums[low]);
                break;
            }
            else if(nums[low] <= nums[mid]) // left part is already sorted
            {
                min = Math.min(min, nums[low]);
                low = mid+1;
            }
            else // right part is already sorted
            {
                min = Math.min(min, nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {3,1,2,0};

        int result = min3(arr);

        System.out.println(result);
    }
}
