class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        ArrayList<Integer> prefix = new ArrayList<>();
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        prefix.add(0);
        for(int i=0;i<words.length;i++){

            if((vowels.contains(words[i].charAt(0))) && (vowels.contains(words[i].charAt(words[i].length()-1)))){
                if(i == 0){
                    prefix.add(1);
                }
                else{
                    prefix.add(prefix.get(i)+1);
                }
            }
            else{
                if(i == 0){
                    prefix.add(0);
                }
                else{
                    prefix.add(prefix.get(i));
                }
            }
        }
        System.out.print(prefix);

        List<Integer> list = new ArrayList<>();


        for(int i=0;i<queries.length;i++){
            
            int diff = prefix.get((queries[i][1]) + 1 ) - prefix.get((queries[i][0]));

            list.add(diff);
        }
        
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}