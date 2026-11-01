class Solution {
    public int minMergedInteger(int[] nums) {
        int min=Integer.MAX_VALUE;

        for(int i=0 ;i<nums.length ; i=i+2){

            String str= String.valueOf(nums[i]) + String.valueOf(nums[i+1]);

            int sum=Integer.parseInt(str);

            min=Math.min(min , sum);
        }

        return min;
    }
}