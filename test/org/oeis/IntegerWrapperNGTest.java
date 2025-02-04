/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oeis;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Alonso del Arte
 */
public class IntegerWrapperNGTest {
    
    public IntegerWrapperNGTest() {
    }

    /**
     * Test of get8BitPrimitive method, of class IntegerWrapper.
     */
    @Test
    public void testGet8BitPrimitive() {
        System.out.println("get8BitPrimitive");
        IntegerWrapper instance = null;
        byte expResult = 0;
        byte result = instance.get8BitPrimitive();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get16BitPrimitive method, of class IntegerWrapper.
     */
    @Test
    public void testGet16BitPrimitive() {
        System.out.println("get16BitPrimitive");
        IntegerWrapper instance = null;
        short expResult = 0;
        short result = instance.get16BitPrimitive();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get32BitPrimitive method, of class IntegerWrapper.
     */
    @Test
    public void testGet32BitPrimitive() {
        System.out.println("get32BitPrimitive");
        IntegerWrapper instance = null;
        int expResult = 0;
        int result = instance.get32BitPrimitive();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get64BitPrimitive method, of class IntegerWrapper.
     */
    @Test
    public void testGet64BitPrimitive() {
        System.out.println("get64BitPrimitive");
        IntegerWrapper instance = null;
        long expResult = 0L;
        long result = instance.get64BitPrimitive();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arithmeticallyEqual method, of class IntegerWrapper.
     */
    @Test
    public void testArithmeticallyEqual() {
        System.out.println("arithmeticallyEqual");
        IntegerWrapper other = null;
        IntegerWrapper instance = null;
        boolean expResult = false;
        boolean result = instance.arithmeticallyEqual(other);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class IntegerWrapper.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        IntegerWrapper other = null;
        IntegerWrapper instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IntegerWrapperImpl extends IntegerWrapper {

        public IntegerWrapperImpl() {
            super(0L);
        }
    }
    
}
