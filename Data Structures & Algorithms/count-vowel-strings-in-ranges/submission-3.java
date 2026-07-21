class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int n = words.length;

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {

            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);

            boolean isVowelWord =
                    isVowel(first) && isVowel(last);

            prefix[i + 1] = prefix[i] + (isVowelWord ? 1 : 0);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int left = queries[i][0];
            int right = queries[i][1];

            ans[i] = prefix[right + 1] - prefix[left];
        }

        return ans;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u';
    }
}