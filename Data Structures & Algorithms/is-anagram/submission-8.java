class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // Map<Character, Integer> hms = new HashMap<>();
        // Map<Character, Integer> hmt = new HashMap<>();
      
        // for(int i=0;i<s.length();i++){
        //     hms.put(s.charAt(i), hms.getOrDefault(s.charAt(i),0)+1);
        //     hmt.put(t.charAt(i), hmt.getOrDefault(t.charAt(i),0)+1);
        // }

        // if(hms.equals(hmt)){
        //     return true;
        // }
        // return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}
