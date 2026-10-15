class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l = 0;
        int r = l+1;
        while(l<r && r<nums.length){
            if(nums[l] != nums[r]){
                l++;
                nums[l] = nums[r];
            }
            r++;
        }

        return l+1;
    }
}