class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int len = 0;
        int i=0;
        int j=i;
        while(i<n && j<n){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
                continue;
            }
            set.add(s.charAt(j));
            len = Math.max(len, j-i+1); 
            j++;
        }
        return len;
    }
}
