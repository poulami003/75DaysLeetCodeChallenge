class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxsum=0;
        double sum=0;
        int l=0;
        int r=k-1;
        for(int i=l;i<=k-1;i++){
            sum+=nums[i];
        }
        sum=sum/k;
        maxsum=sum;
        while(r<n-1){
            sum=sum*k;
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            sum=sum/k;
            maxsum=Math.max(maxsum,sum);
        }

        return maxsum;
    }
}