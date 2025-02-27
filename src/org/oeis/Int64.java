/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.oeis;

import org.testframe.annotations.warnings.NarrowingConversionWarning;

/**
 * Wraps a 64-bit integer primitive.
 * @author Alonso del Arte
 */
public class Int64 extends IntegerWrapper {
    
    @NarrowingConversionWarning(sourceType = Int64.class, 
            targetType = Int8.class)
    @Override
    public Int8 toInt8() {
        return new Int8((byte) this.heldLong);
    }
    
    @NarrowingConversionWarning(sourceType = Int64.class, 
            targetType = Int16.class)
    @Override
    public Int16 toInt16() {
        return new Int16((short) this.heldLong);
    }
    
    @NarrowingConversionWarning(sourceType = Int64.class, 
            targetType = Int32.class)
    @Override
    public Int32 toInt32() {
        return new Int32((int) this.heldLong);
    }
    
    @Override
    public Int64 toInt64() {
        return this;
    }
    
    public Int64(long n) {
        super(n);
    }
    
}
