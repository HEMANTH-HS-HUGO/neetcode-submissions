class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int j=0;j<nums.length;j++){
            int diff = target-nums[j];

            if(hm.containsKey(diff)){
                return new int[]{hm.get(diff), j};
            }
            hm.put(nums[j],j);
        }
        return new int[]{-1,-1};
    }
}
