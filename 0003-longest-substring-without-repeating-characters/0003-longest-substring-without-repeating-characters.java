class Solution {
    public int lengthOfLongestSubstring(String s) {
        //two pointer and sliding window
       HashMap <Character,Integer> map=new HashMap<>();
       int left=0;
       int right=0;
       int n=s.length();
       int maxlen=0;
       while(right<n){
        if(!map.containsKey(s.charAt(right))){
            map.put(s.charAt(right),right);
        }else{
            if(map.get(s.charAt(right))>=left){
                left=map.get(s.charAt(right))+1;
            }
            map.remove(s.charAt(right));
            map.put(s.charAt(right),right);
        }

        maxlen=Math.max(maxlen,right-left+1);
        right++;
       }

        return maxlen;
    }
}