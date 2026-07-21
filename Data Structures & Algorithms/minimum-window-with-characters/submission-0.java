class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 0;
        int sIndex = -1;
        int minlen = Integer.MAX_VALUE;
        int n = s.length();
        int m = t.length();

        for(int i=0;i<256;i++){
            hm.put((char) i, 0);
        }
        
        for(int i=0;i<m;i++){
            char c = t.charAt(i);
            hm.put(c, hm.get(c)+1);
        }

        int i=0;
        int j=i;
        while(j<n){
            
            char c = s.charAt(j);
            if(hm.get(c) > 0){
                count++;
                }
            hm.put(c, hm.get(c)-1);
            while(count == m){

                if(j-i+1 < minlen){
                    minlen = j-i+1;
                    sIndex = i; 
                }
                char left = s.charAt(i);
                hm.put(left, hm.get(left)+1);
                if(hm.get(left) > 0){
                    count--;
                }
                i++;
            }

            j++;
            
        }

        return sIndex == -1 ? "" : s.substring(sIndex,sIndex+minlen);
    }
}
