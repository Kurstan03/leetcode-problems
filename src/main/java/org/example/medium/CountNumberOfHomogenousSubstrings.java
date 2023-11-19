package org.example.medium;

public class CountNumberOfHomogenousSubstrings {
    public int countHomogenous(String s) {
        final long MOD = 1000000007;
        long count = 0;
        long consecutiveCount = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                consecutiveCount++;
            } else {
                count = (count + (consecutiveCount * (consecutiveCount + 1) / 2) % MOD) % MOD;
                consecutiveCount = 1;
            }
        }

        count = (count + (consecutiveCount * (consecutiveCount + 1) / 2) % MOD) % MOD;

        return (int)count;
    }
}
