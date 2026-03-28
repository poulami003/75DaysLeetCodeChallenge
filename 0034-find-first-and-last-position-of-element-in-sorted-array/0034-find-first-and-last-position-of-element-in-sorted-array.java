class Solution {
    public int[] searchRange(int[] nums, int target) {
       int n=nums.length;
       int [] arr={-1,-1};

       int low=0;
       int high=n-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]>=target){
            high=mid-1;
        }else{
            low=mid+1;
        }
       }

        if(low==n || nums[low]!=target){
            return arr;
        }

        
        arr[0]=low;
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }

        arr[1]=high;
        return arr;
    }
}