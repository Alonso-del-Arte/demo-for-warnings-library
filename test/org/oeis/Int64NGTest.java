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
     * Test of the toInt32 function, of the Int64 class.
     */
    @Test
    public void testToInt32() {
        System.out.println("toInt32");
        long source = RANDOM.nextLong() | Long.MIN_VALUE;
        while (source != 0) {
            int i = (int) source;
            Int64 instance = new Int64(i);
            Int32 expected = new Int32(i);
            Int32 actual = instance.toInt32();
            assertEquals(actual, expected);
            source >>>= 1;
        }
    }

    /**
     * Test of the toInt64 function, of the Int64 class.
     */
    @Test
    public void testToInt64() {
        System.out.println("toInt64");
        for (int i = 1; i < 65; i++) {
            long n = RANDOM.nextLong() * i;
            Int64 expected = new Int64(n);
            Int64 actual = expected.toInt64();
            assertEquals(actual, expected);
        }
    }
    
}
