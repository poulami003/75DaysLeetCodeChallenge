class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int max_len=0;
        int max_freq=0;
        int[] hash=new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            max_freq=Math.max(max_freq,hash[s.charAt(r)-'A']);
                if(((r-l+1)-max_freq)>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }

            if(((r-l+1)-max_freq)<=k){
                max_len=Math.max(max_len,r-l+1);
            }
            r++;
        }

        return max_len;
    }
}