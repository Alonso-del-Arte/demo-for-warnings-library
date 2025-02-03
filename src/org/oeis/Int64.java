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
public class Int64 {
    
    public final long heldLong;
    
    // TODO: Write tests for this
    @NarrowingConversionWarning(sourceType = Int64.class, 
            targetType = Int8.class)
    @org.testframe.annotations.warnings.Untested
    public Int8 toInt8() {
        return new Int8(Byte.MAX_VALUE);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int16 toInt16() {
        return new Int16(Short.MAX_VALUE);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int32 toInt32() {
        return new Int32(Integer.MAX_VALUE);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    public Int64 toInt64() {
        return new Int64(Long.MAX_VALUE);
    }
    
    public Int64(long n) {
        this.heldLong = n;
    }
    
}
