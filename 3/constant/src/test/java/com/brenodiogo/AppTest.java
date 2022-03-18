package com.brenodiogo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() {
        assertEquals(5, App.kaprekar(1112));
    }

    @Test
    public void test2() {
        assertEquals(7, App.kaprekar(456));
    }

    @Test
    public void test3() {
        assertEquals(3, App.kaprekar(76));
    }

    @Test
    public void test4() {
        assertEquals(5, App.kaprekar(100));
    }

    @Test
    public void test5() {
        assertEquals(4, App.kaprekar(101));
    }
}
