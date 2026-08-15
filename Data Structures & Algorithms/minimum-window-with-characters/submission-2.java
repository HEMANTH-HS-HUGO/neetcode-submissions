class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> shm = new HashMap<>();
        Map<Character, Integer> thm = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            thm.put(c, thm.getOrDefault(c, 0) + 1);
        }

        int need = thm.size();
        int have = 0;

        int i = 0;
        int len = Integer.MAX_VALUE;
        int start = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            shm.put(c, shm.getOrDefault(c, 0) + 1);

            if (thm.containsKey(c) &&
                shm.get(c).intValue() == thm.get(c).intValue()) {
                have++;
            }

            while (have == need) {

                if (j - i + 1 < len) {
                    len = j - i + 1;
                    start = i;
                }

                char leftChar = s.charAt(i);

                shm.put(leftChar, shm.get(leftChar) - 1);

                if (thm.containsKey(leftChar) &&
                    shm.get(leftChar) < thm.get(leftChar)) {
                    have--;
                }

                i++;
            }
        }

        return len == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + len);
    }
}