class Solution {
    public int countConsistent(int[] nums) {

        int count=0;
        
        for(int i=0 ;i<nums.length ;i++){

                int minn=nums[i];
                int bit_=-1;
            for(int j=i ; j<nums.length ;j++){
                minn=Math.min(minn,nums[j]);
                bit_=(bit_) & (nums[j]);

                if(bit_==minn){
                    count++;
                }
            }
        }

        return count;
    }
}