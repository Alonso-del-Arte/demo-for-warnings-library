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
public class Int8 {
    
    private final byte heldByte;
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int8 toInt8() {
        return new Int8(Byte.MIN_VALUE);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int16 toInt16() {
        return new Int16(Short.MIN_VALUE);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int32 toInt32() {
        return new Int32(Integer.MIN_VALUE);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int64 toInt64() {
        return new Int64(Long.MIN_VALUE);
    }
    
    public Int8(byte b) {
        this.heldByte = b;
    }
    
}
