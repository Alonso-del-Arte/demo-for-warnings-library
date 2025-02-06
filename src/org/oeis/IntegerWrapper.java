/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oeis;

/**
 * Wraps integer primitives.
 * @author Alonso del Arte
 */
public abstract class IntegerWrapper implements Comparable<IntegerWrapper> {
    
    private static final char MINUS_SIGN = '\u2212';
    
    final long heldLong;
    
    public byte get8BitPrimitive() {
        if (this.heldLong < Byte.MIN_VALUE || this.heldLong > Byte.MAX_VALUE) {
            String excMsg = "Number " + this.heldLong 
                    + " is outside the range of byte";
            throw new ArithmeticException(excMsg);
        }
        return (byte) this.heldLong;
    }
    
    public short get16BitPrimitive() {
        if (this.heldLong < Short.MIN_VALUE 
                || this.heldLong > Short.MAX_VALUE) {
            String excMsg = "Number " + this.heldLong 
                    + " is outside the range of short";
            throw new ArithmeticException(excMsg);
        }
        return (short) this.heldLong;
    }
    
    public int get32BitPrimitive() {
        if (this.heldLong < Integer.MIN_VALUE 
                || this.heldLong > Integer.MAX_VALUE) {
            String excMsg = "Number " + this.heldLong 
                    + " is outside the range of int";
            throw new ArithmeticException(excMsg);
        }
        return (int) this.heldLong;
    }
    
    public long get64BitPrimitive() {
        return this.heldLong;
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public boolean arithmeticallyEqual(IntegerWrapper other) {
        return false;
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    @Override
    public int compareTo(IntegerWrapper other) {
        return 0;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }
        return this.heldLong == ((IntegerWrapper) obj).heldLong;
    }
    
    @Override
    public int hashCode() {
        return (int) this.heldLong;
    }
    
    @Override
    public String toString() {
        return Long.toString(this.heldLong).replace('-', MINUS_SIGN);
    }

    IntegerWrapper(long num) {
        this.heldLong = num;
    }
    
}
