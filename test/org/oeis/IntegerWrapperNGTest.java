/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oeis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static org.testframe.api.Asserters.assertThrows;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 * Tests of the IntegerWrapper class.
 * @author Alonso del Arte
 */
public class IntegerWrapperNGTest {
    
    static final Random RANDOM = new Random();
    
    private static final char MINUS_SIGN = '\u2212';
    
    private static final short MAX_BYTE_EXCESS = Short.MAX_VALUE 
            - Byte.MAX_VALUE;
    
    private static final int MAX_SHORT_EXCESS = Integer.MAX_VALUE 
            - Short.MAX_VALUE;
    
    private static final long MAX_INT_EXCESS = Long.MAX_VALUE 
            - Integer.MAX_VALUE;
    
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
    
    @Test
    public void testEquals() {
        System.out.println("equals");
        long num = RANDOM.nextLong();
        IntegerWrapper someNumber = new IntegerWrapperImpl(num);
        IntegerWrapper sameNumber = new IntegerWrapperImpl(num);
        String msg = someNumber.toString() + " should equal " 
                + sameNumber.toString();
        assert someNumber.equals(sameNumber) : msg;
    }
    
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int capacity = RANDOM.nextInt(64) + 16;
        Set<IntegerWrapper> numbers = new HashSet<>(capacity);
        Set<Integer> hashes = new HashSet<>(capacity);
        for (int i = 0; i < capacity; i++) {
            int num = RANDOM.nextInt() + i;
            IntegerWrapper number = new IntegerWrapperImpl(num);
            numbers.add(number);
            hashes.add(number.hashCode());
        }
        int expected = numbers.size();
        int actual = hashes.size();
        String message = "Number of numbers should match number of hash codes";
        assertEquals(actual, expected, message);
    }
    
    /**
     * Test of the get8BitPrimitive function, of the IntegerWrapper class.
     */
    @Test
    public void testGet8BitPrimitive() {
        System.out.println("get8BitPrimitive");
        int shift = 8 * RANDOM.nextInt(4);
        byte expected = (byte) (RANDOM.nextInt() >> shift);
        IntegerWrapper instance = new IntegerWrapperImpl(expected);
        byte actual = instance.get8BitPrimitive();
        assertEquals(actual, expected);
    }
    
    @Test
    public void testOutOf8BitRangeLowCausesException() {
        int outOfByteRangeNum = Byte.MIN_VALUE - RANDOM.nextInt(MAX_BYTE_EXCESS) 
                - 1;
        IntegerWrapper instance = new IntegerWrapperImpl(outOfByteRangeNum);
        String msg = "Number " + outOfByteRangeNum 
                + " is outside the range of byte";
        Throwable t = assertThrows(() -> {
            byte badResult = instance.get8BitPrimitive();
            System.out.println(msg + ", not given result " + badResult);
        }, ArithmeticException.class, msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        assert !excMsg.isEmpty() : "Exception message should not be empty";
        String numStr = Integer.toString(outOfByteRangeNum);
        String containsMsg = "Exception message should contain \"" + numStr 
                + "\"";
        assert excMsg.contains(numStr) : containsMsg;
        System.out.println("\"" + excMsg + "\"");
    }

    @Test
    public void testOutOf8BitRangeHighCausesException() {
        int outOfByteRangeNum = Byte.MAX_VALUE + RANDOM.nextInt(MAX_BYTE_EXCESS) 
                + 1;
        IntegerWrapper instance = new IntegerWrapperImpl(outOfByteRangeNum);
        String msg = "Number " + outOfByteRangeNum 
                + " is outside the range of byte";
        Throwable t = assertThrows(() -> {
            byte badResult = instance.get8BitPrimitive();
            System.out.println(msg + ", not given result " + badResult);
        }, ArithmeticException.class, msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        assert !excMsg.isEmpty() : "Exception message should not be empty";
        String numStr = Integer.toString(outOfByteRangeNum);
        String containsMsg = "Exception message should contain \"" + numStr 
                + "\"";
        assert excMsg.contains(numStr) : containsMsg;
        System.out.println("\"" + excMsg + "\"");
    }

    /**
     * Test of the get16BitPrimitive function, of the IntegerWrapper class.
     */
    @Test
    public void testGet16BitPrimitive() {
        System.out.println("get16BitPrimitive");
        int propNum = RANDOM.nextInt();
        int maybeShifted = (RANDOM.nextBoolean()) ? propNum >> 16 : propNum;
        short expected = (short) maybeShifted;
        IntegerWrapper instance = new IntegerWrapperImpl(expected);
        short actual = instance.get16BitPrimitive();
        assertEquals(actual, expected);
    }

    @Test
    public void testOutOf16BitRangeLowCausesException() {
        int outOfShortRangeNum 
                = Short.MIN_VALUE - RANDOM.nextInt(MAX_SHORT_EXCESS) - 1;
        IntegerWrapper instance = new IntegerWrapperImpl(outOfShortRangeNum);
        String msg = "Number " + outOfShortRangeNum 
                + " is outside the range of short";
        Throwable t = assertThrows(() -> {
            short badResult = instance.get16BitPrimitive();
            System.out.println(msg + ", not given result " + badResult);
        }, ArithmeticException.class, msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        assert !excMsg.isEmpty() : "Exception message should not be empty";
        String numStr = Integer.toString(outOfShortRangeNum);
        String containsMsg = "Exception message should contain \"" + numStr 
                + "\"";
        assert excMsg.contains(numStr) : containsMsg;
        System.out.println("\"" + excMsg + "\"");
    }

    @Test
    public void testOutOf16BitRangeHighCausesException() {
        int outOfShortRangeNum 
                = Short.MAX_VALUE + RANDOM.nextInt(MAX_SHORT_EXCESS) + 1;
        IntegerWrapper instance = new IntegerWrapperImpl(outOfShortRangeNum);
        String msg = "Number " + outOfShortRangeNum 
                + " is outside the range of byte";
        Throwable t = assertThrows(() -> {
            short badResult = instance.get16BitPrimitive();
            System.out.println(msg + ", not given result " + badResult);
        }, ArithmeticException.class, msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        assert !excMsg.isEmpty() : "Exception message should not be empty";
        String numStr = Integer.toString(outOfShortRangeNum);
        String containsMsg = "Exception message should contain \"" + numStr 
                + "\"";
        assert excMsg.contains(numStr) : containsMsg;
        System.out.println("\"" + excMsg + "\"");
    }

    /**
     * Test of the get32BitPrimitive function, of the IntegerWrapper class.
     */
    @Test
    public void testGet32BitPrimitive() {
        System.out.println("get32BitPrimitive");
        int expected = RANDOM.nextInt();
        IntegerWrapper instance = new IntegerWrapperImpl(expected);
        int actual = instance.get32BitPrimitive();
        assertEquals(actual, expected);
    }

    @Test
    public void testOutOf32BitRangeLowCausesException() {
        long outOfIntRangeNum = ((long) Integer.MIN_VALUE) 
                - (RANDOM.nextInt() & Integer.MAX_VALUE) - 1;
        IntegerWrapper instance = new IntegerWrapperImpl(outOfIntRangeNum);
        String msg = "Number " + outOfIntRangeNum 
                + " is outside the range of int";
        Throwable t = assertThrows(() -> {
            int badResult = instance.get32BitPrimitive();
            System.out.println(msg + ", not given result " + badResult);
        }, ArithmeticException.class, msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        assert !excMsg.isEmpty() : "Exception message should not be empty";
        String numStr = Long.toString(outOfIntRangeNum);
        String containsMsg = "Exception message should contain \"" + numStr 
                + "\"";
        assert excMsg.contains(numStr) : containsMsg;
        System.out.println("\"" + excMsg + "\"");
    }

    @Test
    public void testOutOf32BitRangeHighCausesException() {
        long outOfIntRangeNum = ((long) Integer.MAX_VALUE) 
                + (RANDOM.nextInt() & Integer.MAX_VALUE) + 1;
        IntegerWrapper instance = new IntegerWrapperImpl(outOfIntRangeNum);
        String msg = "Number " + outOfIntRangeNum 
                + " is outside the range of int";
        Throwable t = assertThrows(() -> {
            int badResult = instance.get32BitPrimitive();
            System.out.println(msg + ", not given result " + badResult);
        }, ArithmeticException.class, msg);
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        assert !excMsg.isEmpty() : "Exception message should not be empty";
        String numStr = Long.toString(outOfIntRangeNum);
        String containsMsg = "Exception message should contain \"" + numStr 
                + "\"";
        assert excMsg.contains(numStr) : containsMsg;
        System.out.println("\"" + excMsg + "\"");
    }

    /**
     * Test of the get64BitPrimitive function, of the IntegerWrapper class.
     */
    @Test
    public void testGet64BitPrimitive() {
        System.out.println("get64BitPrimitive");
        long expected = RANDOM.nextLong();
        IntegerWrapper instance = new IntegerWrapperImpl(expected);
        long actual = instance.get64BitPrimitive();
        assertEquals(actual, expected);
    }
    
    private static long getDiffLong(long n) {
        long propNum = n;
        while (propNum == n) {
            propNum = RANDOM.nextLong();
        }
        return propNum;
    }
    
    @Test
    public void testNotArithmeticallyEqual() {
        long numberA = RANDOM.nextLong();
        long numberB = getDiffLong(numberA);
        IntegerWrapper someNumber = new IntegerWrapperImpl(numberA);
        IntegerWrapper diffNumber = new IntegerWrapperImpl(numberB);
        String msg = someNumber.toString() 
                + " should not be arithmetically equal to " 
                + diffNumber.toString();
        assert !someNumber.arithmeticallyEqual(diffNumber) : msg;
    }

    /**
     * Test of the arithmeticallyEqual function, of the IntegerWrapper class.
     */
    @Test
    public void testArithmeticallyEqual() {
        System.out.println("arithmeticallyEqual");
        long num = RANDOM.nextLong();
        IntegerWrapper instanceImpl = new IntegerWrapperImpl(num);
        IntegerWrapper instanceAnon = new IntegerWrapper(num) {
        };
        String msg = instanceImpl.toString() + " of class " 
                + instanceImpl.getClass().getName() 
                + " should be arithmetically equal to " 
                + instanceAnon.toString() + " of class " 
                + instanceAnon.getClass().getName();
        assert instanceImpl.arithmeticallyEqual(instanceAnon) : msg;
    }

    /**
     * Test of the compareTo function, of the IntegerWrapper class.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        int capacity = RANDOM.nextInt(8) + 2;
        List<IntegerWrapper> expected = new ArrayList<>(capacity);
        int bound = 2 * Short.MAX_VALUE / capacity;
        for (int i = Short.MIN_VALUE; i < Short.MAX_VALUE; 
                i += RANDOM.nextInt(bound)) {
            expected.add(new IntegerWrapperImpl(i));
        }
        List<IntegerWrapper> actual = new ArrayList<>(expected);
        Collections.shuffle(actual);
        Collections.sort(actual);
        assertEquals(actual, expected);
    }

    private static class IntegerWrapperImpl extends IntegerWrapper {

        public IntegerWrapperImpl(long num) {
            super(num);
        }
    }
    
}
