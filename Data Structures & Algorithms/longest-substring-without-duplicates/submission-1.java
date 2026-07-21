class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int max=0;
        int i=0;
        int j=i;
        while(i<n && j<n){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
                continue;
            }
            set.add(s.charAt(j));
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }

}
