class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<strs.length;i++){           
            if(strs[i].length() < min){
                min = strs[i].length();
            }
        }
        System.out.println(min);
        String op="";
        for(int j=0;j<min;j++){
            boolean flag = true;
            char s = strs[0].charAt(j);
            System.out.println(s);
            for(int k=1;k<strs.length;k++){
                if (s != strs[k].charAt(j)){
                    flag = false;
                    break;
                }
            }
            if (!flag){
                break;
            }
            op += s;

        }
        return op;
    }
}