package com.sapient.asde.service;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
@Tag("MyStringTest")
class MyStringTest {
    private MyString myString;
    @BeforeEach
    void setUp() {
        myString = new MyString("MalayalaM");
    }
    @AfterEach
    void tearDown() {
        myString = null;
    }
    @Test
    @DisplayName("palindrome")
    void isPalindrome() {
        assertTrue(myString.isPalindrome());
        MyString str = new MyString();
        assertTrue(str.isPalindrome());
    }
    @Test
    @DisplayName("getAcronym")
    void getAcronym() {
        assertEquals("M", myString.getAcronym());
        MyString str = new MyString("welcome to java");
        assertEquals("WTJ", str.getAcronym());
    }
    @Test
    @DisplayName("nOccurences")
    void nOccurrences() {
        assertEquals(2, myString.nOccurrences('M'));
        MyString str = new MyString();
        assertNull(str.nOccurrences(null));
    }
}