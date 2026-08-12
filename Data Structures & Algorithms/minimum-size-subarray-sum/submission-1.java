class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int len = Integer.MAX_VALUE;
        int i =0;
        int sum = 0;
        for(int j=0;j<nums.length;j++){
            sum += nums[j];
            while(sum >= target){
                len = Math.min(len, j-i+1);
                sum -= nums[i];
                i++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}