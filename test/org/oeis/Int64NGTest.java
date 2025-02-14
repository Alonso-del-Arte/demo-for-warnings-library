/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oeis;

import static org.oeis.IntegerWrapperNGTest.RANDOM;

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
        long n = RANDOM.nextLong();
        Int64 instance = new Int64(n);
        Int8 expected = new Int8((byte) n);
        Int8 actual = instance.toInt8();
        assertEquals(actual, expected);
    }

    /**
     * Test of toInt16 method, of class Int64.
     */
//    @Test
    public void testToInt16() {
        System.out.println("toInt16");
        Int64 instance = null;
        Int16 expResult = null;
        Int16 result = instance.toInt16();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
