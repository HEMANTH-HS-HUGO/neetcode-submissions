class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxi = 0;
        while(l<r){
            int wid = Math.abs(r - l);
            int hei = Math.min(heights[l],heights[r]);
            int area = wid * hei;
            maxi = Math.max(maxi, area);
            if(heights[l] > heights[r]){
                r--;
            }
            else{
                l++;
            }

        }
        return maxi;
    }
}
