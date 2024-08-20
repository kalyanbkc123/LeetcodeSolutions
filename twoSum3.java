import java.util.HashMap;

public class twoSum3 {

    public static int[] twoSum1(int[] nums,int target)
    {
        int[] arr = new int[2];
        arr[0] = arr[1] = -1;

        HashMap<Integer,Integer> hmap = new HashMap();

        for(int i=0; i <nums.length ;i++)
        {
            int res = target -nums[i];
            if(hmap.containsKey(res))
            {
                arr[0] = hmap.get(res);
                arr[1] = i;
            }

            hmap.put(nums[i],i);
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {4,5,6,9,1,2};

        int[] arr1 = twoSum1(arr,10);

        for(int n : arr1)
        {
            System.out.println(n);
        }


    }
}
