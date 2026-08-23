class Solution {
    public double minimumAverage(int[] nums) {
        
        int n= nums.length;
        Arrays.sort(nums);
        double minn=Integer.MAX_VALUE;

        for(int i=0; i<n/2 ; i++){

            double average=(double)(nums[i]+nums[n-1-i])/2;
            minn=Math.min(minn,average);
        }  

        return minn;
    }
}