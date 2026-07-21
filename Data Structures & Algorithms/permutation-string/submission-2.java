class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> s1map = new HashMap<>();
        int n = s1.length();
        if(s2.length() < n){ return false;}
        for(int i=0;i<n;i++){
            char c = s2.charAt(i);
            char c2 = s1.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
            s1map.put(c2, s1map.getOrDefault(c2,0)+1);
        }

        for(int j=n;j<s2.length();j++){
            
            if(s1map.equals(map)){
                return true;
            }
            char right = s2.charAt(j);
            char left = s2.charAt(j-n);
            if(map.get(left) == 1){
                map.remove(left);
            }
            else{
                map.put(left, map.get(left)-1);
            }
            
            map.put(right, map.getOrDefault(right,0)+1);
        }
        if(s1map.equals(map)){
                return true;
            }
        return false;
    }
}
