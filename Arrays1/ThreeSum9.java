package Arrays1;

import java.util.*;
public class ThreeSum9 {
    // Brute Force Approach
    // Time Complexity : O(n^3)
    // Space Complexity :
    public static List<List<Integer>> triplets(int[] nums,int n,int target)
    {
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i < n; i++)
        {
            for(int j=i+1; j < n-1; j++)
            {
                for(int k = j+1; k < n-1; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == target)
                    {
                        List<Integer> lt = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));

                        lt.sort(null);

                        st.add(lt);
                    }
                }
            }
        }
        List<List<Integer>> ans =  new ArrayList<>(st);
        return ans;
    }

    // Better Approach
    // Time Complexity : O(N^2*(log(no. of unique triples)
    // Space Complexity : O(2 * no. of unique triplets)
    public static List<List<Integer>> triplets1(int[] nums, int n, int target)
    {
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i < n; i++)
        {    Set<Integer> hashSet = new HashSet<>();
            for(int j=i+1; j < n; j++) {
                int ans = target - (nums[i] + nums[j]);
                // find the element in the set
                if (hashSet.contains(ans))
                {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],ans);
                    temp.sort(null);
                    st.add(temp);
                }
                hashSet.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    // Optimal Approach
    // Time Complexity : O(Nlogn) + O(N^2)
    // Space Complexity : O(1) :: for the answer perpestive we are not using any extra space..


    public static List<List<Integer>> triplets2(int[] nums, int n, int target)
    {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);



        for(int i=0; i < n; i++)
        {
            // check for dupliates
            if(i!=0 && nums[i] == nums[i-1]) i++;

            int j = i+1;
            int k= n-1;

            while(j < k )
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0)
                {
                    j++;
                }
                else if(sum > 0 )
                {
                    k--;
                }
                else
                {
                    List<Integer> ans = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.sort(null);
                    list.add(ans);

                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[j] == nums[k-1]) k--;

                }

            }
        }

        return list;

    }

    public static void main(String[] args) {

        int[] array = {-1,0,1,0};
        int target =  0;
        List<List<Integer>> list = triplets2(array, array.length, target);

        for(List<Integer> it : list)
        {
            System.out.print("[");
            for(Integer i:it)
            {
                System.out.print(i + " ");
            }
            System.out.print("]");

        }

        System.out.println();


    }
}
