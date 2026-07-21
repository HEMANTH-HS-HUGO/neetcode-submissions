class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<HashMap<Character,Integer>> list = new ArrayList<>();
        List<List<String>> ls = new ArrayList<>();
        int n = strs.length;

        for(int i=0;i<n;i++){
            
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int j=0;j<strs[i].length();j++){
            hm.put(strs[i].charAt(j), hm.getOrDefault(strs[i].charAt(j), 0) +1);
            }

            list.add(hm);
        }

        List<Integer> list2 = new ArrayList<>(Collections.nCopies(n, 0));

        for(int i=0; i<n; i++){
            if(list2.get(i) == 1){
                continue;
            }
            List<String> temp = new ArrayList<>();
            HashMap<Character, Integer> hm1 = list.get(i);
            temp.add(strs[i]);
            for (int j=i+1; j<n; j++){
                if (list.get(j).equals(hm1)){
                    temp.add(strs[j]);
                    list2.set(j, 1);
                }
            }
            ls.add(temp);
        }
        return ls;
    }
}
