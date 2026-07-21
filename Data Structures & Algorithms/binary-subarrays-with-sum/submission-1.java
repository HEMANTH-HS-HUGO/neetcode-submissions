class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return atMost(nums,goal) - atMost(nums,goal-1); // answer = atmost(goal) - atmost(goal-1)   
    }

    public int atMost(int[] nums,int x){
        if(x<0){
             return 0;
        }
        int presum= 0; // its stores the subarrays length
        int curr = 0;
        int l = 0;

        for(int r=0;r<nums.length;r++){
            curr += nums[r];
            while(curr>x){
                curr -= nums[l];
                l++;
            }
            presum += (r-l+1);
        }
        return presum;

    }

}