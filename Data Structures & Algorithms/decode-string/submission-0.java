class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ']'){
                stack.push(String.valueOf(s.charAt(i)));
            }
            else{
                String substr = "";
                while(!stack.peek().equals("[")){
                    substr = stack.pop() + substr;
                }
                stack.pop();
                String t = "";
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    t = stack.pop() + t;
                }
                String repeated = "";
                // stack.push(Integer.parseInt(t) * substr);
                for(int j=0;j<Integer.parseInt(t);j++){
                    repeated += substr;
                }
                stack.push(repeated);
            }
        }
        
        String res = "";
        for(String str : stack){
            res += str;
        }
        return res;
    }
}