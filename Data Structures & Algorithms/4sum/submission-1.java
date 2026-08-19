class Solution {
    public List<List<Integer>> sum(int[] nums, int k, int start, long target){
        List<List<Integer>> list = new ArrayList<>();
        
        if(k != 2){
            for(int i = start;i<=nums.length-k;i++){
                if( i > start && nums[i] == nums[i-1]){
                    continue;
                }
                List<List<Integer>> res = sum(nums, k-1, i+1, target - nums[i]);

                for(List<Integer> subset : res){
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.addAll(subset);

                    list.add(lst);
                }
            }
            return list;
        }
        int l = start, r = nums.length-1;
            while(l<r){
                long currsum = nums[l] + nums[r];
                if(currsum < target){
                    l++;
                }
                else if(currsum > target){
                    r--;
                }
                else{
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[l]);
                    lst.add(nums[r]);
                    list.add(lst);
                    l++;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }
        return list;
        }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return sum(nums, 4, 0,(long) target);

    }
    
}