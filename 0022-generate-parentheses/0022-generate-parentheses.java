class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        int open=n;
        int close=n;
        String s="";
        parenthesis(open, close,s,result);
        return result;
    }


    public void parenthesis(int open , int close, String s, List<String> result){

        //base condition

        if(open==0 && close==0){

            result.add(s);
            return;
        }

        if(open!=0){
            //take open bracket
            parenthesis(open-1, close, s+"(",result);
        }

        if(close > open){
            //take close bracket
            parenthesis(open, close-1, s+")",result);
        }
    }
}