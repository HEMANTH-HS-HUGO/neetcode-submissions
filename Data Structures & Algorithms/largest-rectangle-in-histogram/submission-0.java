class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxWidth = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<=heights.length;i++){
            int currH = (i== heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && currH < heights[stack.peek()]  ){
                int poped = stack.pop();

                int left = stack.isEmpty() ? -1: stack.peek();
                int width = i - left - 1;

                int area = heights[poped] * width;
                maxWidth = Math.max(maxWidth, area);
            }
        
                stack.push(i);
        
        }
        return maxWidth;
    }
}
