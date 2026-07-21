class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int n = s.length();
        int i=0;
        int j=i;
        int max = 0;
        while(i<n && j<n){
            if(hs.contains(s.charAt(j))){
                hs.remove(s.charAt(i));
                i++;
                continue;
            }
            hs.add(s.charAt(j));
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
