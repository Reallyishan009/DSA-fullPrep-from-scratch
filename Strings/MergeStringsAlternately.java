package Strings;

class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int n = word1.length();
        int m = word2.length();

        int i = 0, j = 0;

        while (i < n || j < m) {
            if (i < n) result.append(word1.charAt(i++));
            if (j < m) result.append(word2.charAt(j++));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String a = "pqr";
        String b = "abc";
        System.out.println(mergeAlternately(a, b));
    }
}
