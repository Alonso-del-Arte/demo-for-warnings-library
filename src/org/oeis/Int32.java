/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oeis;

import org.testframe.annotations.warnings.NarrowingConversionWarning;

/**
 *
 * @author Alonso del Arte
 */
public class Int32 {
    
    private final int heldInteger;
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    @NarrowingConversionWarning(sourceType = Int32.class, 
            targetType = Int8.class)
    public Int8 toInt8() {
        return new Int8((byte) 0);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int16 toInt16() {
        return new Int16((short) 0);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int32 toInt32() {
        return new Int32(0);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int64 toInt64() {
        return new Int64(0);
    }
    
    public Int32(int i) {
        this.heldInteger = i;
    }
    
}
