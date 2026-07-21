class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> lst = new ArrayList<>(); 
        
        Arrays.sort(nums); //0(nlogn)
        int n = nums.length;
        for(int i=0;i<n;i++){
            if( i > 0 && (nums[i] == nums[i-1])) {
                continue;
            }
            int l = i+1;
            int r = n-1;
            while(l<r){
                int threesum = nums[i] + nums[l] + nums[r];
                if(threesum > 0){
                    r--;
                }
                else if( threesum < 0){
                    l++;
                }
                else{
                    ArrayList<Integer> sum = new ArrayList<>();
                    sum.add(nums[i]);
                    sum.add(nums[l]);
                    sum.add(nums[r]);

                    lst.add(sum);
                    l++;
                    while((nums[l] == nums[l-1]) && l<r){
                        l++;
                    }
                }
            }
        }
        return lst;
    }
}
