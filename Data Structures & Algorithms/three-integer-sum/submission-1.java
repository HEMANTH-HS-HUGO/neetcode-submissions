class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int k =0;k<nums.length;k++){
            if(k>0 && nums[k] == nums[k-1]){
                continue;
            }
           
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                List<Integer> lst = new ArrayList<>();

                if(nums[k] + nums[i] + nums[j] < 0){
                    i++;
                }
                else if(nums[k] + nums[i] + nums[j] > 0){
                    j--;
                }
                else{
                   lst.add(nums[k]);
                   lst.add(nums[i]);
                   lst.add(nums[j]);
                   list.add(lst);
                   i++;
                   while(nums[i] == nums[i-1] && i<j){
                    i++;
                   }
                }
            }

        }
        return list;
    }
}
