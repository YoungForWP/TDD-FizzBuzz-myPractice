package com.tw.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void test_when_number_is_1() throws Exception {
        assertEquals("1", count(1));
    }

    @Test
    public void test_when_number_is_2() throws Exception {
        assertEquals("2", count(2));
    }

    private String count(int number) {
        return String.valueOf(number);
    }
}
