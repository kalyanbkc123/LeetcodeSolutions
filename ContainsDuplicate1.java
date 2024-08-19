import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate1 {
    //Approach-1
    // Time Complexity : O(N^2)
    // Space Complexity : O(1)
    public static boolean duplicate1(int[] nums)
    {
        int n = nums.length;
        for(int i=0; i < n; i++)
        {
            for(int j=i+1; j < n; j++)
            {
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    // Approach-2
    // Time Complexity : O(N*logN)
    // Space Complexity : O(1)
    public static boolean duplicate2(int[] nums)
    {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1 ; i < n; i++)
        {
            if(nums[i] == nums[i+1])
                return true;
        }

        return false;
    }

    // Approach 3:
    // Time Complexity : O(N)
    // Space Complexity : O(N)
    public static boolean duplicate3(int[] nums)
    {
        Set<Integer> st = new HashSet<>();
        for(int i=0 ; i <nums.length; i++)
        {
            if(st.contains(nums[i])) return true;

            st.add(nums[i]);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println("Contains Duplicate : "+duplicate3(nums));
    }
}
