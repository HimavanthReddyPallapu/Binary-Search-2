class Solution {
    public int findPeakElement(int[] nums) {
        int low,mid,high;
        low=0;
        high=nums.length-1;
        while(low<high)
        {
            mid=low+(high-low)/2;
            
          if(nums[mid]>nums[mid+1])
          {
              high=mid;
          }
            else
            {
                low=mid+1;
            }
             
        }
        return high;
        }
        
    }

