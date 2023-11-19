package org.example.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        char symbol;
        int minLength = strs[0].length();
        boolean isTrue = true;
        for (int j = 0; j < minLength; j++) {
            symbol = strs[0].charAt(j);
            for (String str : strs) {
                if (str.length() < minLength) minLength = str.length();

                if (str.isEmpty() || str.charAt(j) != symbol) {
                    isTrue = false;
                }
            }
            if (isTrue) {
                result.append(symbol);
            } else break;
        }
        return result.toString();
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
