class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        Arrays.sort(strs);
        
        int m = strs[0].length() < strs[strs.length-1].length() ? strs[0].length() : strs[strs.length-1].length();
        for(int i=0;i<m;i++){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                res += strs[0].charAt(i);
            }
            else{
                return res;
            }
        }
        return res;
    }
}