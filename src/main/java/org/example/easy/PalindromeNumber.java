package org.example.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] array = String.valueOf(x).toCharArray();
        boolean isTrue = false;
        int count = 0;
        if (x > -1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[array.length - 1 - i]) {
                    count += 1;
                }
            }
            if (count == array.length || count == array.length - 1){
                isTrue = true;
            }
        } else {
            return false;
        }
        return isTrue;
    }
}
