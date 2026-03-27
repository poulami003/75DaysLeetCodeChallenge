class Solution {
    public int lengthOfLongestSubstring(String s) {
        //two pointer and sliding window
       int[] hash=new int[256];
       Arrays.fill(hash,-1); 
       int left=0;
       int right=0;
       int n=s.length();
       int maxlen=0;
       while(right<n){
        if(hash[s.charAt(right)]!=-1){
            if(hash[s.charAt(right)]>=left){
                left=hash[s.charAt(right)]+1;
            }
        }

        hash[s.charAt(right)]=right;
        maxlen=Math.max(maxlen,right-left+1);
        right++;
       }

        return maxlen;
    }
}