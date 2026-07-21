class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       int count = 0;
       int prefix = 0; //prefixsum
        hm.put(prefix,1);

       for(int i=0;i<nums.length;i++){
        prefix += nums[i];

        int diff = prefix - k;

        if(hm.containsKey(diff)){
            count += hm.get(diff);
            // hm.put(diff, hm.get(diff)+1);
            
        }
        hm.put(prefix,hm.getOrDefault(prefix,0)+1);
       }
       return count; 
    }
}