class Solution {
    public int maxDistance(String moves) {

        int  left=0;
        int right=0;
        int blank=0;
        int n=moves.length();
        for(int i=0;i<n;i++){

            if(moves.charAt(i)=='U')
                right=right+1;
            if(moves.charAt(i)=='D')
                right=right-1;
            if(moves.charAt(i)=='L')
                left=left-1;
            if(moves.charAt(i)=='R')
                left=left+1;
            if(moves.charAt(i)=='_'){
                blank++;   
            }
        }

        int distance=0;
        distance=Math.abs(0-left)+Math.abs(0-right)+blank;

        return distance;
    }
}