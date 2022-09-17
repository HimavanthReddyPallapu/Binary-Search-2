class Solution {
    public int findMin(int[] nums) {
        int low,high,mid;
        low=0;
        high=nums.length-1;
        while(low+1<high)
        {
            mid=low+(high-low)/2;
            
            if(nums[mid]>nums[high])
            {
                low=mid;
            }
            else
            {
                high=mid;
            }
        }
        return nums[low]<nums[high]?nums[low]:nums[high];
        
    }
}
