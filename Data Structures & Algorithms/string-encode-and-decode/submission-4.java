class Solution {

    public String encode(List<String> strs) {
        String encode = "";
        
        for(String str : strs){
            int len = str.length();
            System.out.println(str);
            System.out.println(str.length());
            encode += len+"#"+str;
        }

        return encode;
    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();
    
       int i=0;
       while(i<str.length()){
        int index =  str.indexOf('#', i); // this method gives the post i '#'
        int len = Integer.parseInt(str.substring(i,index));
        i = index+1;
        String word = str.substring(i,i+len);
        decode.add(word);
        i = i+len;

       }
        return decode;
    }
}
