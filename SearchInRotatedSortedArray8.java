public class SearchInRotatedSortedArray8 {


    //Bruta Force Approach
    // Time Complexity : O(N)
    // Space Complexity : O(1)

    public static int search(int[] nums,int n, int k)
    {
        for(int i =0; i < nums.length; i++)
        {
            if(nums[i] == k)
            {
                return i;
            }
        }
        return -1;
    }

    // Better Approach
    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public static int search1(int[] nums, int n, int k)
    {
        int low =0, high = nums.length-1;

        while(low <= high)
        {

            int mid = (low+high)/2;

            // if mid points to the target
            if(nums[mid] == k)
            {
                return mid;
            }

            // if left part is sorted
            if(nums[low] <= nums[mid])
            {
                if(nums[low] <= k && k <= nums[mid])
                { // element exists
                    high = mid - 1;
                }

                else
                {
                    // element does not exist
                    low = mid +1;
                }

            }
            else // if right part is sorted
            {
                if (nums[mid] <= k && k <= nums[high]) {
                    // element exists
                    low = mid + 1;
                }
                else
                {
                    // element does not exist
                    high = mid - 1;
                }


            }

        }


        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {7,8,9,1,2,3,4,5,6};

        int n =9, k =5;
        int ans = search1(nums,n,k);

        if(ans == -1)
        {
            System.out.println("Target is not present..");
        }
        else
        {
            System.out.println("The index is :"+ans);
        }

    }
}
