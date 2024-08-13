
// Contains Duplicate or not.. If the given Array contains the same element twice..

import java.util.Arrays;

public class ContainsDuplicate3 {

    // Approach 1: approach using nested for loop..
    // time complexity :: O(N*N)
    // space complexity :: O(1)

    public static boolean containsDuplicate(int[] nums)
    {
        for(int i=0; i < nums.length ; i++)
        {
            for(int j=i+1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    // Approach 2 :: sort the array and check the adjacent
    // time :: O(nlogn)
    // space :: O(1)

    public static boolean containsDuplicate2(int[] nums)
    {
        Arrays.sort(nums);
        for(int i=1; i < nums.length; i++)
        {
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,3,1,4,5,5};
        System.out.println("Answer is : "+containsDuplicate2(arr));
    }

}
