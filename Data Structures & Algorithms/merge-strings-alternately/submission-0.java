class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l =0;
        String str = "";

        while(l<word1.length() && l<word2.length()){
            char c1 = word1.charAt(l);
            char c2 = word2.charAt(l);
            str += c1;
            str += c2;
            l++;
        }

        while(l<word1.length()){
            char c1 = word1.charAt(l);
            str += c1;
            l++;
        }
        while(l<word2.length()){
            char c2 = word2.charAt(l);
            str += c2;
            l++;
        }
        return str;
    }
}