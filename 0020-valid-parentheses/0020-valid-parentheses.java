class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            switch(ch){
                case '(' : 
                     stack.push(s.charAt(i));
                     open++;
                     break;
                case '{' : 
                    stack.push(s.charAt(i));
                     open++;
                     break;
                case '[': 
                     stack.push(s.charAt(i));
                     open++;
                     break;
                case ')' : 
                      if(open==0){
                        return false;
                      }
                    if(stack.peek()=='('){
                        open--;
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                 case '}' : 
                      if(open==0){
                        return false;
                      }
                    if(stack.peek()=='{'){
                        open--;
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                case ']' : 
                      if(open==0){
                        return false;
                      }
                    if(stack.peek()=='['){
                        open--;
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                default :
                    break;
            }
        }

        if(open==0){
            return true;
        }
        return false;
    }
}