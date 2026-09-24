class Solution {
    Stack<Integer> stack = new Stack<>();

    public int evalRPN(String[] tokens) {

        for (String str : tokens) {

            if (!str.equals("+") &&
                !str.equals("-") &&
                !str.equals("*") &&
                !str.equals("/")) {

                stack.push(Integer.parseInt(str));

            } else {

                int b = stack.pop();
                int a = stack.pop();

                int res = 0;

                if (str.equals("+")) {
                    res = a + b;
                } else if (str.equals("*")) {
                    res = a * b;
                } else if (str.equals("-")) {
                    res = a - b;
                } else if (str.equals("/")) {
                    res = a / b;
                }

                stack.push(res);
            }
        }

        return stack.pop();
    }
}