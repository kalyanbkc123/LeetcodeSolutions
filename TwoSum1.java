import java.util.Arrays;
import java.util.HashMap;

// two sum
class TwoSum1 {

    // Approach-1 Brute Force
    // Time Complexity :: O(n^2)
    // Space Complexity :: O(1)
    public static String twoSum(int n, int[] arr, int target)
    {
        for(int i=0; i < n; i++)
        {
            for(int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    // Approach-2 :: Using HashMap Approach
    // Time Complexity ::  O(N)
    // Space Complexity :: O(N)

    public static String twoSum2(int n, int[] arr, int target)
    {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            int num = arr[i];
            int moreNeed = target - num;
            if(mpp.containsKey(moreNeed))
            {
                return "YES";
            }

            mpp.put(arr[i],i);
        }

        return "NO";
    }

    // Approach-3 :: Using Two-Pointer Approach
    // Time Complexity :: O(N) + O(NlogN)
    // Space Complexity :: O(1)

    public static String twoSum3(int n, int[] arr, int target)
    {
        Arrays.sort(arr);
        int left = 0, right = n-1;

        while(left < right)
        {
            int sum = arr[left] + arr[right];

            if(sum == target)
            {
                return "YES";
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return "NO";
    }

}

