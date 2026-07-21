class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int prefix = 0;
        int result = 0;
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            prefix += nums[r];
            while (nums[r] * (r - l + 1) > prefix + k) {
                prefix -= nums[l];
                l++;
            }
            result = Math.max(r - l + 1, result);
            r += 1;
        }
        return result;
    }
}