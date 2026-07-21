class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int longest = 0;

            for(int num : nums){
                if(!set.contains(num-1)){
                    int length = 0; 
                    while(set.contains(num+length)){
                        length++;
                    }
                    longest = longest>length ? longest : length;
                }
            }
        // for(int num : set){
                  
        //         if(!set.contains(num-1)){
        //             freq = 0;
        //             last = num;
        //             freq++;
        //         }

        //         else if(!set.contains(num+1)){
        //             if((last + 1) == num){
        //             freq++;
        //             last = 0;
        //             }
        //         }
        //         else{
        //             if((last + 1) == num){
        //             freq++;
        //             last = num;
        //             }
        //         }
        // }
        return longest;
    }
}
