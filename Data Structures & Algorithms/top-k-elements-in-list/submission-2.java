class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        
        List<List<Integer>> lst = new ArrayList<>(nums.length+1);
        for(int i=0;i<nums.length+1;i++){
            lst.add(null);
        }

        for(Map.Entry<Integer,Integer> e : hm.entrySet()){

            int freq = e.getValue();

            if((lst.get(freq) == null)){
                List<Integer> temp =  new ArrayList<>();
                temp.add(e.getKey());
                lst.set(freq,temp);
            }
            else{
                lst.get(freq).add(e.getKey());
            }

        }
        

        int[] res = new int[k];
        int ind = 0;
        for(int i=nums.length; i>=0 && ind<k; i--){

            if(k>=1 && lst.get(i)!=null){

                for(int x : lst.get(i)){
                   res[ind++] = x;
                    if(ind == k) break;
                }
                
            }
            
           
        }
        return res;
    }
}
