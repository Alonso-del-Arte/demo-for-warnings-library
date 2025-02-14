/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oeis;

import static org.oeis.IntegerWrapperNGTest.RANDOM;
import static org.oeis.IntegerWrapperNGTest.randomPowerOfTwo;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 * Test of the Int64 class.
 * @author Alonso del Arte
 */
public class Int64NGTest {
    
    /**
     * Test of the toInt8 function, of the Int64 class.
     */
    @Test
    public void testToInt8() {
        System.out.println("toInt8");
        long source = RANDOM.nextLong() | randomPowerOfTwo();
        while (source != 0) {
            byte b = (byte) source;
            Int64 instance = new Int64(b);
            Int8 expected = new Int8(b);
            Int8 actual = instance.toInt8();
            assertEquals(actual, expected);
            source >>>= 8;
        }
    }

    /**
     * Test of the toInt16 function, of the Int64 class.
     */
    @Test
    public void testToInt16() {
        System.out.println("toInt16");
        long source = RANDOM.nextLong() | randomPowerOfTwo();
        while (source != 0) {
            short sh = (short) source;
            Int64 instance = new Int64(sh);
            Int16 expected = new Int16(sh);
            Int16 actual = instance.toInt16();
            assertEquals(actual, expected);
            source >>>= 16;
        }
    }

    /**
     * Test of toInt32 method, of class Int64.
     */
//    @Test
    public void testToInt32() {
        System.out.println("toInt32");
        Int64 instance = null;
        Int32 expResult = null;
        Int32 result = instance.toInt32();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toInt64 method, of class Int64.
     */
//    @Test
    public void testToInt64() {
        System.out.println("toInt64");
        Int64 instance = null;
        Int64 expResult = null;
        Int64 result = instance.toInt64();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
