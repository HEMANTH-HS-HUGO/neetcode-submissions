class Solution {
    Stack<Integer> stack = new Stack<>();
    public int evalRPN(String[] tokens) {
        for(String str : tokens){
            
            if(! str.equals("+") && !str.equals("*") && !str.equals("-") && !str.equals("/")){

                stack.push(Integer.parseInt(str));
            }
            else{
                int res = 0;
                if(str.equals("+")){
                     res = stack.pop() + stack.pop();
                }
                else if(str.equals("*")){
                     res = stack.pop() * stack.pop();
                }
                else if(str.equals("-")){
                     res = stack.pop() - stack.pop();
                }
            
                else if(str.equals("/")){
                     res = stack.pop() / stack.pop();
                }
                
                stack.push(res);
            }
        }
        return stack.peek();
    }
}
