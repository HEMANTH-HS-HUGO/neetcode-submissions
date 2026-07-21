class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        char[] char1 = s.toCharArray();
        Arrays.sort(char1);
        System.out.println(char1);
        char[] char2 = t.toCharArray();
        Arrays.sort(char2);
        System.out.println(char2);
        return Arrays.equals(char1,char2);


    }
}
