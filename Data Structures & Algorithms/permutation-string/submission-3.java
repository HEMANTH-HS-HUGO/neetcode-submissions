class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1map = new HashMap<>();
        Map<Character, Integer> s2map = new HashMap<>();

        int n1 = s1.length();
        int n2 = s2.length();
        if(n2 < n1){
            return false;
        }
        for(int i=0;i<n1;i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            s1map.put(c1, s1map.getOrDefault(c1,0)+1);
            s2map.put(c2, s2map.getOrDefault(c2,0)+1);
        }

        for(int j=n1; j<n2;j++){
            if(s1map.equals(s2map)){
                return true;
            }
            char c1 = s2.charAt(j-n1);
            char c2 = s2.charAt(j);

            if(s2map.get(c1) == 1){
                  s2map.remove(c1);
            }
            else{
                s2map.put(c1,s2map.get(c1)-1);
            }

            s2map.put(c2, s2map.getOrDefault(c2,0)+1);
            
        }
        if(s1map.equals(s2map)){
                return true;
            }
        return false;

    }
}
