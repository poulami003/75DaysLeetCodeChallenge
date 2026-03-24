class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int container=0;
        int maax=Integer.MIN_VALUE;
        while(left<right){
            if(height[left]==height[right]){
                container=height[left]*(right-left);
                left++;
                right--;
            }
            else if(height[left]<height[right]){
                container=height[left]*(right-left);
                left++;
            }else{
                container=height[right]*(right-left);
                right--;
            }

            maax=Math.max(maax,container);
        }

        return maax;
    }
}