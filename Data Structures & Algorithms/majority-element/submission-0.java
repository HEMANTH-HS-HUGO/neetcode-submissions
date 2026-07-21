class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max =0;
        int maxvalue =0;
        for(int i=0;i<nums.length;i++){
            // if(hm.containsKey(nums[i])){

            // }
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);

        }

        for(Map.Entry<Integer,Integer> kv : hm.entrySet()){
            if(max<kv.getValue()){
                max = kv.getValue();
                maxvalue = kv.getKey();
            }
        
    }
    return maxvalue;
    }
}