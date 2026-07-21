class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int i=0;
        int j=0;
        int maxFreq =0;
        int maxLen = 0;
        while( i<n && j<n){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c,0)+1);

            maxFreq = Math.max(maxFreq, map.get(c));
        
            while(((j-i+1) - maxFreq) > k){
                char left = s.charAt(i);
                map.put(left,map.get(left)-1);
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
}
