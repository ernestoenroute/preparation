package com.enroute.longestpalindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    @Test
    public void longestPalindrome() {
        String str = "siempreanitalavalatinaconjabon";

        LongestPalindrome longestPalindrome = new LongestPalindrome();

        final String s = longestPalindrome.longestPalindrome(str);

        assertEquals("anitalavalatina", s);
    }

    @Test
    public void longestPalindrome2() {
        String str = "aana";

        LongestPalindrome longestPalindrome = new LongestPalindrome();

        final String s = longestPalindrome.longestPalindrome(str);

        assertEquals("ana", s);
    }
}