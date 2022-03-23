package com.brenodiogo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Solution solutionApp = new Solution();
        assertEquals(2, solutionApp.brokenCalc(2, 3));
        assertEquals(2, solutionApp.brokenCalc(5, 8));
        assertEquals(3, solutionApp.brokenCalc(3, 10));
        assertEquals(39, solutionApp.brokenCalc(1, 1000000000));
    }
}
