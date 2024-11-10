package com.eragapati.pi_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PITServiceTest {

    @Test
    void whenPalindrom_thenAccept() {
        PITService palindromeTester = new PITService();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }
    @Test
    void whenNotPalindrom_thanReject() {
        PITService palindromeTester = new PITService();
        assertFalse(palindromeTester.isPalindrome("box"));
    }
    @Test
    void whenNearPalindrom_thanReject() {
        PITService palindromeTester = new PITService();
        assertFalse(palindromeTester.isPalindrome("neon"));
    }
}