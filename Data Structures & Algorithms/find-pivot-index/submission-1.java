class Solution {
    public int pivotIndex(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(nums[0]);
        int n = nums.length;
        for(int i=1;i<nums.length;i++){
            int sum = lst.get(i-1) + nums[i];
            lst.add(sum);
            System.out.print(sum + " ");
        }

        for(int i=0;i<nums.length;i++){
            int l = 0;
            int r = 0;

            if(i==0){
                r = lst.get(n-1) - lst.get(i);
            }
            else{
                l =lst.get(i-1);
                r = lst.get(n-1) - lst.get(i);
            }
            if(l==r){return i;}
        }
        return -1;

    }
}