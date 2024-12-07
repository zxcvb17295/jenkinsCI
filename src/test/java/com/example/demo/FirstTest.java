package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    @Test
    void test_1() {
        assertEquals(1, 1);
    }

    @Test
    void test_2() {
        assertEquals(1, 1);
    }

    @Test
    void test_3() {
        assertEquals(1, 1);
    }
    @Test
    void test_4() {
        assertEquals(2, 1);
        assertEquals(1, 1);
        assertEquals(1, 1);
        assertEquals(1, 1);
        assertEquals(1, 1);
    }
}
