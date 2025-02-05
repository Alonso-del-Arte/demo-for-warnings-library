/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oeis;

import java.util.Random;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 * Tests of the IntegerWrapper class.
 * @author Alonso del Arte
 */
public class IntegerWrapperNGTest {
    
    static final Random RANDOM = new Random();
    
    private static final char MINUS_SIGN = '\u2212';
    
    @Test
    public void testToString() {
        System.out.println("toString");
        long num = RANDOM.nextLong() & Long.MAX_VALUE;
        IntegerWrapper instance = new IntegerWrapperImpl(num);
        String expected = Long.toString(num);
        String actual = instance.toString();
        assertEquals(actual, expected);
    }
    
    @Test
    public void testToStringNegative() {
        long num = RANDOM.nextLong() | Long.MIN_VALUE;
        IntegerWrapper instance = new IntegerWrapperImpl(num);
        String expected = Long.toString(num).replace('-', MINUS_SIGN);
        String actual = instance.toString();
        assertEquals(actual, expected);
    }
    
    @Test
    public void testReferentialEquality() {
        long num = RANDOM.nextLong();
        IntegerWrapper instance = new IntegerWrapperImpl(num);
        String msg = instance.toString() + " should be equal to itself";
        assert instance.equals(instance) : msg;
    }
    
    private static Object provideNull() {
        return null;
    }
    
    @Test
    public void testNotEqualsNull() {
        long num = RANDOM.nextLong();
        IntegerWrapper instance = new IntegerWrapperImpl(num);
        String msg = instance.toString() + " should not equal null";
        assert !instance.equals(provideNull()) : msg;
    }
    
    @Test
    public void testNotEqualsDiffClass() {
        long num = RANDOM.nextLong();
        IntegerWrapper instanceImpl = new IntegerWrapperImpl(num);
        IntegerWrapper instanceAnon = new IntegerWrapper(num) {
        };
        String msg = instanceImpl.toString() + " of class " 
                + instanceImpl.getClass().getName() + " should not equal " 
                + instanceAnon.toString() + " of class " 
                + instanceAnon.getClass().getName();
        assert !instanceImpl.equals(instanceAnon) : msg;
    }
    
    @Test
    public void testNotEqualsDiffNum() {
        long numA = RANDOM.nextLong();
        long numB = (numA >> 32) + 1;
        IntegerWrapper instanceA = new IntegerWrapperImpl(numA);
        IntegerWrapper instanceB = new IntegerWrapperImpl(numB);
        String msg = instanceA.toString() + " should not equal " 
                + instanceB.toString();
        assert !instanceA.equals(instanceB) : msg;
    }
    
    /**
     * Test of get8BitPrimitive method, of class IntegerWrapper.
     */
//    @Test
    public void testGet8BitPrimitive() {
        System.out.println("get8BitPrimitive");
        IntegerWrapper instance = null;
        byte expResult = 0;
//        byte result = instance.get8BitPrimitive();
//        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get16BitPrimitive method, of class IntegerWrapper.
     */
//    @Test
    public void testGet16BitPrimitive() {
        System.out.println("get16BitPrimitive");
        IntegerWrapper instance = null;
        short expResult = 0;
//        short result = instance.get16BitPrimitive();
//        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get32BitPrimitive method, of class IntegerWrapper.
     */
//    @Test
    public void testGet32BitPrimitive() {
        System.out.println("get32BitPrimitive");
        IntegerWrapper instance = null;
        int expResult = 0;
//        int result = instance.get32BitPrimitive();
//        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get64BitPrimitive method, of class IntegerWrapper.
     */
//    @Test
    public void testGet64BitPrimitive() {
        System.out.println("get64BitPrimitive");
        IntegerWrapper instance = null;
        long expResult = 0L;
//        long result = instance.get64BitPrimitive();
//        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arithmeticallyEqual method, of class IntegerWrapper.
     */
//    @Test
    public void testArithmeticallyEqual() {
        System.out.println("arithmeticallyEqual");
        IntegerWrapper other = null;
        IntegerWrapper instance = null;
        boolean expResult = false;
//        boolean result = instance.arithmeticallyEqual(other);
//        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class IntegerWrapper.
     */
//    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        IntegerWrapper other = null;
        IntegerWrapper instance = null;
        int expResult = 0;
//        int result = instance.compareTo(other);
//        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private static class IntegerWrapperImpl extends IntegerWrapper {

        public IntegerWrapperImpl(long num) {
            super(num);
        }
    }
    
}
