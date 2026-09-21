class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> lst = new ArrayList<>();
        List<Map<Character, Integer>> lhm = new ArrayList<>();

        for (String str : strs) {

            Map<Character, Integer> hm = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }

            boolean found = false;

            for (int j = 0; j < lhm.size(); j++) {
                if (hm.equals(lhm.get(j))) {
                    lst.get(j).add(str);
                    found = true;
                    break;
                }
            }

            if (!found) {
                lhm.add(hm);

                List<String> newsublist = new ArrayList<>();
                newsublist.add(str);

                lst.add(newsublist);
            }
        }

        return lst;
    }
}