public class BinaySearch7 {

    // Time Complexity : O(logN)
    // Space Complexity : O(1)

    public static int search(int[] nums,int target)
    {
        int left = 0;
        int right = nums.length-1;

       while(left <= right)
       {
           int mid = (left + right)/2;

           if(nums[mid] == target) return mid;
           else if(nums[mid] < target) left = mid+1;
           else right = mid+1;
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};

        int index = search(arr,12);

        System.out.println("target is found at "+index);


    }
}
