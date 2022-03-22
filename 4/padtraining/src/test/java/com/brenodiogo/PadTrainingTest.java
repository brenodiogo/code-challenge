package com.brenodiogo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PadTrainingTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() {
      assertEquals("6371956289367449331922", PadTraining.encrypt("24955184247696969", "637197877682780836504704874690100607768768"));
    }
      
      @Test
    public void test2() {
      assertEquals("Error: Key IDs don't match.", PadTraining.decrypt("6371956289367449331922", "442878365779404250678127528855846163827272"));
    }
      
      @Test
    public void test3() {
      assertEquals("24955184247696969", PadTraining.decrypt("6371956289367449331922", "637197877682780836504704874690100607768768"));
    }
}
