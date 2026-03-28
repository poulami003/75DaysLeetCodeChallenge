class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left_sum=0;
        int n=cardPoints.length;
        
        for(int i=0;i<k;i++){
            left_sum+=cardPoints[i];
        }

        int l=k-1;
        int r=n-1;
        int right_sum=0;
        int max_sum=left_sum;
        while(l>=0){
            left_sum=left_sum-cardPoints[l];
            l--;
            right_sum=right_sum+cardPoints[r];
            r--;
            max_sum=Math.max(max_sum,left_sum+right_sum);
        }

        return max_sum;
    }
}