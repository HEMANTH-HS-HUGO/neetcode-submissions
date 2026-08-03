class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > n/3){
                lst.add(entry.getKey());
            }
        }
        return lst;
    }
}