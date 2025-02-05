/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oeis;

/**
 *
 * @author Alonso del Arte
 */
public abstract class IntegerWrapper implements Comparable<IntegerWrapper> {
    
    private static final char MINUS_SIGN = '\u2212';
    
    final long heldLong;
    
    public byte get8BitPrimitive() {
        if (this.heldLong < Byte.MIN_VALUE) {
            String excMsg = "Number " + this.heldLong 
                    + " is less than Byte.MIN_VALUE";
            throw new ArithmeticException(excMsg);
        }
        return (byte) this.heldLong;
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public short get16BitPrimitive() {
        return 0;
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public int get32BitPrimitive() {
        return 0;
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public long get64BitPrimitive() {
        return 0L;
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public boolean arithmeticallyEqual(IntegerWrapper other) {
        return true;
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
