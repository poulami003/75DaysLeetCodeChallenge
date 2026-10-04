class Solution {
    public int minRotations(String s) {
        int rotation=0;
        
        for(int i=0 ; i<s.length() ; i++){
            char ch=s.charAt(i);
            if(i==0){
                int digit=Math.abs(0-(ch-'0'));
                rotation+=Math.min(digit , 10-digit);
            }
            else{
                int prev_digit=s.charAt(i-1)-'0';
                int digit=Math.abs(prev_digit-(ch-'0'));
                rotation+=Math.min(digit , 10-digit);
            }

        }

        return rotation;
    }
}