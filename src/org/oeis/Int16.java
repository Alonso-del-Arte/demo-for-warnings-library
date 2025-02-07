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
public class Int16 extends IntegerWrapper {
    
    private final short heldShort;
    
    /**
     * Converts to an 8-bit integer.
     * @return An 8-bit integer.
     */
    // TODO: Write tests for this
    @NarrowingConversionWarning(sourceType = Int16.class, 
            targetType = Int8.class)
    @org.testframe.annotations.warnings.Untested
    @Override
    public Int8 toInt8() {
        return new Int8((byte) -1);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    @Override
    public Int16 toInt16() {
        return new Int16((short) -1);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    @Override
    public Int32 toInt32() {
        return new Int32(-1);
    }
    
    // TODO: Write tests for this
    @org.testframe.annotations.warnings.Untested
    @Override
    public Int64 toInt64() {
        return new Int64(-1);
    }
    
    public Int16(short sh) {
        super(sh);
        this.heldShort = sh;
    }
    
}
