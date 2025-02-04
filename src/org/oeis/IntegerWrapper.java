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
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public byte get8BitPrimitive() {
        return 0;
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
    public String toString() {
        return Long.toString(this.heldLong).replace('-', MINUS_SIGN);
    }

    IntegerWrapper(long num) {
        this.heldLong = num;
    }
    
}
