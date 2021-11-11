package com.enroute.longestpalindrome;

import java.io.Serializable;

public class LongestPalindrome {

    public String longestPalindrome(String str) {

        if (str.length() <= 1) {
            return str;
        }

        int n = str.length();
        int lpStart = 0;
        int lpLength = 1;

        boolean[][] isPalindromeTable = new boolean[n][n];

        for (int i = 0; i < n; ++i) {
            isPalindromeTable[i][i] = true;
        }

        for (int i = 0; i < n - 1; ++i) {
            final char ci = str.charAt(i);
            final char cj = str.charAt(i + 1);

            if (ci == cj) {
                isPalindromeTable[i][i + 1] = true;
                lpStart = i;
                lpLength = 2;
            }

        }

        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k -1;

                final char ci = str.charAt(i);
                final char cj = str.charAt(j);
                if (isPalindromeTable[i + 1][j - 1] && ci == cj) {
                    isPalindromeTable[i][j] = true;

                    if (k > lpLength) {
                        lpStart = i;
                        lpLength = k;
                    }
                }
            }
        }

        xxx(isPalindromeTable, str);

        return str.substring(lpStart, lpStart + lpLength);

    }

    private void xxx(boolean[][] isPalindromeTable, String str) {
        for (int i = 0; i < isPalindromeTable.length; i++) {
            for (int j = 0; j < isPalindromeTable.length; j++) {
                final char l = isPalindromeTable[j][i] ? str.charAt(j) : ' ';
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
