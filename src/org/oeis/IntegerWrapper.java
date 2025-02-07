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
    
    /**
     * Determines whether or not this number is arithmetically equal to another 
     * instance of {@code IntegerWrapper}. Unlike {@link 
     * #equals(java.lang.Object) equals()}, the other number's runtime class is 
     * not taken into account to make the determination. For the examples, 
     * suppose this is instance is an {@link Int8} representing the number 120.
     * @param other The number to compare for arithmetic equality. Examples: an 
     * {@link Int16} holding 120, an {@link Int32} holding &minus;120 and an 
     * {@link Int64} holding 120.
     * @return True if the number is arithmetically equal, false otherwise. In 
     * the examples, this would be true for the {@code Int16} and the {@code 
     * Int64} instances but not the {@code Int32} instance which is said to hold 
     * &minus;120, not 120.
     * @throws NullPointerException If {@code other} is null. The exception 
     * message might also be null depending on the version of the Java Virtual 
     * Machine.
     */
    public boolean arithmeticallyEqual(IntegerWrapper other) {
        return this.heldLong == other.heldLong;
    }
    
    @Override
    public int compareTo(IntegerWrapper other) {
        return Long.compare(this.heldLong, other.heldLong);
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
